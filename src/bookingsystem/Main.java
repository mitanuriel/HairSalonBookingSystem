package bookingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalTime;


public class Main {

    public static void main(String[] args) {

        new Main().run();
    }
    public void run() {



        Scanner scanner = new Scanner(System.in);

        //Constructor for Harry login
        Hairdresser Harry = new Hairdresser("Harry", "123");
        Hairdresser check = new Hairdresser("223", "123");


        //printing menu outlook to the console and basic GUI
        if (Harry.LogIn()) {
            Menu menu = new Menu();
            menu.printMenu();
            menu.toMakeButtons();
        }
        // Constructor for Revisor login
        Revisor obj = new Revisor("Henry", "321");
        obj.isLoggedIn(true);
        System.out.println(obj.isLoggedIn());

       //booking appointment system: search functionality



        TimeManager timeManager = new TimeManager();
        System.out.println("Please enter date to search for available times :");
        String input = scanner.nextLine();

        Customer customer = new Customer("14 October","13", "A","b",889,0);
        Customer customer2 = new Customer("14 October", "14","V","C",5757,2);
        timeManager.AddCustomer(customer);
        timeManager.AddCustomer(customer2);
        timeManager.printSearch(input);
        timeManager.deleteCustomer(customer2);
//TODO: print booked times

        ArrayList<Customer> test = timeManager.getTimes();
        for (Customer user : test){
            System.out.println(user);
        }
    }



}

