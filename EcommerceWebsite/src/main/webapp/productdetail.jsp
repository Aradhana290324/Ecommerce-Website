<%@page import="Pojo.ProductPojo"%>
<%@page import="java.util.List"%>
<%@page import="Daoimpl.Productdaoimpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<%@ include file="Nav.jsp" %>
<%
int pid=Integer.parseInt(request.getParameter("pid"));
Productdaoimpl pimpl=new Productdaoimpl();
List<ProductPojo> l=pimpl.getProductById(pid);
for(ProductPojo p:l){
%>
<div>
<a href="productdetail.jsp?pid=<%=p.getPid()%>"><img alt="" src="images/product/<%=p.getImage()%>" height="200px"></a>
<h3><%=p.getPname() %></h3>
<p><%=p.getPdesc() %></p>
<%}%>
</body>
</html>