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
    Name : <input type="text" placeholder="Name Product" name="name" ><br/>
    Price : <input type="number" placeholder="Price" name="price"><br/>
    Quantity : <input type="number" placeholder="Quantity" name="quantity"><br/>
    Categoryid : <input type="number" placeholder="Categoryid" name="categoryid"><br/>
    <input class="btn btn-primary" type="submit" value="Submit">
</form>

<%--&lt;%&ndash;@elvariable id="product" type="java"&ndash;%&gt;--%>
<%--<form:form method="post" action="save" modelAttribute="product">--%>
<%--    Name : <form:input type="text" path="name"/><br/>--%>
<%--    Price : <form:input type="number" path="price" /><br/>--%>
<%--    Quantity : <form:input type="number" path="quantity"/><br/>--%>
<%--    Categoryid : <form:input type="number" path="categoryid"/><br/>--%>
<%--    <input class="btn btn-primary" type="submit" value="Submit">--%>
<%--</form:form>--%>

</body>
</html>


