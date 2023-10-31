package bookingsystem;
import java.time.LocalTime;
import java.util.Scanner;
import java.awt.*;

public class Menu {

    public void toMakeButtons(){
        Frame f = new Frame();
        Button b1 = new Button("ADD TIME");
        b1.setBounds(150, 200, 220, 50);
        f.add(b1);
        Button b2 = new Button("CHANGE TIME");
        b2.setBounds(150, 200, 220, 50);
        f.add(b2);
        Button b3 = new Button("DELETE TIME");
        b3.setBounds(150, 200, 220, 50);
        f.add(b3);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setVisible(b2.isVisible());
        f.setVisible(b3.isVisible());
    }


    public void printMenu(){
        System.out.println("Select: " + "\n" +
                "1. Add new time " + '\n' +
                "2. Change time " + '\n' +
                "3. Remove time ");
    }

    public int nextChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean validchoice = true;
        while (validchoice) {
            if (choice == 0) {
                choice = scanner.nextInt();
                validchoice = false;
            } else {
                scanner.nextInt();
            }
        }
        return choice;

    }
}
