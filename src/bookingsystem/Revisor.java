package bookingsystem;
import java.util.Scanner;
public class Revisor {

    private String userNameRevisor;
    private int HashcodepasswordRevisor;

    Scanner scanner = new Scanner(System.in);





    Revisor(String userNameRevisor) {
       this.userNameRevisor = userNameRevisor;
       this.HashcodepasswordRevisor = 48690; // this is hashcode for password 123
    }


    public boolean LogIn(){

        System.out.println("Enter Revisor username: ");
        String Username = scanner.next();
        System.out.println("Enter Revisor password: ");
        String Password = scanner.next();

        if (Username.equals(this.getUserNameRevisor()) && Password.hashCode() == HashcodepasswordRevisor ) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Login failed.");
            return false;
        }
    }

    public void setUserNameRevisor(String userNameRevisor) {
        this.userNameRevisor = userNameRevisor;
    }

    public String getUserNameRevisor() {
        return userNameRevisor;
    }

    public int getHashcodepasswordRevisor() {
        return HashcodepasswordRevisor;
    }
}
