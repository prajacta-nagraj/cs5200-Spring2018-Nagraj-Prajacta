import java.sql.Date;

public class User extends Person {
	public User(int id, String firstName, String lastName, String username, String password, String email, Date dob) {
		super(id, firstName, lastName, username, password, email, dob);
		// TODO Auto-generated constructor stub
	}
	private int id;
	private Boolean userAgreement;
	public User(int id, String firstName, String lastName, String username, String password, String email, Date dob,
			int id2, Boolean userAgreement) {
		super(id, firstName, lastName, username, password, email, dob);
		id = id2;
		this.userAgreement = userAgreement;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Boolean getUserAgreement() {
		return userAgreement;
	}
	public void setUserAgreement(Boolean userAgreement) {
		this.userAgreement = userAgreement;
	}
	

}
