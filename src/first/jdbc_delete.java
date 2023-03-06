package first;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class jdbc_delete {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","mayukh123");
			
			Statement smt=con.createStatement();
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("Enter deletion  Emp id ");
				int eno=Integer.parseInt(br.readLine());
				
				
				int count=smt.executeUpdate("delete from emp where eno="+eno);
				if(count==1)
					System.out.println(count+" row deleted ");
				else
					System.out.println("no record deleted..");
				
				System.out.println("do you want to more records");
				
				String ch=br.readLine();
				if(ch.equalsIgnoreCase("no"))
					break;
				
			}
		}
		catch(Exception e) {
			System.out.print(e);
		}

	}

}
