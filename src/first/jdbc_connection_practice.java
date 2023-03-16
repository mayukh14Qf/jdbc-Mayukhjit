package first;
import java.sql.*;
public class jdbc_connection_practice {

	

public static void main(String[] args) {
		
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "mayukh123");
        Statement smt=con.createStatement();
        smt.executeUpdate("create table students (s_id number,s_name varchar2(50))");
        System.out.println("table created successfully....");
        con.close();
    }
    catch (Exception e){
        System.out.println(e);
    }
}
}
