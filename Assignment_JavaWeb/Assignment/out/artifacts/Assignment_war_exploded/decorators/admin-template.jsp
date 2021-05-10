<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<html>
<head>
    <title><dec:title/></title>
    <jsp:include page="head.jsp"/>
    <decorator:head/>
</head>
<body>

<decorator:body/>

<jsp:include page="../scripts/js.jsp"/>
</body>
</html>
