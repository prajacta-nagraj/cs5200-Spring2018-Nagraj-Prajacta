import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.Date;
public class RoleDao {
	private static String DRIVER = "com.mysql.jdbc.Driver";
	private static String USERNAME="prajacta";
    private static String PASSWORD="Mansi141194";
    private static String DB_URL="jdbc:mysql://cs5200-spring2018-nagraj.cyrlsa4eq5ff.us-east-2.rds.amazonaws.com:3306/hw2_Nagraj_Prajacta_Spring_2018";
    
    private static Connection connection = null;
	private static PreparedStatement statement = null;
	private static ResultSet resultset = null;
	
	void assignWebsiteRole(int developerId, int websiteId, int roleId){
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			PreparedStatement s = connection.prepareStatement(
					"INSERT INTO Role VALUES (NULL,?,?,?,?,?,?,?) ");
			int r= s.executeUpdate();
			while(r==1) {
			   s.setString(1, role.getOwner());
			   s.setString(2, role.getAdmin());
			   s.setString(3, role.getWriter());
			   s.setString(4, role.getEditor());
			   s.setString(5, role.getReviewer());
			   
			  
			}
	    
			resultset.close();
			statement.close();
			connection.close();
	} 
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
		

		
	}

}
