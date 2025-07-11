import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ATMLoginPanel extends JPanel {
    private JTextField userField;
    private JPasswordField pinField;
    private JButton loginButton;

    public ATMLoginPanel(ActionListener loginAction) {
        setLayout(new GridLayout(4, 1, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        userField = new JTextField();
        pinField = new JPasswordField();
        loginButton = new JButton("Login");

        add(new JLabel("Enter User ID:"));
        add(userField);
        add(new JLabel("Enter PIN:"));
        add(pinField);
        add(loginButton);

        loginButton.addActionListener(loginAction);
    }

    public String getUserId() {
        return userField.getText();
    }

    public String getPin() {
        return new String(pinField.getPassword());
    }
}
