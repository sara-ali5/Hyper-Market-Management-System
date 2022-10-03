package plproject;

//employees
public class UserDataBase {

    private String userName, password;
    private int ID, Tyof;

    public UserDataBase(int ID, String userName, String password, int Tyof) {
        this.ID = Tyof;
        this.userName = userName;
        this.password = password;
        this.Tyof = Tyof;
    }

    //  set info
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDepartment(int Tyof) {
        this.Tyof = Tyof;
    }

    //  Get info
    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getDepartment() {
        return Tyof;
    }
}
