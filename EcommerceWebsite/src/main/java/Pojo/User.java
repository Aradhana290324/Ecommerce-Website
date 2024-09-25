package Pojo;

public class User {
private String username;
private String email;
private String password;
private String name;
private int contactno;
private String state;
private String city;
private String street;
private int pincode;
private int pid;




public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getContactno() {
	return contactno;
}
public void setContactno(int contactno) {
	this.contactno = contactno;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public User(String username, String email, String password) {
	super();
	this.username = username;
	this.email = email;
	this.password = password;
}


public User(String email, String name, int contactno, String state, String city, String street, int pincode) {
	super();
	this.email = email;
	this.name = name;
	this.contactno = contactno;
	this.state = state;
	this.city = city;
	this.street = street;
	this.pincode = pincode;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}



}
