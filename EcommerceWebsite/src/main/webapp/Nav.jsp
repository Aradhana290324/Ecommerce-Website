<%@page import="Daoimpl.Categorydaoimpl"%>
<%@page import="Pojo.CategoryPojo"%>
<%@page import="java.util.List"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
	<%
String user=(String)session.getAttribute("user");
	String username=(String)session.getAttribute("username");
	Categorydaoimpl cimpl=new Categorydaoimpl();
	List<CategoryPojo> lc=cimpl.getAllCategory();
	%>
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Category
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
        <a class="dropdown-item" href="index.jsp">All</a>
        <%for(CategoryPojo cp:lc){ %>
          <a class="dropdown-item" href="index.jsp?cname=<%=cp.getCname()%>"><%=cp.getCname() %></a>
          <%} %>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0 mr-3" type="submit">Search</button>
     <%
     if(user==null){
     
     %>
     <a href="Register.jsp"><button class="btn btn-success my-2 my-sm-0 mr-3" type="button">Register</button></a>
      <a href="Login.jsp"><button class="btn btn-success my-2 my-sm-0" type="button">Login</button></a>
    <%}
     else{ %>
    <a href="Profile.jsp"><button class="btn btn-success my-2 my-sm-0 mr-3" type="button">Welcome <%=username %></button></a>
      <a href="Logout"><button class="btn btn-success my-2 my-sm-0" type="button">Logout</button></a>
    
    <%} %>
    
    
    </form>
  </div>
</nav>


