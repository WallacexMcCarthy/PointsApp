package views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.temporal.JulianFields;

public class WelcomePage
{
    private final JFrame frame;
    private final JPanel panel;
    private final JLabel welcomeUser;
    private final JButton addPointsButton;
    private final JButton userAccountButton;
    public WelcomePage()
    {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(750, 750);
        frame.setTitle("Points");
        panel.setLayout(null);
        frame.add(panel);

        welcomeUser = new JLabel("Welcome");
        panel.add(welcomeUser);
        welcomeUser.setBounds(230, 40, 80, 25);

        addPointsButton = new JButton("Add Points");
        addPointsButton.setBounds(230, 70, 120, 25);
        addPointsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddPointsPage();
                frame.dispose();
            }
        });
        panel.add(addPointsButton);

        userAccountButton = new JButton("Account");
        userAccountButton.setBounds(230, 100, 120, 25);
        userAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AccountPage();
                frame.dispose();
            }
        });
        panel.add(userAccountButton);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
