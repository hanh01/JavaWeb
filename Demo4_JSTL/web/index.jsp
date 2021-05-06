<%--
Created by IntelliJ IDEA.
User: Admin
Date: 22/4/2021
Time: 2:13 PM
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>$Title$</title>
</head>
<body>
<c:import url="https://www.facebook.com/" var="url"/>
<%--<a href="${url}"></a>--%>

<c:set var="x" scope="session" value="${2*10}"/>
<c:out value="${x}"/>
<c:remove var="x"/>
<p>After Remove Value is: <c:out value="${x}"/></p>




</body>
</html>
