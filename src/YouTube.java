
public class YouTube extends Widget {

	public YouTube(int id, String name, int width, int height, String cssClass, String cssStyle, String text,
			int order) {
		super(id, name, width, height, cssClass, cssStyle, text, order);
		// TODO Auto-generated constructor stub
	}
    private int id;
    private String url;
    private Boolean shareble;
    private Boolean expandable;
	public YouTube(int id, String name, int width, int height, String cssClass, String cssStyle, String text, int order,
			int id2, String url, Boolean shareble, Boolean expandable) {
		super(id, name, width, height, cssClass, cssStyle, text, order);
		id = id2;
		this.url = url;
		this.shareble = shareble;
		this.expandable = expandable;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Boolean getShareble() {
		return shareble;
	}
	public void setShareble(Boolean shareble) {
		this.shareble = shareble;
	}
	public Boolean getExpandable() {
		return expandable;
	}
	public void setExpandable(Boolean expandable) {
		this.expandable = expandable;
	}
}
