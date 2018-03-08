import java.sql.Date;
import java.util.ArrayList;

public class Page {
	private int id;
	private String title;
	private String description;
	private Date created;
	private Date updated;
	private int views;
	private ArrayList<Widget> widgets;
	private ArrayList<PagePriviledge> pagepriviledge;
	private ArrayList<PageRole> pagerole;
	public Page(int id, String title, String description, Date created, Date updated, int views,
			ArrayList<Widget> widgets, ArrayList<PagePriviledge> pagepriviledge, ArrayList<PageRole> pagerole) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.views = views;
		this.widgets = widgets;
		this.pagepriviledge = pagepriviledge;
		this.pagerole = pagerole;
	}
	public ArrayList<PagePriviledge> getPagepriviledge() {
		return pagepriviledge;
	}
	public void setPagepriviledge(ArrayList<PagePriviledge> pagepriviledge) {
		this.pagepriviledge = pagepriviledge;
	}
	public ArrayList<PageRole> getPagerole() {
		return pagerole;
	}
	public void setPagerole(ArrayList<PageRole> pagerole) {
		this.pagerole = pagerole;
	}
	public Page(int id, String title, String description, Date created, Date updated, int views,
			ArrayList<Widget> widgets) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.views = views;
		this.widgets = widgets;
	}
	public ArrayList<Widget> getWidgets() {
		return widgets;
	}
	public void setWidgets(ArrayList<Widget> widgets) {
		this.widgets = widgets;
	}
	public Page(int id, String title, String description, Date created, Date updated, int views) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.views = views;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	

}
