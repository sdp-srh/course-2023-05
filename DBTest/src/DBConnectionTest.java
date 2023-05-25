import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnectionTest {

	public static void main(String[] args) {
		try {
			System.out.println("Connecting to a database");
			
	        Class.forName("org.postgresql.Driver");
	        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectworksample","postgres", "admin");
	        
	        // Class.forName("com.mysql.jdbc.Driver");  
	        // Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");  
	        conn.setAutoCommit(false);
	        // create a statement
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT * FROM \"Person\" WHERE \"lastname\" = 'Duck'");
	        
	        while (rs.next()) {
	        	System.out.println("******** New Entry *********");
	        	System.out.println(rs.getString(1));
	        	System.out.println(rs.getString(2));
	        }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
