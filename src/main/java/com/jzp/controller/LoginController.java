package com.jzp.controller;

import com.jzp.po.Book;
import com.jzp.po.User;
import com.jzp.service.BookService;
import com.jzp.service.UserService;
import com.jzp.util.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 蒋志鹏 on 2018/6/7.
 */

@Controller
@RequestMapping("/user/LoginController")
public class LoginController {

    @Resource
    UserService userService;

    @Autowired
    BookService bookService;

    @RequestMapping(value="/login", method= RequestMethod.POST)
    private String doSave(User user, HttpSession session,Model model){
        System.out.println(user);

        User user1 = userService.selectBylogin(user.getUsername(), SecurityUtils.toMD5(user.getPassword()));

        if(user1!=null){
            List<Book> allBook = bookService.findAllBook();
            model.addAttribute("allBook",allBook);
            return "WEB-INF/jsp/index";
        }
        /*redirect:*/
        return "login";
    }


    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    private ModelAndView Upload(User user,MultipartFile file, HttpServletRequest request) throws IOException {
        String path = request.getSession().getServletContext().getRealPath("upload");
        System.out.println(user);
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String format = dateFormat.format(new Date());
        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        File dir = new File(path,format);
        if(!dir.exists()){
            dir.mkdirs();
        }

        //MultipartFile自带的解析方法
       /* file.transferTo(new File(dir,fileName));*/


        ModelAndView view=new ModelAndView("WEB-INF/jsp/index");

            return view;

    }

    @RequestMapping(value = "/down",method = RequestMethod.GET)
    @ResponseBody
    public void downfile(@RequestParam("fileName")String fileName, HttpServletRequest request, HttpServletResponse response){
        String file = request.getSession().getServletContext().getRealPath("/") + fileName;
        try {
            InputStream is = new BufferedInputStream(new FileInputStream(new File(file)));
            file=new String(file.getBytes("ISO8859-1"),"utf-8");
            response.addHeader("Content-Disposition", "attachment;filename=" + file);
            //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
            response.setContentType("multipart/form-data");
            BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
            int len = 0;
            byte [] b=new byte[1024];
            while((len = is.read()) != -1){
                out.write(b,0,len);
                out.flush();
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
