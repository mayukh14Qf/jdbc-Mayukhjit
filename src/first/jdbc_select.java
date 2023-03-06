package first;
import java.sql.*;
public class jdbc_select {

	public static void main(String[] args) {
				try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","mayukh123");
			
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from emp");
			
			while(rs.next()) {
				int eid=rs.getInt(1);
				String ename=rs.getString(2);
				double esal=rs.getDouble(3);
				
				System.out.println("emp id: "+eid);
				System.out.println("emp name: "+ename);
				System.out.println("emp salary: "+esal);
				System.out.println();
			}
		   		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
