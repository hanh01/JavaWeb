<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/4/2021
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Login</h1>
${param.id}
<form method="post" action="login">
    Username : <input type="text" name="username"><br/>
    Password : <input type="password" name="password"><br/>
    <input type="submit" value="LOGIN"/>
</form>
</body>
</html>
