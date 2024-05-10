package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Emp_Database {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Aasim@123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM emp");
            System.out.println("Emp_Id"+" "+"Emp_Name"+" "+"Emp_Salary");
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
