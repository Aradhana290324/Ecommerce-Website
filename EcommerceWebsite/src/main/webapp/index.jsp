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

<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="https://m.media-amazon.com/images/I/61EaVQhGRdL._SX3000_.jpg" alt="First slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="https://images-eu.ssl-images-amazon.com/images/G/31/img23/Wireless/OnePlus/PD24/PDED/GW/OP12/D142850379_WLD_PrimeDay_OnePlus_12_PC_Hero_3000x1200_1._CB568715029_.jpg" alt="Second slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="https://m.media-amazon.com/images/I/61EaVQhGRdL._SX3000_.jpg" alt="Third slide">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

<%
String cname=request.getParameter("cname");

Productdaoimpl pimpl=new Productdaoimpl();
List<ProductPojo> l=pimpl.getAllProduct();
List<ProductPojo> lcp=pimpl.getProductByCname(cname);
if(cname==null){
for(ProductPojo p:l){
%>
<div>
<a href="productdetail.jsp?pid=<%=p.getPid()%>"><img alt="" src="images/product/<%=p.getImage()%>" height="200px"></a>
<h3><%=p.getPname() %></h3>
<p><%=p.getPdesc() %></p>
<%}}
else{
	for(ProductPojo p:lcp){
%>
<a href="productdetail.jsp?pid=<%=p.getPid()%>"><img alt="" src="images/product/<%=p.getImage()%>" height="200px"></a>
<h3><%=p.getPname() %></h3>
<p><%=p.getPdesc() %></p>
<%}} %>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>