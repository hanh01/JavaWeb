<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Index</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<h1>CreateEmployee</h1><br/>

<form method="post" action="save" style="padding-left: 30px;">
    Name : <input type="text" placeholder="Name" name="name" ><br/><br/>
    Wage : <input type="number" placeholder="Wage" name="wage"><br/><br/>
    <input class="btn btn-primary" type="submit" value="Submit">
</form>


</body>
</html>


