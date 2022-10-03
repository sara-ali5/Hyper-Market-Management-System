package plproject;

import java.sql.*;

import static plproject.dbAdd.connect;

public class dbDelete {

    public static void deleteEmployee(int Id) throws SQLException {
        // this method delete an employee with his id
        try (
                Connection con = connect();  
                PreparedStatement p = con.prepareStatement("delete from Employees where Id = ?");) {
                p.setInt(1, Id);
                p.execute();
        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
    }
}
