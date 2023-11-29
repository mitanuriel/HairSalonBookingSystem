package bookingsystem;
import java.util.Scanner;
public class Accountant {

    private String userNameAccountant;
    private int HashcodepasswordAccountant;

    Scanner scanner = new Scanner(System.in);





    Accountant(String userNameAccountant) {
       this.userNameAccountant = userNameAccountant;
       this.HashcodepasswordAccountant = 48690; // this is hashcode for password 123
    }


    public boolean LogIn(){

        System.out.println("Enter Accountant username: ");
        String Username = scanner.next();
        System.out.println("Enter Accountant password: ");
        String Password = scanner.next();

        if (Username.equals(this.getUserNameAccountant()) && Password.hashCode() == this.getHashcodepasswordAccountant() ) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Login failed.");
            return false;
        }
    }

    public int getHashcodepasswordAccountant() {
        return HashcodepasswordAccountant;
    }

    public void setHashcodepasswordAccountant(int hashcodepasswordAccountant) {
        HashcodepasswordAccountant = hashcodepasswordAccountant;
    }

    public String getUserNameAccountant() {
        return userNameAccountant;
    }

    public void setUserNameAccountant(String userNameAccountant) {
        this.userNameAccountant = userNameAccountant;
    }
}
