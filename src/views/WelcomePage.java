package views;

import javax.swing.*;

public class WelcomePage
{
    public WelcomePage()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(750, 750);
        frame.setTitle("Welcome");
        frame.add(panel);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
