package views.loginviews;

import Utilities.Users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetPasswordPage
{
    private static Users users;
    private final JFrame frame;
    private final ImageIcon loginBackground;
    private final JLabel imageLabel;
    private final JTextField name;
    private final JTextField email;
    private final JLabel nameLabel;
    private final JLabel emailLabel;
    private final JPasswordField password;
    private final JLabel passwordLabel;
    private final JPasswordField resetPassword;
    private final JLabel resetPasswordLabel;
    private final JButton enterButton;
    private static boolean isValid;

    public ResetPasswordPage()
    {
        isValid = false;
        frame = new JFrame();
        frame.setSize(455, 455);
        loginBackground = new ImageIcon("Images/LoginBackground.jpeg");
        imageLabel = new JLabel(loginBackground);

        nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(10, 40, 150, 25);
        imageLabel.add(nameLabel);

        name = new JTextField();
        name.setBounds(170, 40, 100, 25);
        imageLabel.add(name);

        emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(10, 70, 150, 25);
        imageLabel.add(emailLabel);

        email = new JTextField();
        email.setBounds(170, 70, 100, 25);
        imageLabel.add(email);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10, 100, 150, 25);
        imageLabel.add(passwordLabel);

        password = new JPasswordField();
        password.setBounds(170, 100, 100, 25);
        imageLabel.add(password);

        resetPasswordLabel = new JLabel("Confirm Password: ");
        resetPasswordLabel.setBounds(10, 130, 150, 25);
        imageLabel.add(resetPasswordLabel);

        resetPassword = new JPasswordField();
        resetPassword.setBounds(170, 130, 100, 25);
        imageLabel.add(resetPassword);

        enterButton = new JButton("Reset Password");
        enterButton.setBounds(220, 160, 80, 25);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCredentials(name.getText(), email.getText());
                if(isValid)
                {
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
    private static void checkCredentials(String name, String email)
    {
        users = new Users();
        for(int i = 0; i < users.getUsers().size(); i++)
        {
            if(users.getUsers(i).getName().equals(name) && users.getUsers(i).getEmail().equals(email))
            {
                isValid = true;
            }
        }

    }


}
