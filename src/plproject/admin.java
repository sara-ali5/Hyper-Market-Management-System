package plproject;

import java.sql.*;
import static plproject.dbAdd.connect;

public class admin extends UserDataBase{

    public admin(int ID, String userName, String password, int Tyof) {
        super(ID, userName, password, Tyof);
    }
    
    public void changePassword(String password) throws SQLException{
        try (
                Connection con = connect();  
                PreparedStatement p = con.prepareStatement("update Employees set Password=? where id=?");) {
            p.setString(1, password);
            p.setInt(2,getID());
            p.execute();
        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
    }

    public void changeUserName(String userName) throws SQLException{
        try (
                Connection con = connect();  
                PreparedStatement p = con.prepareStatement("update Employees set Name=? where id=?");) {
            p.setString(1, userName);
            p.setInt(2,getID());
            p.execute();
        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
    }
    
}
