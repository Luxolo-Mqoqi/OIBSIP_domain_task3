import atmgui.ATM;
import javax.swing.*;
import java.awt.*;

public class ATMMenuPanel extends JPanel {
     public ATMMenuPanel(JFrame frame, ATM atm) {
        setLayout(new GridLayout(6, 1, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        JButton transactionButton = new JButton("Transaction History");
        JButton withdrawButton = new JButton("Withdraw");
        JButton depositButton = new JButton("Deposit");
        JButton transferButton = new JButton("Transfer");
        JButton quitButton = new JButton("Quit");

        add(new JLabel("Welcome to ATM Menu", SwingConstants.CENTER));
        add(transactionButton);
        add(withdrawButton);
        add(depositButton);
        add(transferButton);
        add(quitButton);

        transactionButton.addActionListener(e -> {
            double tx = atm.getPreviousTransaction();
            if (tx > 0)
                JOptionPane.showMessageDialog(frame, "Last Transaction: Deposited R" + tx);
            else if (tx < 0)
                JOptionPane.showMessageDialog(frame, "Last Transaction: Withdrew R" + Math.abs(tx));
            else
                JOptionPane.showMessageDialog(frame, "No transaction has occurred.");
        });

        withdrawButton.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(frame, "Enter amount to withdraw:");
            try {
                double amount = Double.parseDouble(input);
                if (atm.withdraw(amount))
                    JOptionPane.showMessageDialog(frame, "R" + amount + " withdrawn successfully.");
                else
                    JOptionPane.showMessageDialog(frame, "Invalid or insufficient balance.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
            }
        });

        depositButton.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(frame, "Enter amount to deposit:");
            try {
                double amount = Double.parseDouble(input);
                atm.deposit(amount);
                JOptionPane.showMessageDialog(frame, "R" + amount + " deposited successfully.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
            }
        });

        transferButton.addActionListener(e -> {
            String recipient = JOptionPane.showInputDialog(frame, "Enter recipient name:");
            String input = JOptionPane.showInputDialog(frame, "Enter amount to transfer:");
            try {
                double amount = Double.parseDouble(input);
                if (atm.transfer(amount))
                    JOptionPane.showMessageDialog(frame, "Transferred R" + amount + " to " + recipient);
                else
                    JOptionPane.showMessageDialog(frame, "Invalid or insufficient balance.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
            }
        });

        quitButton.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(frame, "Are you sure you want to quit?", "Exit", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
    }
}
