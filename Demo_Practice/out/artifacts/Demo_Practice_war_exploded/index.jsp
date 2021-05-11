<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/5/2021
  Time: 9:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="create.jsp">Create</a>
<br/>

<div class="w3-container">
    <table class="w3-table w3-striped">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Action</th>
        </tr>
        <c:forEach var="p" items="${requestScope.products}">
            <tr style="margin: 0">
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
                <td>${p.quantity}</td>
                <td>
                   <a href="edit?sid=${p.id}">Edit</a>
                   <a href="delete?sid=${p.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
