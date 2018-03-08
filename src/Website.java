import java.sql.Date;
import java.util.ArrayList;

public class Website {
	private int id;
	private String name;
	private String description;
	private Date created;
	private Date updated;
	private int visits;
	private ArrayList<Page> pages;
	private ArrayList<WebsiteRole> webrole;
	private ArrayList<WebsitePriviledge> webpriviledge;
	public Website(int id, String name, String description, Date created, Date updated, int visits,
			ArrayList<Page> pages, ArrayList<WebsiteRole> webrole, ArrayList<WebsitePriviledge> webpriviledge) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.visits = visits;
		this.pages = pages;
		this.webrole = webrole;
		this.webpriviledge = webpriviledge;
	}
	public ArrayList<WebsiteRole> getWebrole() {
		return webrole;
	}
	public void setWebrole(ArrayList<WebsiteRole> webrole) {
		this.webrole = webrole;
	}
	public ArrayList<WebsitePriviledge> getWebpriviledge() {
		return webpriviledge;
	}
	public void setWebpriviledge(ArrayList<WebsitePriviledge> webpriviledge) {
		this.webpriviledge = webpriviledge;
	}
	public Website(int id, String name, String description, Date created, Date updated, int visits,
			ArrayList<Page> pages) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.visits = visits;
		this.pages = pages;
	}
	public ArrayList<Page> getPages() {
		return pages;
	}
	public void setPages(ArrayList<Page> pages) {
		this.pages = pages;
	}
	public Website(int id, String name, String description, Date created, Date updated, int visits) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.visits = visits;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getVisits() {
		return visits;
	}
	public void setVisits(int visits) {
		this.visits = visits;
	}
	
	

}
