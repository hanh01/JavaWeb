<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/5/2021
  Time: 8:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="edit">
        <input type="number" value="${requestScope.products.id}" name="id" readonly><br/>
        <input type="text" value="${requestScope.products.name}" name="name"><br/>
        <input type="number" value="${requestScope.products.price}" name="price"><br/>
        <input type="number" value="${requestScope.products.quantity}" name="quantity"><br/>
        <input class="btn btn-primary" type="submit" value="Submit">
    </form>
</body>
</html>
