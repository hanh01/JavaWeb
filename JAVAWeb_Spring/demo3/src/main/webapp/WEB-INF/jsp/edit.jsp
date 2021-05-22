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
<h1>Create</h1>

<form method="post" action="save">
    id : <input type="number" name="id" value="${productss.id}" readonly><br/>
    Name : <input type="text" name="name" value="${productss.name}" ><br/>
    Price : <input type="number" name="price" value="${productss.price}"><br/>
    Quantity : <input type="number" name="quantity" value="${productss.quantity}"><br/>
    Categoryid : <input type="number" name="categoryid" value="${productss.categoryid}"><br/>
    <input class="btn btn-primary" type="submit" value="Save">
</form>


</body>
</html>


