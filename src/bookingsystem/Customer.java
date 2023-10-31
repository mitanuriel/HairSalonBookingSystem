package bookingsystem;
import java.time.LocalTime;
import java.util.Locale;
public class Customer {
    private LocalTime time;
    private String name;
    private String email;
    private int phoneNumber;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    //TODO: getId, setId, toString ad id field, add to constuctor


    Customer (LocalTime time,String name, String email, int phoneNumber, int id){

        setTime(time);
        setName(name);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setId(id);
    }




    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "time =" + time +
                ", name='" + name + '\'' +
                ", id = " + id + '\'' +
                ", email='" + email + '\'' +
                ", phone number =" + phoneNumber +
                '}';
    }
}
