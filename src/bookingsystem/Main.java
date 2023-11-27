package bookingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalTime;


public class Main {

    public static void main(String[] args) {

        new Main().run();
        System.out.println("Test commit");
    }
    public void run() {



        Scanner scanner = new Scanner(System.in);

        //Constructor for Harry login
        Hairdresser Harry = new Hairdresser("Harry", "123");


        //printing menu outlook to the console and basic GUI
        if (Harry.LogIn()) {
            text gui = new text();
            text.Gui();
        }
        // Constructor for Revisor login
        Revisor Henry = new Revisor("Henry");
        Henry.LogIn();

       //booking appointment system: search functionality

        TimeManager timeManager = new TimeManager();
        System.out.println("Please enter date to search for available times :");
        String input = scanner.nextLine();

// to enter 14 October in console as a desired date to check the calendar of available times
        Customer customer = new Customer("14 October","13", "A","b",889,0);
        Customer customer2 = new Customer("14 October", "14","V","C",5757,2);
        timeManager.AddCustomer(customer);
        timeManager.AddCustomer(customer2);
        timeManager.printSearch(input);
        timeManager.deleteCustomer(customer2);
    }



}

