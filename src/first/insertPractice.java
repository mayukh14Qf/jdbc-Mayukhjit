package first;

import java.util.*;
import java.sql.*;
import java.io.*;

public class insertPractice {

	public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","mayukh123");

            PreparedStatement psmt=con.prepareStatement("insert into students values(?,?)");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            
            while (true){
                System.out.println("enter student id");
                int e_id =Integer.parseInt(br.readLine());

                System.out.println("enter student name");
                String s_name= br.readLine();
                
                psmt.setInt(1,e_id);
                psmt.setString(2,s_name);
                
                int count= psmt.executeUpdate();
                if(count>0){
                    System.out.println(count+" row inserted ");
                }
                else {
                    System.out.println("no row inserted ");
                }
                System.out.println("do you want to insert more rows ");
                String ch=br.readLine();
                if (ch.equalsIgnoreCase("no")){
                    break;
                }
            }
         }
         catch (Exception e){
             System.out.println(e);
         }
    }

}

