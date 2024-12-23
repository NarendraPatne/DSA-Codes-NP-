import java.awt.*;
import java.awt.event.*;  // To handle window events

public class Wxxs extends Frame {

    // Constructor to set up the UI components
    public Wxxs() {
        // Set the title of the Frame
        setTitle("Simple AWT UI Example");

        // Set the Layout Manager for the Frame
        setLayout(new BorderLayout());

        // Create a panel for the top section (North) using FlowLayout
        Panel topPanel = new Panel();
        topPanel.setLayout(new FlowLayout());
        topPanel.setBackground(Color.LIGHT_GRAY);

        // Add a Label to the top panel with customized font and color
        Label titleLabel = new Label("AWT UI Example", Label.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.BLUE);
        topPanel.add(titleLabel);

        // Add the top panel to the North region of the Frame
        add(topPanel, BorderLayout.NORTH);

        // Create a panel for the center section
        Panel centerPanel = new Panel();
        centerPanel.setLayout(new FlowLayout());

        // Add a Label and a TextField to the center panel
        Label nameLabel = new Label("Enter your name:");
        nameLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
        TextField nameField = new TextField(20);
        nameField.setFont(new Font("SansSerif", Font.PLAIN, 16));

        // Add components to the center panel
        centerPanel.add(nameLabel);
        centerPanel.add(nameField);

        // Add the center panel to the center region of the Frame
        add(centerPanel, BorderLayout.CENTER);

        // Create a panel for the bottom section (South)
        Panel bottomPanel = new Panel();
        bottomPanel.setLayout(new FlowLayout());

        // Add two buttons to the bottom panel with customized fonts and colors
        Button submitButton = new Button("Submit");
        submitButton.setFont(new Font("Dialog", Font.BOLD, 16));
        submitButton.setForeground(Color.WHITE);
        submitButton.setBackground(Color.GREEN);

        Button clearButton = new Button("Clear");
        clearButton.setFont(new Font("Dialog", Font.BOLD, 16));
        clearButton.setForeground(Color.WHITE);
        clearButton.setBackground(Color.RED);

        // Add the buttons to the bottom panel
        bottomPanel.add(submitButton);
        bottomPanel.add(clearButton);

        // Add the bottom panel to the South region of the Frame
        add(bottomPanel, BorderLayout.SOUTH);

        // Add WindowListener to handle window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);  // Close the window and exit the program
            }
        });

        // Set the size of the Frame
        setSize(400, 300);

        // Set the Frame to be visible
        setVisible(true);
    }

    // Main method to run the UI application
    public static void main(String[] args) {
        // Create an instance of the UI
        new Wxxs();
    }
}
