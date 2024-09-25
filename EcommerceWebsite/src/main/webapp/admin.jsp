<%@page import="Pojo.User"%>
<%@page import="Daoimpl.Userdaoimpl"%>
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
<%
Categorydaoimpl cimpl1=new Categorydaoimpl();
List<CategoryPojo> l1=cimpl1.getAllCategory();
Userdaoimpl uimpl1=new Userdaoimpl();
int count=uimpl1.countUser();
%>
<%@ include file="Nav.jsp" %>
<%@include file="modal.jsp" %>
<div class="container">
<%@ include file="message.jsp" %>
<div class="row mt-3">

<div class="col-md-4">
<div class="card">
<div class="card-body text-center">
<img alt="" src="images/profile.png" height="200px">
<p>USER</p>
<h4><%=count %></h4>
</div>
</div>

</div>
<div class="col-md-4">
<div class="card">
<div class="card-body text-center">
<img alt="" src="images/products.png" height="200px">
<p>PRODUCTS</p>
<h4>5</h4>
</div>
</div>
</div>
<div class="col-md-4">
<div class="card">
<div class="card-body text-center">
<img alt="" src="images/application.png" height="200px">
<p>CATEGORY</p>
<h4><%=l1.size() %></h4>
</div>
</div>
</div>
</div>
<div class="row mt-3">
<div class="col-md-6">
<div class="card">
<div class="card-body text-center"	data-toggle="modal" data-target="#productModal">
<img alt="" src="images/add-product.png" height="200px">
<p>ADD-PRODUCT</p>

</div>
</div>
</div>
<div class="col-md-6">
<div class="card">
<div class="card-body text-center" data-toggle="modal" data-target="#categoryModal">
<img alt="" src="images/application.png" height="200px">
<p>ADD-CATEGORY</p>

</div>
</div>
</div>

</div>

</div>


<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
</body>
</html>