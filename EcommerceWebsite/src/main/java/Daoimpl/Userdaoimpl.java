package Daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Pojo.CategoryPojo;
import Pojo.User;
import helper.Connect;

public class Userdaoimpl {
	Connection con=Connect.getConnection();
	PreparedStatement ps=null;
public boolean saveUser(User u) {
	try {
		String q="insert into user(username,email,password) values(?,?,?)";
		ps=con.prepareStatement(q);
		ps.setString(1,u.getUsername());
		ps.setString(2,u.getEmail());
		ps.setString(3,u.getPassword());
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
public boolean loginUser(String email,String password) {
	try {
		String q="select * from user where email=? and password=?";
		ps=con.prepareStatement(q);
		ps.setString(1,email);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
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


public String getUsernameByEmail(String email) {
	String username="";
	try {
		String q="select username from user where email=?";
		ps=con.prepareStatement(q);
		ps.setString(1,email);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			username=rs.getString("username");
		}
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return username;
}
public boolean saveProfile(User u) {
	try {
		String q="insert into profile(name,email,contactno,state,city,street,pincode) values(?,?,?,?,?,?,?)";
		ps=con.prepareStatement(q);
		ps.setString(1,u.getName());
		ps.setString(2,u.getEmail());
		ps.setInt(3,u.getContactno());
		ps.setString(4,u.getState());
		ps.setString(5,u.getCity());
		ps.setString(6,u.getStreet());
		ps.setInt(7,u.getPincode());
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
public List<User> getProfileByEmail(String email) {
	List<User> l=new ArrayList<>();
	try {
		String q="select * from profile where email=?";
		ps=con.prepareStatement(q);
		ps.setString(1,email);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			User u=new User();
			u.setPid(rs.getInt("pid"));
			u.setName(rs.getString("name"));
			u.setEmail(rs.getString("email"));
			u.setContactno(rs.getInt("contactno"));
			u.setState(rs.getString("state"));
			u.setCity(rs.getString("city"));
			u.setStreet(rs.getString("street"));
			u.setPincode(rs.getInt("pincode"));
			l.add(u);
		}
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return l;
}


public boolean deleteProfilebyid(int pid) {
	try {
		String q="delete from profile where pid=?";
		ps=con.prepareStatement(q);
		ps.setInt(1, pid);
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


public List<User> getProfileByid(int pid) {
	List<User> l=new ArrayList<>();
	try {
		String q="select * from profile where pid=?";
		ps=con.prepareStatement(q);
		ps.setInt(1, pid);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			User u=new User();
			u.setPid(rs.getInt("pid"));
			u.setName(rs.getString("name"));
			u.setEmail(rs.getString("email"));
			u.setContactno(rs.getInt("contactno"));
			u.setState(rs.getString("state"));
			u.setCity(rs.getString("city"));
			u.setStreet(rs.getString("street"));
			u.setPincode(rs.getInt("pincode"));
			l.add(u);
		}
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return l;
}

public boolean updateProfilebyid(int pid,User u) {
	try {
		String q="update profile set name=?,email=?,contactno=?,state=?,city=?,street=?,pincode=? where pid=?";
		ps=con.prepareStatement(q);
		ps.setString(1,u.getName());
		ps.setString(2,u.getEmail());
		ps.setInt(3,u.getContactno());
		ps.setString(4,u.getState());
		ps.setString(5,u.getCity());
		ps.setString(6,u.getStreet());
		ps.setInt(7,u.getPincode());
		ps.setInt(8, pid);
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
public int countUser(){
	int count=0;
	try {
		String q="select * from user";
		ps=con.prepareStatement(q);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			count++;
			
		}
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return count;
}

}
