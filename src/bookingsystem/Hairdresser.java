package bookingsystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hairdresser {

    private String username;
    private String password;

    Scanner scanner = new Scanner(System.in);


    Hairdresser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean LogIn(){

        System.out.println("Enter username: ");
        String getUsername = scanner.next();
        System.out.println("Enter password: ");
        String getPassword = scanner.next();

        if (getPassword.equals(this.getPassword()) && getUsername.equals(this.getUsername())) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Login failed.");
            return false;
        }
    }


}









