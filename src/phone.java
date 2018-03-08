
public class phone {
private int id;
private int phone;
private Boolean primary;
public phone(int id, int phone, Boolean primary) {
	super();
	this.id = id;
	this.phone = phone;
	this.primary = primary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public Boolean getPrimary() {
	return primary;
}
public void setPrimary(Boolean primary) {
	this.primary = primary;
}
}
