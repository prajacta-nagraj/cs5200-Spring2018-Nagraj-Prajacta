import java.sql.Date;
import java.util.ArrayList;

public class Developer extends Person {
	public Developer(int id, String firstName, String lastName, String username, String password, String email,
			Date dob) {
		super(id, firstName, lastName, username, password, email, dob);
		// TODO Auto-generated constructor stub
	}
	int id;
	private String developerKey;
	private ArrayList<Website> websites;
	private ArrayList<WebsitePriviledge> webpriviledge;
	private ArrayList<WebsiteRole> webrole;
	private ArrayList<PagePriviledge> pagepriviledge;
	private ArrayList<PageRole> pagerole;
	public Developer(int id, String firstName, String lastName, String username, String password, String email,
			Date dob, ArrayList<phone> phones, ArrayList<Address> addresses, int id2, String developerKey,
			ArrayList<Website> websites, ArrayList<WebsitePriviledge> webpriviledge, ArrayList<WebsiteRole> webrole,
			ArrayList<PagePriviledge> pagepriviledge, ArrayList<PageRole> pagerole) {
		super(id, firstName, lastName, username, password, email, dob, phones, addresses);
		id = id2;
		this.developerKey = developerKey;
		this.websites = websites;
		this.webpriviledge = webpriviledge;
		this.webrole = webrole;
		this.pagepriviledge = pagepriviledge;
		this.pagerole = pagerole;
	}
	public ArrayList<WebsitePriviledge> getWebpriviledge() {
		return webpriviledge;
	}
	public void setWebpriviledge(ArrayList<WebsitePriviledge> webpriviledge) {
		this.webpriviledge = webpriviledge;
	}
	public ArrayList<WebsiteRole> getWebrole() {
		return webrole;
	}
	public void setWebrole(ArrayList<WebsiteRole> webrole) {
		this.webrole = webrole;
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
	public Developer(int id, String firstName, String lastName, String username, String password, String email,
			Date dob, String developerKey, ArrayList<Website> websites) {
		super(id, firstName, lastName, username, password, email, dob);
		this.developerKey = developerKey;
		this.websites = websites;
	}
	public ArrayList<Website> getWebsites() {
		return websites;
	}
	public void setWebsites(ArrayList<Website> websites) {
		this.websites = websites;
	}
	public Developer(int id, String firstName, String lastName, String username, String password, String email,
			Date dob, int id2, String developerKey) {
		super(id, firstName, lastName, username, password, email, dob);
		id = id2;
		this.developerKey = developerKey;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeveloperKey() {
		return developerKey;
	}
	public void setDeveloperKey(String developerKey) {
		this.developerKey = developerKey;
	}
	

}
