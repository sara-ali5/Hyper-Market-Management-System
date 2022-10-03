package plproject;

import java.sql.*; 

public class dbAdd {
    
    //connection to the database
    public static Connection connect() throws SQLException {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB";
        String username = "new";
        String password = "123456";
        return DriverManager.getConnection(url, username, password);
    }
    
    public static void addEmployee(int Id, String Name, String Password, int Tyof) throws SQLException {
        //this method insert info of a new employee in database
        try (
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("insert into Employees values (?,?,?,?)");){
            p.setInt(1, Id);
            p.setString(2, Name);
            p.setString(3, Password);
            p.setInt(4, Tyof);
            p.execute();
        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }

    }
    
    
}
