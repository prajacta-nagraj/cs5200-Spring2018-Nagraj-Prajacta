
public class WebsitePriviledge {
private int id;
private Priviledge priviledge;
public WebsitePriviledge(int id, Priviledge priviledge) {
	super();
	this.id = id;
	this.priviledge = priviledge;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Priviledge getPriviledge() {
	return priviledge;
}
public void setPriviledge(Priviledge priviledge) {
	this.priviledge = priviledge;
}

}
