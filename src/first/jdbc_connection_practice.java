package first;
import java.sql.*;
public class jdbc_connection_practice {
	
	

public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","mayukh123");
			
			Statement smt1=con1.createStatement();
			smt1.executeUpdate("create table std(name varchar(50), roll number)");
			System.out.println("table created sucessfully...");
			con1.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
