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







    }
}