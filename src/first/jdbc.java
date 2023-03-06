package first;
import java.sql.*;
public class jdbc {
	
	

public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","mayukh123");
			Statement smt=con.createStatement();
			smt.executeUpdate("create table emp(eno number,ename varchar(12), esal number)");
			System.out.print("table created sucessfully.....");
			con.close();
			
		}
		
		catch(Exception e){
			System.out.print(e);
		}

	}

}
