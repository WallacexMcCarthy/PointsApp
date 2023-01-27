package views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage
{
    private final JFrame frame;
    private final JLabel userlLabel;
    private final JTextField userText;
    private final JPasswordField passwordText;
    private final JLabel passwordLabel;
    private final JButton button;
    private final JLabel imageLabel;
    ImageIcon loginBackground;
    public LoginPage()
    {
        frame = new JFrame();
        frame.setSize(455, 455);

        loginBackground = new ImageIcon("Images/LoginBackground.jpeg");
        imageLabel = new JLabel(loginBackground);
        frame.add(imageLabel);

        userlLabel = new JLabel("User");
        userlLabel.setBounds(10, 20, 80, 25);
        imageLabel.add(userlLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        imageLabel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        imageLabel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        imageLabel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(userText.getText());
                System.out.println(passwordText.getText());
                if(userText.getText().equals("t") && passwordText.getText().equals("t"))
                {
                    WelcomePage welcomePage = new WelcomePage();
                    frame.dispose();
                }
            }
        });
        imageLabel.add(button);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
