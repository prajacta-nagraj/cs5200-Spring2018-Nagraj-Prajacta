
public class Image extends Widget {

	public Image(int id, String name, int width, int height, String cssClass, String cssStyle, String text, int order) {
		super(id, name, width, height, cssClass, cssStyle, text, order);
		// TODO Auto-generated constructor stub
	}
 private int id;
 private String src;
public Image(int id, String name, int width, int height, String cssClass, String cssStyle, String text, int order,
		int id2, String src) {
	super(id, name, width, height, cssClass, cssStyle, text, order);
	id = id2;
	this.src = src;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSrc() {
	return src;
}
public void setSrc(String src) {
	this.src = src;
}
 
}
