import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
public class WebsiteDao {
	private static String DRIVER = "com.mysql.jdbc.Driver";
	private static String USERNAME="prajacta";
    private static String PASSWORD="Mansi141194";
    private static String DB_URL="jdbc:mysql://cs5200-spring2018-nagraj.cyrlsa4eq5ff.us-east-2.rds.amazonaws.com:3306/hw2_Nagraj_Prajacta_Spring_2018";
    private static Connection connection = null;
	private static PreparedStatement statement = null;
	private static ResultSet resultset = null;
	
	int createWebsiteForDeveloper(int developerId, Website website) {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			PreparedStatement s = connection.prepareStatement("INSERT INTO website VALUES (NULL,?,?,?,?,?");
			int r= s.executeUpdate();
			while(r==1) {
			   s.setString(1, website.getName());
			   s.setString(2, website.getDescription());
			   s.setDate(3, website.getCreated());
			   s.setDate(4, website.getUpdated());
			   s.setInt(5, website.getVisits());
			  
			}
	    
			resultset.close();
			statement.close();
			connection.close();
	} 
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	}
	ArrayList<Website> findAllWebsites(){
		ArrayList<Website> websites = new ArrayList<Website>();
		try {
		Class.forName(DRIVER);
		connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		statement = connection.prepareStatement(" SELECT * FROM Website");
		resultset = statement.executeQuery();
		while(resultset.next()) {
		   int id = resultset.getInt("id");
		   String name= resultset.getString("name");
           String description= resultset.getString("description");
           Date created= resultset.getDate("created");
           Date updated= resultset.getDate("updated");
           int visits = resultset.getInt("visits");
           Website website = new Website(id, name, description, created, updated, visits);
         websites.add(website);
           return websites;                      
		}
		
		resultset.close();
		statement.close();
		connection.close();
		
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	ArrayList<Website> findWebsitesForDeveloper(int developerId){
		ArrayList<Website> websites = new ArrayList<Website>();
		try {
		Class.forName(DRIVER);
		connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		statement = connection.prepareStatement(" SELECT * FROM Website WHERE developerId= @developeId");
		resultset = statement.executeQuery();
		while(resultset.next()) {
		   int id = resultset.getInt("id");
		   String name= resultset.getString("name");
           String description= resultset.getString("description");
           Date created= resultset.getDate("created");
           Date updated= resultset.getDate("updated");
           int visits = resultset.getInt("visits");
           Website website = new Website(id, name, description, created, updated, visits);
         websites.add(website);
           return websites;                      
		}
		
		resultset.close();
		statement.close();
		connection.close();
		
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	Website findWebsiteById(int websiteId) {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement(" SELECT * FROM Website WHERE id= websiteId");
			resultset = statement.executeQuery();
			while(resultset.next()) {
			int id = resultset.getInt("id");
		    String name= resultset.getString("name");
		           String description= resultset.getString("description");
		           Date created= resultset.getDate("created");
		           Date updated= resultset.getDate("updated");
		           int visits = resultset.getInt("visits");
		           Website website = new Website(id, name, description, created, updated, visits);
		           return website;
			}
			
			resultset.close();
			statement.close();
			connection.close();
			
			} 
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
	int updateWebsite(int websiteId, Website website) {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			PreparedStatement s = connection.prepareStatement(" UPDATE Website SET name=?, description=?, created=?, updated=?, visits=? WHERE id= @websiteId");
			int r= s.executeUpdate();
			while(r==1) {
				s.setString(1, website.getName());
				s.setString(2, website.getDescription());
				s.setDate(3, website.getCreated());
				s.setDate(4, website.getUpdated());
				s.setInt(5, website.getVisits());
				  
			}
	    
			resultset.close();
			statement.close();
			connection.close();
	} 
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	                                 }
	}

	
	int deleteWebsite(int websiteId) {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement(" DELETE FROM Website WHERE id= @websiteId");
			resultset = statement.executeQuery();
			
			
			
			resultset.close();
			statement.close();
			connection.close();
			
			} 
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		
		
	}


	}


