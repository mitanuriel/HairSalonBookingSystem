package bookingsystem;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;


public class TimeManager {
    private ArrayList<Customer> times;


   /*

   // private String desiredDate = "2023-11-02";


    /* public void Appointment(String date, String timeSlot) {
        this.date = date;
        this.timeSlot = timeSlot;
    } */



    /*private List<TimeManager> appointments;

    public void AppointmentScheduler() {
        appointments = new ArrayList<>();
    }

    public void addAppointment(String date, String timeSlot) {
        appointments.add(new TimeManager());
    }

    public List<String> findAvailableTimeSlots(String desiredDate) {
        List<String> availableTimeSlots = new ArrayList<>();
        return availableTimeSlots;
    }
*/

    // Hairdresser is open between 10am -18pm




    public boolean checkAvailability (String date, String timeSlot){

        boolean isSlotAvailable = true;
        for (Customer appointment : times) {
            if (appointment.getDate().equals(date) && appointment.getTimeSlot().equals(timeSlot)) {
                isSlotAvailable = false;
                break;
            }
        }


        if (Integer.parseInt(timeSlot) < 10 && Integer.parseInt(timeSlot) > 17){
            isSlotAvailable = false;

        }

        return  isSlotAvailable;
    }

    public void printSearch(String date){

        ArrayList<Integer> availableTimes = new ArrayList<>();

        for (int i = 10; i < 17; i++){

            if(checkAvailability(date, Integer.toString(i))) {
                availableTimes.add(i);
            }
        }

        for (Integer time : availableTimes) {
            System.out.println("Time " + time + " is available");
        }

    }
    TimeManager() {
        times = new ArrayList<>();
    }

    public ArrayList<Customer> getTimes() {
        return times;
    }

    public void AddCustomer(Customer customer) {
        this.times.add(customer);
    }

    public void setTimes(ArrayList<Customer> times) {
        this.times = times;
    }

    public void deleteCustomer(Customer customer) {
        ArrayList<Customer> temporary = new ArrayList<>();
        for (Customer user : times) {
            if (user.getId() != customer.getId()) {
                temporary.add(user);
            }
        }
        setTimes(temporary);
    }

    public void changeTime(Customer customer, String time) {
        for (Customer user : times) {
            if (user.getId() == customer.getId()) {
                user.setTimeSlot(time);
            }
        }

    }

}





