package Pojo;

public class ProductPojo {
private int pid;
private String pname;
private String pdesc;
private int price;
private int discount;
private int quantity;
private String category;
private String image;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPdesc() {
	return pdesc;
}
public void setPdesc(String pdesc) {
	this.pdesc = pdesc;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public ProductPojo(String pname, String pdesc, int price, int discount, int quantity, String category, String image) {
	super();
	this.pname = pname;
	this.pdesc = pdesc;
	this.price = price;
	this.discount = discount;
	this.quantity = quantity;
	this.category = category;
	this.image = image;
}
public ProductPojo() {
	super();
	// TODO Auto-generated constructor stub
}


}
