package first;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class jdbc_insert {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","mayukh123");
			
			PreparedStatement psmt=con.prepareStatement("insert into emp values(?,?,?)");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("Enter Emp id ");
				int eno=Integer.parseInt(br.readLine());
				
				System.out.println("Enter Emp name ");
				String ename=br.readLine();
				
				System.out.println("Enter Emp salary ");
				double sal=Double.parseDouble(br.readLine());
				
				psmt.setInt(1, eno);
				psmt.setString(2, ename);
				psmt.setDouble(3,sal);
				
				int count=psmt.executeUpdate();
				if(count>0)
					System.out.println(count+" record inserted ");
				else
					System.out.println("no record inserted..");
				
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
