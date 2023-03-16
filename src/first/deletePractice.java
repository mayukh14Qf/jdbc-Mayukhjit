package first;

import java.sql.*;
import java.io.*;
public class deletePractice {

	public static void main(String[] args) {
		try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","mayukh123");

            Statement smt=con.createStatement();
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            while (true){
                System.out.println("the row you want to delete that's  id ");
                int s_id=Integer.parseInt(br.readLine());
                
                int count=smt.executeUpdate("delete from students where s_id="+s_id);
                
                if(count==1){
                    System.out.println(count+" row deleted");
                }
                else {
                    System.out.println("no row deleted");
                }
                System.out.println("do you want to delete again");
                String ch= br.readLine();
                if(ch.equalsIgnoreCase("no")){
                    break;
                }
                
            }

        }
        catch (Exception e){
            System.out.println(e);
        }

	}

}
