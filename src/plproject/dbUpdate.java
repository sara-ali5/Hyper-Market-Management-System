package plproject;

import java.sql.*;

import static plproject.dbAdd.connect;

public class dbUpdate {
    public static void updateEmployee (int Id,String Name, String Password, int Tyof) throws SQLException{
        // this method update info of an Employee by his id 
        try( 
                Connection con = connect();  
                PreparedStatement p = con.prepareStatement("update Employees set Name=? , Password=? , Tyof=? where id=?");) {
                p.setString(1, Name);
                p.setString(2, Password);
    
                p.setInt(3, Tyof);
                p.setInt(4, Id);
                p.execute();
        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
        }
        
    }
