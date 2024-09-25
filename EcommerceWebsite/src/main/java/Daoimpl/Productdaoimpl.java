package Daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Pojo.ProductPojo;
import helper.Connect;

public class Productdaoimpl {
Connection con=Connect.getConnection();
PreparedStatement ps;
public boolean addProduct(ProductPojo p) {
	try {
		String q="insert into product(pname,pdesc,price,quantity,discount,category,image) values(?,?,?,?,?,?,?)";
		ps=con.prepareStatement(q);
		ps.setString(1,p.getPname());
		ps.setString(2,p.getPdesc());
		ps.setInt(3,p.getPrice());
		ps.setInt(4,p.getQuantity());
		ps.setInt(5,p.getDiscount());
		ps.setString(6,p.getCategory());
		ps.setString(7,p.getImage());
		int x=ps.executeUpdate();
		if(x>0) {
			return true;
		}
		else {
			return false;
		}
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return false;
}

public List<ProductPojo> getAllProduct(){
	List<ProductPojo> l=new ArrayList<>();
	try {
		String q="select * from product";
		ps=con.prepareStatement(q);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			ProductPojo p=new ProductPojo();
			p.setPid(rs.getInt("pid"));
			p.setPname(rs.getString("pname"));
			p.setPdesc(rs.getString("pdesc"));
			p.setPrice(rs.getInt("price"));
			p.setDiscount(rs.getInt("discount"));
			p.setQuantity(rs.getInt("quantity"));
			p.setCategory(rs.getString("category"));
			p.setImage(rs.getString("image"));
			l.add(p);
		}
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	return l;
}

public List<ProductPojo> getProductById(int pid){
	List<ProductPojo> l=new ArrayList<>();
	try {
		String q="select * from product where pid=?";
		ps=con.prepareStatement(q);
		ps.setInt(1, pid);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			ProductPojo p=new ProductPojo();
			p.setPid(rs.getInt("pid"));
			p.setPname(rs.getString("pname"));
			p.setPdesc(rs.getString("pdesc"));
			p.setPrice(rs.getInt("price"));
			p.setDiscount(rs.getInt("discount"));
			p.setQuantity(rs.getInt("quantity"));
			p.setCategory(rs.getString("category"));
			p.setImage(rs.getString("image"));
			l.add(p);
		}
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	return l;
}
public List<ProductPojo> getProductByCname(String cname){
	List<ProductPojo> l=new ArrayList<>();
	try {
		String q="select * from product where category=?";
		ps=con.prepareStatement(q);
		ps.setString(1,cname);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			ProductPojo p=new ProductPojo();
			p.setPid(rs.getInt("pid"));
			p.setPname(rs.getString("pname"));
			p.setPdesc(rs.getString("pdesc"));
			p.setPrice(rs.getInt("price"));
			p.setDiscount(rs.getInt("discount"));
			p.setQuantity(rs.getInt("quantity"));
			p.setCategory(rs.getString("category"));
			p.setImage(rs.getString("image"));
			l.add(p);
		}
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	return l;
}
}
