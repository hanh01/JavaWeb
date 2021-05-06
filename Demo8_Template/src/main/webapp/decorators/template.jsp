<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/5/2021
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>

<html>

<head>
    <title><decorator:title/></title>
    <jsp:include page="head.jsp"/>
    <decorator:head/>
</head>


<body>
<jsp:include page="navigation.jsp"/>

<jsp:include page="header.jsp"/>

<decorator:body/>

<jsp:include page="footer.jsp"/>
</body>
</html>
