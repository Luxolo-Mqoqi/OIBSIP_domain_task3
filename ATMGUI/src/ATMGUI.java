import atmgui.ATM;
import javax.swing.*;
import java.awt.*;

public class ATMGUI {
    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel mainPanel;

    private ATMLoginPanel loginPanel;
    private ATMMenuPanel menuPanel;

    private ATM atm = new ATM();

    private final String correctUserId = "Luxolo";
    private final String correctPin = "1234";

    public ATMGUI() {
        frame = new JFrame("ATM Interface");
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        loginPanel = new ATMLoginPanel(e -> authenticate());
        mainPanel.add(loginPanel, "Login");

        frame.add(mainPanel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        cardLayout.show(mainPanel, "Login");
    }

    private void authenticate() {
        String userId = loginPanel.getUserId();
        String pin = loginPanel.getPin();

        if (userId.equals(correctUserId) && pin.equals(correctPin)) {
            menuPanel = new ATMMenuPanel(frame, atm);
            mainPanel.add(menuPanel, "Menu");
            cardLayout.show(mainPanel, "Menu");
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid credentials!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ATMGUI::new);
    }
}
