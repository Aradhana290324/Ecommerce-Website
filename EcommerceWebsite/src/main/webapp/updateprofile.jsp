<%@page import="Pojo.User"%>
<%@page import="java.util.List"%>
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
<%@ include file="Nav.jsp" %>
<%
int pid=Integer.parseInt(request.getParameter("pid"));
Userdaoimpl uimpl=new Userdaoimpl();
List<User> l=	uimpl.getProfileByid(pid);
%>
<div class="container mt-5">
<div class="row">
<div class="col-md-6 offset-md-3">
<div class="card">
<div class="card-header bg-dark text-white text-center">
<h3>Edit Profile</h3>
</div>
<div class="card-body">
<%
for(User u:l){
%>
<form action="UpdateProfile?pid=<%=u.getPid() %>" method="post">

  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" value="<%=u.getName() %>" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Name">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Email</label>
    <input type="email" value="<%=u.getEmail() %>" name="email"  class="form-control" id="exampleInputPassword1" placeholder="Enter Email">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Contact No</label>
    <input type="number" value="<%=u.getContactno()%>" name="contactno" class="form-control" id="exampleInputPassword1" placeholder="Enter Contact no">
  </div>
   <div class="form-group">
    <label for="exampleFormControlSelect1">State</label>
    <select class="form-control" value="<%=u.getState()%>" name="state" id="exampleFormControlSelect1">
      <option value="">Select...</option>
    <option value="Andhra Pradesh">Andhra Pradesh</option>
    <option value="Arunachal Pradesh">Arunachal Pradesh</option>
    <option value="Assam">Assam</option>
    <option value="Bihar">Bihar</option>
    <option value="Chhattisgarh">Chhattisgarh</option>
    <option value="Goa">Goa</option>
    <option value="Gujarat">Gujarat</option>
    <option value="Haryana">Haryana</option>
    <option value="Himachal Pradesh">Himachal Pradesh</option>
    <option value="Jharkhand">Jharkhand</option>
    <option value="Karnataka">Karnataka</option>
    <option value="Kerala">Kerala</option>
    <option value="Madhya Pradesh">Madhya Pradesh</option>
    <option value="Maharashtra">Maharashtra</option>
    <option value="Manipur">Manipur</option>
    <option value="Meghalaya">Meghalaya</option>
    <option value="Mizoram">Mizoram</option>
    <option value="Nagaland">Nagaland</option>
    <option value="Odisha">Odisha</option>
    <option value="Punjab">Punjab</option>
    <option value="Rajasthan">Rajasthan</option>
    <option value="Sikkim">Sikkim</option>
    <option value="Tamil Nadu">Tamil Nadu</option>
    <option value="Telangana">Telangana</option>
    <option value="Tripura">Tripura</option>
    <option value="Uttar Pradesh">Uttar Pradesh</option>
    <option value="Uttarakhand">Uttarakhand</option>
    <option value="West Bengal">West Bengal</option>
    <option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
    <option value="Chandigarh">Chandigarh</option>
    <option value="Dadra and Nagar Haveli and Daman and Diu">Dadra and Nagar Haveli and Daman and Diu</option>
    <option value="Lakshadweep">Lakshadweep</option>
    <option value="Delhi">Delhi</option>
    <option value="Puducherry">Puducherry</option>
    <option value="Jammu and Kashmir">Jammu and Kashmir</option>
    <option value="Ladakh">Ladakh</option>
    </select>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">City</label>
    <input type="text" name="city" value="<%=u.getCity()%>" class="form-control" id="exampleInputPassword1" placeholder="Enter City">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Street</label>
    <input type="text" name="street" value="<%=u.getStreet()%>" class="form-control" id="exampleInputPassword1" placeholder="Enter Street">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Pin Code</label>
    <input type="number" value="<%=u.getPincode()%>" name="pincode" class="form-control" id="exampleInputPassword1" placeholder="Enter pin code">
  </div>
  <%} %>
  <button type="submit" class="btn btn-dark">Save</button>
</form>
</div>
</div>
</div>

</div>

</div>
</body>
</html>