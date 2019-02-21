package com.jzp.controller;

import com.jzp.mapper.GoodsMapper;
import com.jzp.po.Goods;
import com.jzp.po.User;
import com.jzp.service.UserService;
import com.jzp.util.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by 蒋志鹏 on 2018/6/7.
 */

@Controller
@RequestMapping("/user/LoginController")
public class LoginController {

    @Resource
    UserService userService;

    
    @Resource
    GoodsMapper goodsmapper;

    @RequestMapping(value="/login", method= RequestMethod.POST)
    private String doSave(User user, HttpSession session){
    	
    	List<Goods> findAllGoods = goodsmapper.findAllGoods();
    	System.out.println(findAllGoods.get(0).getSpbm());
        /*redirect:*/
        return "WEB-INF/jsp/index";
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
