package first;

import java.sql.*;
import java.io.*;

public class updatePractice {

	public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","mayukh123");

            Statement smt=con.createStatement();
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

            System.out.println("enter student id , you want to update ");
            int s_id=Integer.parseInt(br.readLine());

            System.out.println("enter new student name respect to student id ");
            String s_name=br.readLine();

            int count =smt.executeUpdate("update students set s_name='"+s_name+"' where s_id="+s_id); // for varchar, varchar2 '' should be maintained

            if(count>0){
                System.out.println(count+" row updated ");
            }
            else {
                System.out.println("no row updated");
            }
            
        }
        catch (Exception e){
            System.out.println(e);
        }

	}

}
