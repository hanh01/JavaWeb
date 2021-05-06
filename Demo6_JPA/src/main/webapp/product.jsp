<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/5/2021
  Time: 1:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="w3-container">

    <table style="width: 50%">
        <c:set var="p" value="${requestScope.products}"/>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Category</th>
            <th>Color</th>
        </tr>
            <tr style="margin: 0">
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
                <td>${p.quantity}</td>
                <td>${p.category.name}</td>
                <td>
                    <c:forEach var="att" items="${p.attributes}">
                        ${att.name}
                    </c:forEach>
                </td>
            </tr>

    </table>
</div>

</body>
</html>
