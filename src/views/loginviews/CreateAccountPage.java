package views.loginviews;

import Utilities.Users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccountPage
{
    private Users users;
    private final JFrame frame;
    private final JLabel imageLabel;
    private final ImageIcon background;
    private final JTextField name;
    private final JTextField email;
    private final JPasswordField password;
    private final JPasswordField confirmPassword;
    private final JButton enterButton;
    private final JLabel nameLabel;
    private final JLabel emailLabel;
    private final JLabel passwordLabel;
    private final JLabel confirmPasswordLabel;


    public CreateAccountPage()
    {
        users = new Users();
        frame = new JFrame();
        frame.setSize(455, 455);

        background = new ImageIcon("Images/LoginBackground.jpeg");
        imageLabel = new JLabel(background);

        nameLabel = new JLabel("Name");
        nameLabel.setBounds(10, 20, 110, 25);
        imageLabel.add(nameLabel);

        name = new JTextField(20);
        name.setBounds(130, 20, 165, 25);
        imageLabel.add(name);

        emailLabel = new JLabel("Email");
        emailLabel.setBounds(10, 50, 110, 25);
        imageLabel.add(emailLabel);

        email = new JTextField();
        email.setBounds(130, 50, 165, 25);
        imageLabel.add(email);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 80, 110, 25);
        imageLabel.add(passwordLabel);

        password = new JPasswordField();
        password.setBounds(130, 80, 165, 25);
        imageLabel.add(password);

        confirmPasswordLabel = new JLabel("Confirm Password");
        confirmPasswordLabel.setBounds(10, 110, 130, 25);
        imageLabel.add(confirmPasswordLabel);

        confirmPassword = new JPasswordField();
        confirmPassword.setBounds(130, 110, 165, 25);
        imageLabel.add(confirmPassword);

        enterButton = new JButton("Create Account");
        enterButton.setBounds(140, 140, 155, 25);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(password.getText().equals(confirmPassword.getText()))
                {
                    users.addUser(name.getText(), email.getText(), password.getText(), 0);
                    new LoginPage();
                    frame.dispose();
                }

            }
        });
        imageLabel.add(enterButton);

        frame.add(imageLabel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
