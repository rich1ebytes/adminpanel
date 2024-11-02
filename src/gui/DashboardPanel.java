package gui;

import javax.swing.*;
import java.awt.*;

public class DashboardPanel extends JFrame {
    public DashboardPanel() {
        setTitle("Admin Dashboard");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        // Add placeholder buttons for admin actions
        JButton viewUsersButton = new JButton("View Users");
        JButton manageUsersButton = new JButton("Manage Users");
        JButton settingsButton = new JButton("Settings");

        add(viewUsersButton);
        add(manageUsersButton);
        add(settingsButton);

        setVisible(true);
    }
}
