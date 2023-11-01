package bookingsystem;
import java.time.LocalTime;
import java.util.Locale;
public class Customer {

    public void setDate(String date) {
        this.date = date;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    private String date;
    private String timeSlot;

    private String name;
    private String email;
    private int phoneNumber;
    private int id;

    public String getDate() {
        return date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    //TODO: getId, setId, toString ad id field, add to constuctor


    Customer (String date, String timeSlot, String name, String email, int phoneNumber, int id){

        setDate(date);
        setTimeSlot(timeSlot);
        setName(name);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setId(id);
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
                "date =" + date +
                ", name='" + name + '\'' +
                ", id = " + id + '\'' +
                ", email='" + email + '\'' +
                ", phone number =" + phoneNumber +
                '}';
    }
}
