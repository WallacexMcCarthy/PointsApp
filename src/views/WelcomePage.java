package views;

import Utilities.User;
import Utilities.Users;
import views.loginviews.LoginPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.temporal.JulianFields;

public class WelcomePage
{
    private int userIndex;
    private final LoginPage loginPage;
    private final Users users;
    private final JFrame frame;
    private final JPanel panel;
    private final JLabel welcomeUser;
    private final JButton addPointsButton;
    private final JButton userAccountButton;
    private final JButton leaderboardButton;
    private final JButton logoutButton;
    public WelcomePage(int userIndex)
    {
        this.userIndex = userIndex;
        loginPage = new LoginPage();
        users = new Users();
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(750, 750);
        frame.setTitle("Points");
        panel.setLayout(null);
        frame.add(panel);

        welcomeUser = new JLabel("Welcome " + users.getUsers(userIndex).getName());
        panel.add(welcomeUser);
        welcomeUser.setBounds(230, 40, 200, 25);

        addPointsButton = new JButton("Add Points");
        addPointsButton.setBounds(230, 70, 120, 25);
        addPointsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddPointsPage(userIndex);
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
        leaderboardButton = new JButton("Account");
        leaderboardButton.setBounds(230, 130, 120, 25);
        leaderboardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LeaderboardPage(userIndex);
                frame.dispose();
            }
        });
        panel.add(leaderboardButton);

        logoutButton = new JButton("Logout");
        logoutButton.setBounds(0, 0, 120, 25);
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginPage();
                frame.dispose();
            }
        });
        panel.add(logoutButton);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
