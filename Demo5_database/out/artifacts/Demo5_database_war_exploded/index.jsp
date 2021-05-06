<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/4/2021
  Time: 4:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<table style="width:50%">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>
    </tr>
    <c:forEach var="item" items="${requestScope.products}">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.price}</td>
            <td>${item.quantity}</td>
        </tr>
    </c:forEach>

    ${requestScope.message}
</table>
</body>

</html>
