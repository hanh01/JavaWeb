<%@ page import="java.util.Date" %>
<%@ page import="static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 20/4/2021
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>

<%--JSP Scriptlet tag--%>
<%
    int a = 3;
    int b = 5;
    int total = a + b;
    out.print("Total : " + total + "<br/>");
%>


<%--JSP expression tag--%>
<%= "JSP expression tag total : " + total + "<br/>"%>
<%= new Date() + "<br/>"%>


<%--JSP Declaration Tag--%>
<%!
    int cube(int n) {
        return n * n * n;
    }
%>
<%= "Cube of 3 is:" + cube(3) %>
<br/><br/>


<%--JSP request implicit object--%>
<%= "** SP request implicit object **" %>
<form action="index.jsp">
    <input type="text" name="uname"> <br/>
    <input type="text" name="pass">
    <input type="submit" value="go"><br/>
</form>
<%
    String name = request.getParameter("uname");
    String pass = request.getParameter("pass");
    out.print("welcome " + name + "," + " and pass is : " + pass + "<br/>");
%><br/><br/>

<%--JSP response implicit object--%>
<%--<%= "JSP response implicit object"%>--%>
<%--<%--%>
<%--    response.sendRedirect("https://www.facebook.com/");--%>
<%--%>--%>


<%--JSP config implicit object--%>
<%= "** JSP config implicit object **" + "<br/>"%>
<form action="index.jsp">
    <input type="text" name="uname1">
    <input type="submit" value="go">
</form>
<%
    out.print("Welcome " + request.getParameter("uname1") + "<br/>");

    String driver = config.getInitParameter("dname");
    out.print("Driver name is=" + driver);
%>


</body>
</html>
