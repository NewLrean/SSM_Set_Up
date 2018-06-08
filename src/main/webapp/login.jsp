<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<html >
<head>

    <style type="text/css">
        h2{
            text-align: center;
        }

        form{
            margin: 0 auto;
            width: 450px;
        }
    </style>


</head>
<body>
<h2>登录界面</h2>

<form action="/user/LoginController/login" method="post">
    <table align="center">
        <tr><td><input type="text" name="username" required="required"/></td></tr>
        <tr><td><input type="password" name="password" required="required"/></td></tr>
        <tr><td align="right"><input type="submit" value="登录"></td></tr>
    </table>



</form>
</body>
</html>
