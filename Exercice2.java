
import javax.swing.*;
import java.awt.FlowLayout;

public class Exercice2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("User Input");

            frame.setSize(350, 180);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            frame.setLayout(new FlowLayout());

            JLabel label = new JLabel("Enter your name:");
            JTextField textField = new JTextField(15);
            JButton button = new JButton("Submit");

            frame.add(label);
            frame.add(textField);
            frame.add(button);

            frame.setVisible(true);
        });
    }
}

