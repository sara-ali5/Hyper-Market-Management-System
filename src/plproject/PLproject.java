package plproject;
//import java.sql.*;
//import java.sql.Connection;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static plproject.dbAdd.addEmployee;
import static plproject.dbUpdate.updateEmployee;
import static plproject.dbDelete.deleteEmployee;
import static plproject.dbSearch.searchEmployee;
public class PLproject {

    public static void main(String[] args) {
        try {
            //addEmployee(77,"Salma","8390",4);
            //updateEmployee(77,"Habiba","6767",3);
            //deleteEmployee(66);
            String emp = searchEmployee(5);
            System.out.println(emp);
            //admin a = new admin (1,"Salma","123",1);
            //a.changeUserName("Habiba");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
/*public static ArrayList<UserDataBase> getEmployees () {
        //this method returns a list of employees with thier info
        ArrayList<UserDataBase> list = new ArrayList<>();
        try (
            Connection con = connect() ;
            PreparedStatement p = con.prepareStatement("select * from Employees");){
            ResultSet r = p.executeQuery();
            
            while (r.next()) {
                list.add(new UserDataBase(r.getInt("Id"),r.getString("Name"),r.getString("Password"),r.getInt("Tyof")));
            }
        }
        catch(SQLException ee) {
            System.out.println(ee.getMessage());
        }
        return list;
    }*/
    