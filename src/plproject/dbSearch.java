package plproject;

import java.sql.*;

import static plproject.dbAdd.connect;

public class dbSearch {

    public static String searchEmployee(int Id) throws SQLException {
        // this method search an employee by his id and returns his info as a string
        String info = "";
        try (
                 Connection con = connect();  PreparedStatement p = con.prepareStatement("select * from Employees where Id = ?");) {
            p.setInt(1, Id);
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                do {
                    info = rs.getString("Name") + "," + rs.getString("Password") + "," + rs.getInt("Tyof");
                } while (rs.next());
            }
        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
        return info;

    }
}
