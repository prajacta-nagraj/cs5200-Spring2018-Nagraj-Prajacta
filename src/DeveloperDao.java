

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class DeveloperDao {
	
	private static String DRIVER = "com.mysql.jdbc.Driver";
	private static String USERNAME="prajacta";
    private static String PASSWORD="Mansi141194";
    private static String DB_URL="jdbc:mysql://cs5200-spring2018-nagraj.cyrlsa4eq5ff.us-east-2.rds.amazonaws.com:3306/hw2_Nagraj_Prajacta_Spring_2018";
    private static Connection connection = null;
	private static PreparedStatement statement = null;
	private static ResultSet resultset = null;
	
	public void findAllDevelopers() {
		ArrayList<Developer> developers = new ArrayList<Developer>();
		try {
		Class.forName(DRIVER);
		try {
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		statement = connection.prepareStatement(" SELECT * FROM Developer");
		resultset = statement.executeQuery();
		while(resultset.next()) {
		   int id = resultset.getInt("id");
		   String firstname= resultset.getString("firstName");
           String lastname= resultset.getString("lastName");
           String username= resultset.getString("username");
           String password= resultset.getString("password");
           String email = resultset.getString("email");
           Date dob =resultset.getDate("dob");
           
           Developer developer =new Developer(id, firstname, lastname, username, password, email, dob);
		   developers.add(developer);
		   return;
		}
		
		resultset.close();
		statement.close();
		connection.close();
		
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unused")
	private static void createDeveloper(Developer developer) {
	    try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			PreparedStatement s = connection.prepareStatement(" INSERT INTO developer VALUES (NULL,?,?,?,?,?,?,?");
			int r= s.executeUpdate();
			while(r==1) {
			   s.setString(1, developer.getFirstName());
			   s.setString(2, developer.getLastName());
			   s.setString(3, developer.getUsername());
			   s.setString(4, developer.getPassword());
			   s.setString(5, developer.getEmail());
			   s.setDate(6, developer.getDob());
			   s.setString(7, developer.getDeveloperKey());
			}
	    
			resultset.close();
			statement.close();
			connection.close();
	} 
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
	Developer findDeveloperById(int developerId) {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement(" SELECT * FROM Developer WHERE id= @developerId");
			resultset = statement.executeQuery();
			while(resultset.next()) {
			   int id = resultset.getInt("id");
			   String firstname= resultset.getString("firstName");
	           String lastname= resultset.getString("lastName");
	           String username= resultset.getString("username");
	           String password= resultset.getString("password");
	           String email = resultset.getString("email");
	           Date dob =resultset.getDate("dob");
	           Developer developer =new Developer(id, firstname, lastname, username, password, email, dob);
	           return developer;
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
	Developer findDeveloperByUsername(String username) {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement(" SELECT * FROM Developer WHERE username= @username");
			resultset = statement.executeQuery();
			while(resultset.next()) {
			   int id = resultset.getInt("id");
			   String firstname= resultset.getString("firstName");
	           String lastname= resultset.getString("lastName");
	          
	           String password= resultset.getString("password");
	           String email = resultset.getString("email");
	           Date dob =resultset.getDate("dob");
	           Developer developer =new Developer(id, firstname, lastname, username, password, email, dob);
	           return developer;
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
	Developer findDeveloperByCredentials(String username, String password) {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement(" SELECT * FROM Developer WHERE username= @username AND password= @password");
			resultset = statement.executeQuery();
			while(resultset.next()) {
			   int id = resultset.getInt("id");
			   String firstname= resultset.getString("firstName");
	           String lastname= resultset.getString("lastName");
	           String email = resultset.getString("email");
	           Date dob =resultset.getDate("dob");
	           int id2= resultset.getInt("id2");
	           Developer developer =new Developer(id, firstname, lastname, username, password, email, dob);
	           return developer;
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
	int updateDeveloper(int developerId, Developer developer) {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			PreparedStatement s = connection.prepareStatement(" UPDATE Developer SET firstname=?, lastName=?, username=?, password=?, email=?, dob=?, developerKey=? WHERE id= @developerId");
			int r= s.executeUpdate();
			while(r==1) {
			   s.setString(1, developer.getFirstName());
			   s.setString(2, developer.getLastName());
			   s.setString(3, developer.getUsername());
			   s.setString(4, developer.getPassword());
			   s.setString(5, developer.getEmail());
			   s.setDate(6, developer.getDob());
			   s.setString(7, developer.getDeveloperKey());
			}
	    
			resultset.close();
			statement.close();
			connection.close();
	} 
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
		return developerId;
		
	}
	int deleteDeveloper(int developerId) {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement(" DELETE FROM Developer WHERE id= @developerId");
			resultset = statement.executeQuery();
			
			resultset.close();
			statement.close();
			connection.close();
			
			} 
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		return developerId;
		
	}
	
	
		
	

    private static DeveloperDao instance = null;
    
    private DeveloperDao() {}
    
    @SuppressWarnings("unused")
	private static DeveloperDao getInstance() {
    	if (instance== null) {
    		instance = new DeveloperDao();
    	}
    	return instance;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
