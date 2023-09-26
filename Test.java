/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author ADMIN
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String connectionUrl = "jdbc:sqlserver://TUNG\\MSSQLLVT:1433;databaseName=Lop2;user=sa;password=Tung;encrypt=false;";

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            System.out.println("Da ket noi CSDL");
            java.sql.Statement st=con.createStatement();
            String sqlString=" ";
            //sqlString="Insert into Lop(Malop,Tenlop) values(1234,N'Hoa');";
            //st.executeUpdate(sqlString);
           // sqlString="Update Lop set Tenlop=N'Toan' Where Malop=123";
            //st.executeUpdate(sqlString);
            //sqlString= "Delete from Lop Where Malop=1234";
            //st.executeUpdate(sqlString);
            String SQL = "SELECT * FROM Lop";
            ResultSet rs = stmt.executeQuery(SQL);
            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("Malop") + " " + rs.getString("Tenlop"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
}