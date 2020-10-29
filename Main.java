import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JTextField nameInput;

  JButton greetButton;

  JLabel helloLabel;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    //initialize main JPanel
    mainPanel = new JPanel();
    //disable layout helpers
    mainPanel.setLayout(null);

    //initialize input text fields
    nameInput = new JTextField();

    //set location and size for input text fields
    nameInput.setBounds(200, 100, 200, 40);

    //initialize greeting button
    greetButton = new JButton("Say Hello");

    //set location and size for greet button
    greetButton.setBounds(200, 400, 200, 40);

    //add action listener to button
    greetButton.addActionListener(this);

    //initialize label to greet user
    helloLabel = new JLabel();

    //set location and size for label
    helloLabel.setBounds(200, 250, 300, 40);

    //adds everything to main mainPanel
    mainPanel.add(nameInput);
    mainPanel.add(greetButton);
    mainPanel.add(helloLabel);

    //add panel to window
    frame.add(mainPanel);
 
    

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    //gets user input
    String userName = nameInput.getText();

    //sets the label as a greeting
    helloLabel.setText("Hello " + userName);

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
