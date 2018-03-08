import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
public class PageDao {
	private static String DRIVER = "com.mysql.jdbc.Driver";
	private static String USERNAME="prajacta";
    private static String PASSWORD="Mansi141194";
    private static String DB_URL="jdbc:mysql://cs5200-spring2018-nagraj.cyrlsa4eq5ff.us-east-2.rds.amazonaws.com:3306/hw2_Nagraj_Prajacta_Spring_2018";
    
    private static Connection connection = null;
	private static PreparedStatement statement = null;
	private static ResultSet resultset = null;
	
	int createPageForWebsite(int websiteId, Page page) {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			PreparedStatement s = connection.prepareStatement(
		 "INSERT INTO page VALUES (NULL,?,?,?,?,?");
			int r= s.executeUpdate();
			while(r==1) {
			   s.setString(1, page.getTitle());
			   s.setString(2, page.getDescription());
			   s.setDate(3, page.getCreated());
			   s.setDate(4, page.getUpdated());
			   s.setInt(5, page.getViews());
			  
			}
	    
			resultset.close();
			statement.close();
			connection.close();
	} 
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
		return websiteId;
	}
	ArrayList<Page> findAllPages(){
		ArrayList<Page> pages = new ArrayList<Page>();
		try {
		Class.forName(DRIVER);
		connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		statement = connection.prepareStatement(" SELECT * FROM Page");
		resultset = statement.executeQuery();
		while(resultset.next()) {
		   int id = resultset.getInt("id");
		   String title= resultset.getString("title");
           String description= resultset.getString("description");
           Date created= resultset.getDate("created");
           Date updated= resultset.getDate("updated");
           int views = resultset.getInt("views");
           Page page = new Page(id, title, description, created, updated, views);
           pages.add(page);
           return pages;                      
		}
		
		resultset.close();
		statement.close();
		connection.close();
		
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return pages;
		
	}
	Page findPageById(int pageId) {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement(" SELECT * FROM Page WHERE id= pageId");
			resultset = statement.executeQuery();
			while(resultset.next()) {
			int id = resultset.getInt("id");
		    String title= resultset.getString("title");
		           String description= resultset.getString("description");
		           Date created= resultset.getDate("created");
		           Date updated= resultset.getDate("updated");
		           int views = resultset.getInt("views");
		           Page page = new Page(id, title, description, created, updated, views);
		           return page;
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
	ArrayList<Page> findPagesForWebsite(int websiteId){
		ArrayList<Page> pages = new ArrayList<Page>();
		try {
		Class.forName(DRIVER);
		connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		statement = connection.prepareStatement(" SELECT * FROM Page WHERE websiteId= @websiteId");
		resultset = statement.executeQuery();
		while(resultset.next()) {
		   int id = resultset.getInt("id");
		   String title= resultset.getString("title");
           String description= resultset.getString("description");
           Date created= resultset.getDate("created");
           Date updated= resultset.getDate("updated");
           int views = resultset.getInt("views");
           Page page = new Page(id, title, description, created, updated, views);
         pages.add(page);
           return pages;                      
		}
		
		resultset.close();
		statement.close();
		connection.close();
		
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return pages;
		
	}
	int updatePage(int pageId, Page page) {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			PreparedStatement s = connection.prepareStatement("UPDATE Page SET title=?, description=?, created=?, updated=?, views=? WHERE id= @pageId ");
			int r= s.executeUpdate();
			while(r==1) {
				s.setString(1, page.getTitle());
				s.setString(2, page.getDescription());
				s.setDate(3, page.getCreated());
				s.setDate(4, page.getUpdated());
				s.setInt(5, page.getViews());
				  
			}
	    
			resultset.close();
			statement.close();
			connection.close();
	} 
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	                                 }
		return pageId;
	}
	int deletePage(int pageId) {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement(" DELETE FROM Page WHERE id= @pageId");
			resultset = statement.executeQuery();
			
			
			
			resultset.close();
			statement.close();
			connection.close();
			
			} 
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		return pageId;
	}
	

}
