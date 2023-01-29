package views;

import Utilities.Users;

import javax.swing.*;

public class AccountPage
{
    private final JFrame frame;
    private Users users;
    private final JPanel panel;
    public AccountPage()
    {
        frame = new JFrame();
        panel = new JPanel();
        users = new Users();
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
