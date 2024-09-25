

<!-- Modal -->
<%@page import="Pojo.CategoryPojo"%>
<%@page import="java.util.List"%>
<%@page import="Daoimpl.Categorydaoimpl"%>
<div class="modal fade" id="productModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Add Product</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <form action="product" method="post" enctype="multipart/form-data">
  <div class="form-group">
    <label for="exampleInputEmail1">Product Name</label>
    <input type="text" name="pname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="enter product name">
  </div>
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Product Description</label>
    <textarea class="form-control" name="pdesc" id="exampleFormControlTextarea1" rows="3"></textarea>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Product Price</label>
    <input type="number" name="price" class="form-control" id="exampleInputPassword1" placeholder="enter product price">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Product Discount</label>
    <input type="number" name="discount" class="form-control" id="exampleInputPassword1" placeholder="enter product discount">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Product Quantity</label>
    <input type="number" name="quantity" class="form-control" id="exampleInputPassword1" placeholder="enter product quantity">
  </div>
 
  <div class="form-group">
    <label for="exampleFormControlSelect1">Product Category</label>
    <select class="form-control" name="category" id="exampleFormControlSelect1">
    <%
    Categorydaoimpl cimplc=new Categorydaoimpl();
    List<CategoryPojo>l=cimplc.getAllCategory();
    	for(CategoryPojo c:l){
    %>
      <option><%=c.getCname() %></option>
     <%} %> 
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlFile1">Product Image</label>
    <input type="file" name="image" class="form-control-file" id="exampleFormControlFile1">
  </div>
  
  <button type="submit" class="btn btn-primary">Add-Product</button>
</form>
      </div>
      
    </div>
  </div>
</div>









<!-- Modal -->
<div class="modal fade" id="categoryModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Add Category</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <form action="Category" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Category Name</label>
    <input type="text" name="cname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="enter product name">
  </div>
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Category Description</label>
    <textarea class="form-control" name="cdesc" id="exampleFormControlTextarea1" rows="3"></textarea>
  </div>
  
  
  <button type="submit" class="btn btn-primary">Add-category</button>
</form>
      </div>
      
    </div>
  </div>
</div>