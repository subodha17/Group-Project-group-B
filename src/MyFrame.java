import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame {
    // Constants for frame dimensions and position
    private static final int FRAME_WIDTH = 1000;
    private static final int FRAME_HEIGHT = 600;
    private static final int FRAME_X_ORIGIN = 0;
    private static final int FRAME_Y_ORIGIN = 0;

    public MyFrame() {
        // Set up the frame
        getContentPane().setLayout(null);
        setTitle("Registration Form");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create label for title
        JLabel titleLabel = new JLabel("Registration Form");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 28));
        titleLabel.setSize(400, 30);
        titleLabel.setLocation(FRAME_WIDTH / 2 - 100, 30);
        getContentPane().add(titleLabel);

        // Create label for name
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        nameLabel.setSize(100, 30);
        nameLabel.setLocation(100, 100);
        getContentPane().add(nameLabel);

        // Create text field for name input
        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 15));
        nameField.setSize(270, 25);
        nameField.setLocation(200, 100);
        getContentPane().add(nameField);

        // Create label for mobile number
        JLabel mobileNoLabel = new JLabel("Mobile");
        mobileNoLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        mobileNoLabel.setSize(100, 30);
        mobileNoLabel.setLocation(100, 150);
        getContentPane().add(mobileNoLabel);

        // Create text field for mobile number input
        JTextField mobileNoField = new JTextField();
        mobileNoField.setFont(new Font("Arial", Font.PLAIN, 15));
        mobileNoField.setSize(220, 25);
        mobileNoField.setLocation(200, 150);
        getContentPane().add(mobileNoField);

        // Create label for gender
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        genderLabel.setSize(100, 30);
        genderLabel.setLocation(100, 200);
        getContentPane().add(genderLabel);

        // Create radio button for male
        JRadioButton male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(100,30);
        male.setLocation(200, 200);
        getContentPane().add(male);

        // Create radio button for female
        JRadioButton female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(100,30);
        female.setLocation(300, 200);
        getContentPane().add(female);

        // Add radio buttons to a button group
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        // Create label for date of birth
        JLabel dobLabel = new JLabel("DOB");
        dobLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        dobLabel.setSize(100, 30);
        dobLabel.setLocation(100, 250);
        getContentPane().add(dobLabel);

        // Create a string to hold the days
        String [] days = new String[31];
        for (int i = 1; i <= 31; i++) {
            days[i - 1] = String.valueOf(i);
        }

        // Create combo box for days
        JComboBox<String> dayComboBox = new JComboBox<>(days);
        dayComboBox.setFont(new Font("Arial", Font.PLAIN, 15));
        dayComboBox.setSize(50, 20);
        dayComboBox.setLocation(200, 255);
        getContentPane().add(dayComboBox);

        // Create string to hold the months
        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        // Create combo box for months
        JComboBox<String> monthComboBox = new JComboBox<>(months);
        monthComboBox.setFont(new Font("Arial", Font.PLAIN, 15));
        monthComboBox.setSize(60, 20);
        monthComboBox.setLocation(250, 255);
        getContentPane().add(monthComboBox);

        // Create string to hold the years
        String [] years = new String[25];
        for (int i = 0; i < 25; i++) {
            years[i] = String.valueOf(1995+i);
        }

        // Create combo box for years
        JComboBox<String> yearComboBox = new JComboBox<>(years);
        yearComboBox.setFont(new Font("Arial", Font.PLAIN, 15));
        yearComboBox.setSize(80, 20);
        yearComboBox.setLocation(320, 255);
        getContentPane().add(yearComboBox);

        // Create label for address
        JLabel addressLabel = new JLabel("Address");
        addressLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        addressLabel.setSize(100, 30);
        addressLabel.setLocation(100, 300);
        getContentPane().add(addressLabel);

        // Create text area for address input
        JTextArea addressArea = new JTextArea();
        addressArea.setFont(new Font("Arial", Font.PLAIN, 15));
        addressArea.setSize(270, 100);
        addressArea.setLocation(200, 300);
        getContentPane().add(addressArea);

        // Create checkbox for terms and conditions
        JCheckBox termsCheckBox = new JCheckBox("Accept Terms and Conditions.");
        termsCheckBox.setFont(new Font("Arial", Font.PLAIN, 15));
        termsCheckBox.setSize(250, 30);
        termsCheckBox.setLocation(150, 420);
        getContentPane().add(termsCheckBox);

        // Create submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
        submitButton.setSize(100, 20);
        submitButton.setLocation(150, 470);
        getContentPane().add(submitButton);

        // Create reset button
        JButton resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Arial", Font.PLAIN, 15));
        resetButton.setSize(100, 20);
        resetButton.setLocation(270, 470);
        getContentPane().add(resetButton);

        // Create text area for output
        JTextArea outputArea = new JTextArea();
        outputArea.setFont(new Font("Arial", Font.PLAIN, 15));
        outputArea.setSize(350, 430);
        outputArea.setLocation(550, 100);
        outputArea.setEditable(false);
        getContentPane().add(outputArea);

        // Create label for displaying sucess or error messages
        JLabel messageLabel = new JLabel("");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        messageLabel.setSize(400, 30);
        messageLabel.setLocation(100, 510);
        add(messageLabel);

        // Add action listeners for submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if the terms and condition checkbox is selected
                if (termsCheckBox.isSelected())
                {
                    messageLabel.setText( "Registration Successfully..");
                    String name = nameField.getText();
                    String mobile = mobileNoField.getText();
                    String gender = null;
                    if (male.isSelected())
                        gender = "Male";
                    else
                        gender = "Female";
                    String address = addressArea.getText();
                    String dob = dayComboBox.getSelectedItem() + "/" + monthComboBox.getSelectedItem() + "/" + yearComboBox.getSelectedItem();

                    // Display the output in the output area
                    outputArea.setText("Name: "+name+"\nMobile: "+mobile+"\nGender: "+gender+"\nDOB: "+dob+"\nAddress: "+address);
                }
                // if the terms and condition checkbox is not selected
                else
                {
                    messageLabel.setText("Please accept the terms & conditions..");
                }
            }
        });

        // Create action listener for reset button
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset all fields to their default values
                nameField.setText("");
                mobileNoField.setText("");
                gender.clearSelection();
                male.setSelected(true);
                dayComboBox.setSelectedIndex(0);
                monthComboBox.setSelectedIndex(0);
                yearComboBox.setSelectedIndex(0);
                addressArea.setText("");
                termsCheckBox.setSelected(false);
                messageLabel.setText("");
                outputArea.setText("");
            }
        });
    }
}
