package bookingsystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalTime;


public class Main {

    public static void main(String[] args) {

        new Main().run();
    }
    public void run() {

        Scanner scanner = new Scanner(System.in);

        Hairdresser Harry = new Hairdresser("123", "123");
        Hairdresser check = new Hairdresser("223", "123");


        if (Harry.LogIn(Harry)) {
            Menu menu = new Menu();
            menu.printMenu();
            menu.toMakeButtons();
        }



        TimeManager timeManager = new TimeManager();
        Customer customer = new Customer(LocalTime.of(12, 30),"A","b",889,0);
        Customer customer2 = new Customer(LocalTime.of(13, 30),"V","C",5757,2);
        timeManager.AddCustomer(customer);
        timeManager.AddCustomer(customer2);
        timeManager.changeTime(customer, LocalTime.of(14, 30));

        ArrayList<Customer> test = timeManager.getTimes();
        for (Customer user : test){
            System.out.println(user);
        }
    }



}

