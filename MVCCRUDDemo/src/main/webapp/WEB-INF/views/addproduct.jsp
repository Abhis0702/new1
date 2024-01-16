<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New product</title>
</head>
<body align="center">
<form action="insertproduct" method="post">
Product Id : <input type="text" name="id" id="id"><br><br>
Product Title : <input type="text" name="title" id="title"><br><br>
Description : <input type="text" name="desc" id="desc"><br><br>
Price : <input type="text" name="price" id="price"><br><br>
<button type="submit" name="btn" id="btn">Submit</button>
</form>
</body>
</html>