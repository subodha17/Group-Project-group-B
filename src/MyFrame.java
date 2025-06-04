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
