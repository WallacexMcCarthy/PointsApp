package views.loginviews;

import Utilities.User;
import views.WelcomePage;
import Utilities.Users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginPage
{
    private final Users users;
    public int userIndex;
    private final JFrame frame;
    private final JLabel userLabel;
    private final JTextField userText;
    private final JPasswordField passwordText;
    private final JLabel passwordLabel;
    private final JButton loginButton;
    private final JButton createAccountButton;
    private final JButton resetPasswordbutton;
    private final JLabel imageLabel;
    private final ImageIcon loginBackground;
    public LoginPage()
    {
        userIndex = 0;
        users = new Users();
        frame = new JFrame();
        frame.setSize(455, 455);
        frame.setTitle("Points");

        loginBackground = new ImageIcon("Images/LoginBackground.jpeg");
        imageLabel = new JLabel(loginBackground);
        frame.add(imageLabel);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        imageLabel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        imageLabel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        imageLabel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        imageLabel.add(passwordText);

        resetPasswordbutton = new JButton("Reset Password");
        resetPasswordbutton.setBounds(275, 50, 140, 25);
        resetPasswordbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ResetPasswordPage();
                frame.dispose();
            }
        });
        imageLabel.add(resetPasswordbutton);

        createAccountButton = new JButton("Create Account");
        createAccountButton.setBounds(10, 80, 140, 25);
        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CreateAccountPage();
                frame.dispose();
            }
        });
        imageLabel.add(createAccountButton);

        loginButton = new JButton("Login");
        loginButton.setBounds(185, 80, 80, 25);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int index = 0; index < users.getUsers().size(); index++)
                {
                    if(userText.getText().equals(users.getUsers(index).getName()) &&
                            passwordText.getText().equals(users.getUsers(index).getPassword()))
                    {
                        userIndex = index;
                        new WelcomePage(userIndex);
                        frame.dispose();
                    }
                }
            }
        });
        imageLabel.add(loginButton);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
