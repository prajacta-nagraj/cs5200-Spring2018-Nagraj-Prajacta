
public class Html extends Widget {

	public Html(int id, String name, int width, int height, String cssClass, String cssStyle, String text, int order) {
		super(id, name, width, height, cssClass, cssStyle, text, order);
		// TODO Auto-generated constructor stub
	}
    private int id;
    private String html;
	public Html(int id, String name, int width, int height, String cssClass, String cssStyle, String text, int order,
			int id2, String html) {
		super(id, name, width, height, cssClass, cssStyle, text, order);
		id = id2;
		this.html = html;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHtml() {
		return html;
	}
	public void setHtml(String html) {
		this.html = html;
	}
}
