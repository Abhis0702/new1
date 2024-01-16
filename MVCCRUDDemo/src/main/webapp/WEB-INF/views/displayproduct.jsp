<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
<h1 align="center">Product Details</h1>
<table border="2" align="center">
  <tr >
     <th>Product id</th>
     <th>Product title</th>
     <th>Description</th>
     <th>Price</th>
     <th>Action</th>
  </tr>
  <c:forEach var="p" items="${plist}">
     <tr>
       <td>${p.id}</td>
       <td>${p.title}</td>
       <td>${p.desc}</td>
       <td>${p.price}</td>
       <td><a href="delete/${p.id}">Delete</a>
       /
       <a href="edit/${p.id}">Edit</a>
       </td>
     </tr>
  </c:forEach>
</table>
<h3 align="center"><a href="addproduct">Add New Product</a></h3>
</body>
</html>