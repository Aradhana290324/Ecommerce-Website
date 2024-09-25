package Pojo;

public class CategoryPojo {
private int cid;
private String cname;
private String cdesc;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCdesc() {
	return cdesc;
}
public void setCdesc(String cdesc) {
	this.cdesc = cdesc;
}
public CategoryPojo(String cname, String cdesc) {
	super();
	this.cname = cname;
	this.cdesc = cdesc;
}
public CategoryPojo() {
	super();
	// TODO Auto-generated constructor stub
}


}
