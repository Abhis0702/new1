<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
</head>
<body>
<form action="/MVCCRUDDemo/product/updateproduct" method="post">
Product Id : <input type="text" name="id" id="id" value="${p.id}" readonly><br><br>
Product Title : <input type="text" name="title" id="title" value="${p.title}"><br><br>
Description : <input type="text" name="desc" id="desc" value="${p.desc}"><br><br>
Price : <input type="text" name="price" id="price" value="${p.price}"><br><br>
<button type="submit" name="btn" id="btn">Update Product</button>
</form>
</body>
</html>