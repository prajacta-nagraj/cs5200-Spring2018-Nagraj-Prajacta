package datamodel.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class DeveloperDao {
	
	private static String DRIVER = "com.mysql.jdbc.Driver";
	private static String USERNAME=;
    private static String PASSWORD=;
    
    private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet resultset = null;
	
	public ArrayList<Developer> findAllDevelopers() {
		ArrayList<Developer> developers = new ArrayList<Developer>();
		try {
		Class.forName(DRIVER);
		connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		statement = connection.preparedStatement(" SELECT * FROM Developer");
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
		}
		resultset.close();
		
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private static int createDeveloper(Developer developer) {}
    private static DeveloperDao instance = null;
    
    private DeveloperDao() {}
    
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
