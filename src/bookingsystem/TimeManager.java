package bookingsystem;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Locale;
import java.util.ArrayList;

public class TimeManager {
    private ArrayList<Customer> times;

    TimeManager(){
        times = new ArrayList<>();
    }

    public ArrayList<Customer> getTimes() {
        return times;
    }

    public void AddCustomer(Customer customer) {
        this.times.add(customer);
    }

    public void deleteCustomer(Customer customer){
        for (Customer user : times){
            if (user.getId() == customer.getId()){
                times.remove(customer);
            }
        }
    }

    public void changeTime(Customer customer, LocalTime time){
        for(Customer user : times){
            if(user.getId() == customer.getId()){
                user.setTime(time);
            }
        }

    }



}
