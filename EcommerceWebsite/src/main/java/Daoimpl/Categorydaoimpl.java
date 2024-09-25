package Daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Pojo.CategoryPojo;
import helper.Connect;

public class Categorydaoimpl {
Connection con=Connect.getConnection();
PreparedStatement ps;
public boolean addcategory(CategoryPojo c) {
	try {
		String q="insert into category(cname,cdesc) values(?,?)";
		ps=con.prepareStatement(q);
		ps.setString(1,c.getCname());
		ps.setString(2,c.getCdesc());
		int x=ps.executeUpdate();
		if(x>0) {
			return true;
		}
		else {
			return false;
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return false;
}

public List<CategoryPojo> getAllCategory(){
	List<CategoryPojo> l=new ArrayList<>();
	try {
		String q="select * from category";
		ps=con.prepareStatement(q);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			CategoryPojo cpojo=new CategoryPojo();
			cpojo.setCid(rs.getInt("cid"));
			cpojo.setCname(rs.getString("cname"));
			cpojo.setCdesc(rs.getString("cdesc"));
			l.add(cpojo);
		}
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return l;
}
}
