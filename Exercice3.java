
import javax.swing.*;
import java.awt.GridLayout;

public class Exercice3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Form Layout");

            frame.setSize(400, 220);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            frame.setLayout(new GridLayout(3, 2, 10, 10));

            JLabel lastNameLabel = new JLabel("Last Name:");
            JTextField lastNameField = new JTextField();

            JLabel firstNameLabel = new JLabel("First Name:");
            JTextField firstNameField = new JTextField();

            JLabel cityLabel = new JLabel("City:");
            JTextField cityField = new JTextField();

            frame.add(lastNameLabel);
            frame.add(lastNameField);

            frame.add(firstNameLabel);
            frame.add(firstNameField);

            frame.add(cityLabel);
            frame.add(cityField);

            frame.setVisible(true);
        });
    }
}

