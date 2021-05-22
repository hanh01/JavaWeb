<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<h1>All Employees</h1>
<br/>

<button style="margin-bottom: 25px">
    <a href="/create">Create</a>
</button><br/>

<div class="w3-container">
    <table class="w3-table w3-striped">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
<%--            <th>Action</th>--%>
        </tr>
        <c:forEach items="${employee}" var="p">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.wage}</td>
<%--                <td>--%>
<%--                    <a href="/delete?sid=${p.id}">Delete</a>--%>
<%--                </td>--%>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
