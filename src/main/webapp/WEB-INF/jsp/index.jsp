<%--
  Created by IntelliJ IDEA.
  User: 蒋志鹏
  Date: 2018/6/7
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <title>Title</title>

    <style>
        h2{
            text-align: center;
        }
    </style>
</head>
<body>
<form action="${ctx}/user/LoginController/down.action" method="get">
    <input type="hidden" name="fileName" value="upload/2018-06-12/chrome-200.png">
    <img src="${ctx}/upload/2018-06-12/chrome-200.png">
    <input type="submit" value="下载">
</form>

登陆成功！
</body>
</html>
