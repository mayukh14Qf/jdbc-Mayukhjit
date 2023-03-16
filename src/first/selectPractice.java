package first;

import java.sql.*;
import java.io.*;

public class selectPractice {

	public static void main(String[] args) {
        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","mayukh123");
            
            Statement smt=con.createStatement();
            ResultSet rs= smt.executeQuery("select * from students");
            
            while(rs.next()){
                int sId=rs.getInt(1);
                String sName=rs.getString(2);

                System.out.println("s_id is : "+sId);
                System.out.println("s_name is : "+sName);
                System.out.println();
            }

        }
        catch (Exception e){
            System.out.println(e);
        }

	}

}
