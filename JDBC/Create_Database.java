package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Create_Database {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Aasim@123");
            Statement st = con.createStatement();
            String query = "create table students(s_id int, s_name varchar(30))";
            String ins = "insert into students value(1,'Aasim')";
            st.executeUpdate(query);
            st.executeUpdate(ins);
            st.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
