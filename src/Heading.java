
public class Heading extends Widget {

	public Heading(int id, String name, int width, int height, String cssClass, String cssStyle, String text,
			int order) {
		super(id, name, width, height, cssClass, cssStyle, text, order);
		// TODO Auto-generated constructor stub
	}
	private int id;
	private int size;
	public Heading(int id, String name, int width, int height, String cssClass, String cssStyle, String text, int order,
			int id2, int size) {
		super(id, name, width, height, cssClass, cssStyle, text, order);
		id = id2;
		this.size = size;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
