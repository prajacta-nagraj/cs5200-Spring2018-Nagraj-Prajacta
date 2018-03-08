import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
	import java.util.Date;
public class WidgetDao {
	
	
		private static String DRIVER = "com.mysql.jdbc.Driver";
		private static String USERNAME="prajacta";
	    private static String PASSWORD="Mansi141194";
	    private static String DB_URL="jdbc:mysql://cs5200-spring2018-nagraj.cyrlsa4eq5ff.us-east-2.rds.amazonaws.com:3306/hw2_Nagraj_Prajacta_Spring_2018";
	    
	    private static Connection connection = null;
		private static PreparedStatement statement = null;
		private static ResultSet resultset = null;
		
		int createWidgetForPage(int pageId, Widget widget) {
			try {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
				PreparedStatement s = connection.prepareStatement("INSERT INTO widget VALUES (NULL,?,?,?,?,?,?,?");
				int r= s.executeUpdate();
				while(r==1) {
				   s.setString(1, widget.getName());
				   s.setInt(2, widget.getWidth());
				   s.setInt(3, widget.getHeight());
				   s.setString(4, widget.getCssStyle());
				   s.setString(5, widget.getCssClass());
				   s.setString(4, widget.getText());
				   s.setInt(5, widget.getOrder());
				  
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
		ArrayList<Widget> findAllWidgets(){
			ArrayList<Widget> widgets = new ArrayList<Widget>();
			try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement(" SELECT * FROM Widget");
			resultset = statement.executeQuery();
			while(resultset.next()) {
			   int id = resultset.getInt("id");
			   String name= resultset.getString("name");
	           int width= resultset.getInt("width");
	           int height= resultset.getInt("height");
	           String cssStyle= resultset.getString("cssStyle");
	           String cssClass = resultset.getString("cssClass");
	           String text= resultset.getString("text");
	           int order= resultset.getInt("order");
	           Widget widget = new Widget(id, name, width, height, cssStyle, cssClass, text, order);
	           widgets.add(widget);
	           return widgets;                      
			}
			
			resultset.close();
			statement.close();
			connection.close();
			
			} 
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return widgets;
			
		}
		Widget findWidgetById(int widgetId) {
			try {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
				statement = connection.prepareStatement(" SELECT * FROM Widget WHERE id= widgetId");
				resultset = statement.executeQuery();
				while(resultset.next()) {
				int id = resultset.getInt("id");
				String name= resultset.getString("name");
		           int width= resultset.getInt("width");
		           int height= resultset.getInt("height");
		           String cssStyle= resultset.getString("cssStyle");
		           String cssClass = resultset.getString("cssClass");
		           String text= resultset.getString("text");
		           int order= resultset.getInt("order");
		           Widget widget = new Widget(id, name, width, height, cssStyle, cssClass, text, order);
			           return widget;
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
		ArrayList<Widget> findWidgetsForPage(int pageId){
			ArrayList<Widget> widgets = new ArrayList<Widget>();
			try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement(" SELECT * FROM Widget WHERE pageId= @pageId");
			resultset = statement.executeQuery();
			while(resultset.next()) {
			   int id = resultset.getInt("id");
			   String name= resultset.getString("name");
	           int width= resultset.getInt("width");
	           int height= resultset.getInt("height");
	           String cssStyle= resultset.getString("cssStyle");
	           String cssClass = resultset.getString("cssClass");
	           String text= resultset.getString("text");
	           int order= resultset.getInt("order");
	           Widget widget = new Widget(id, name, width, height, cssStyle, cssClass, text, order);
	           widgets.add(widget);
		           return widgets;
	                            
			}
			
			resultset.close();
			statement.close();
			connection.close();
			
			} 
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return widgets;
			
		}
		int updateWidget(int widgetId, Widget widget) {
			try {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
				PreparedStatement s = connection.prepareStatement(" UPDATE Widget SET name=?, width=?, height=?, cssStyle=?, cssClass=?, text=?, order=? WHERE id= @widgetId");
				int r= s.executeUpdate();
				while(r==1) {
					s.setString(1, widget.getName());
					   s.setInt(2, widget.getWidth());
					   s.setInt(3, widget.getHeight());
					   s.setString(4, widget.getCssStyle());
					   s.setString(5, widget.getCssClass());
					   s.setString(4, widget.getText());
					   s.setInt(5, widget.getOrder());
					  
				}
		    
				resultset.close();
				statement.close();
				connection.close();
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		                                 }
			return widgetId;
		}
		int deleteWidget(int widgetId) {
			try {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
				statement = connection.prepareStatement(" DELETE FROM Widget WHERE id= @widgetId");
				resultset = statement.executeQuery();
				
				
				
				resultset.close();
				statement.close();
				connection.close();
				
				} 
				catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
			return widgetId;
		}
		

	}


