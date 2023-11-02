package bookingsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class text extends JFrame implements ActionListener {
    // composing text field in GUI via JTextField
    static JTextField t;
    static JTextField t2;
    static JTextField t3;

    TimeManager timeManager = new TimeManager();
    Customer customer = new Customer("14 October","13", "A","b",889,0);

    // JFrame
    static JFrame f;

    // JButton
    static JButton b;
    static JButton b2;
    static JButton b3;

    // label to display text
    static JLabel l;

    static JLabel l2;

    static JLabel l3;

    // default constructor
    text()
    {
    }

    // main class for GUI
    public static void Gui()
    {
        // create a new frame to store text field and button
        f = new JFrame("textfield");

        // create a label to display text
        l = new JLabel("nothing entered");
        l2 = new JLabel("nothing entered");
        l3 = new JLabel("nothing");



        // create a new button
        b = new JButton("Add time");
        b2 = new JButton ("Change time");
        b3 = new JButton("Delete time");


        text te = new text();


        b.addActionListener(te);
        b2.addActionListener(te);
        b3.addActionListener(te);

        // create a object of JTextField  and a given initial text
        t = new JTextField("enter the text", 16);
        t2 = new JTextField("Edit time" );
        t3 = new JTextField("Enter customer's id");

        // create a panel to add buttons and textfield
        JPanel p = new JPanel();



        f.setLayout(null);
        f.setVisible(true);



        f.add(t);
        t.setBounds(100, 50, 220, 50);
        t.setBackground(Color.pink);

        f.add(t2);
        t2.setBounds(100, 150,220,50);
        t2.setBackground(Color.pink);

        f.add(t3);
        t3.setBounds(100,250,220,50);
        t3.setBackground(Color.pink);

        f.add(l);
        l.setBounds(100, 100, 220, 50);

        f.add(l2);
        l2.setBounds(100,200,220,50);

        f.add(l3);
        l3.setBounds(100,300,220,50);


        f.add(b);
        b.setBounds(350, 50, 220, 50);

        f.add(b2);
        b2.setBounds(350, 150, 220, 50);

        f.add(b3);
        b3.setBounds(350, 250, 220, 50);








        f.setSize(300, 300);

        f.show();
    }

    // if the button is pressed
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("Add time")) {
            // set the text of the label to the text of the field
            l.setText(t.getText());

            // set the text of field to blank
            t.setText(" ");
        }

        if (s.equals("Change time")) {
            // set the text of the label to the text of the field
            l2.setText(t2.getText());

            // set the text of field to blank
            t2.setText(" ");
        }

        if (s.equals("Delete time")) {
            // set the text of the label to the text of the field
            l3.setText(t3.getText());

            // set the text of field to blank
            t3.setText(" ");
        }



    }
}
