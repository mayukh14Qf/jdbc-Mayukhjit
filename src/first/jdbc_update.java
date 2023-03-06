package first;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class jdbc_update {

	public static void main(String[] args) {
		String value; int eid; double esal;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","mayukh123");
			
			Statement smt=con.createStatement();
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			
				System.out.println("Enter Emp id ");
				value=br.readLine();
				eid=Integer.parseInt(value);
				
				System.out.println("Enter Emp New salary  ");
				value=br.readLine();
				esal=Double.parseDouble(value);
				
				int count=smt.executeUpdate("update emp set esal="+esal+"where eno="+eid);
				if(count>0)
					System.out.println(count+" rows updated ");
				else
					System.out.println("no row updated..");
				
		}
		catch(Exception e) {
			System.out.print(e);
		}

	}

}