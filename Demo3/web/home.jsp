<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 20/4/2021
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.print("Welcome " + request.getParameter("uname1") + "<br/>");

    String driver = config.getInitParameter("name");
    out.print("Driver name is=" + driver);
%>


</body>
</html>
