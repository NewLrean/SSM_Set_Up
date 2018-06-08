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

登陆成功！

<h2>以下是所有书籍</h2>
<table align="center" cellpadding="0" cellspacing="0">
<tr>
    <th>书籍名称</th>
    <th>单价</th>
    <th>作者</th>
    <th>图书类型</th>
    <th>操作</th>
</tr>

    <c:forEach items="${allBook}" var="b">
        <tr>
            <td>${b.title}</td>
            <td>${b.unitPrice}</td>
            <td>${b.author}</td>
            <td>${b.category.name}</td>
            <td></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
