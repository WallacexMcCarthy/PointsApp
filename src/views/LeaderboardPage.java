package views;


import Utilities.User;
import Utilities.Users;

import javax.swing.*;
import java.util.ArrayList;

public class LeaderboardPage
{
    private final JFrame frame;
    private JPanel panel;
    private JLabel usersLabel;
    private JLabel leaderbaordLabel;
    private final Users users = new Users();
    private User[] allUsers;
    private ArrayList<User> usersArray;
    private int userIndex = 0;
    public LeaderboardPage(final int userIndex)
    {
        this.userIndex = userIndex;
        usersArray = users.getUsers();
        allUsers = new User[usersArray.size()];
        for(int i = 0; i < usersArray.size(); i++)
        {
            allUsers[i] = usersArray.get(i);
        }
        selectionSort(allUsers);
        for(int i = 0; i < allUsers.length; i++)
        {

            System.out.print(allUsers[i].getTotalPoints());
            System.out.println(allUsers[i].getName());
        }


        frame = new JFrame();
        panel = new JPanel();
        panel.setSize(750,750);
        panel.setLayout(null);
        frame.setSize(750,750);

        leaderbaordLabel = new JLabel();
        leaderbaordLabel.setText("Leaderboard");
        leaderbaordLabel.setBounds(10, 10, 500, 25);
        panel.add(leaderbaordLabel);

        int x = 40;

        for(int i = 0; i < allUsers.length; i++)
        {
            usersLabel = new JLabel();
            usersLabel.setText(i + 1 + ". " + allUsers[i].getName() + " " + allUsers[i].getEmail()
                    + " " + allUsers[i].getTotalPoints());
            usersLabel.setBounds(10, x+= 30, 500, 25);
            panel.add(usersLabel);
        }

        usersLabel = new JLabel();
        usersLabel.setText(allUsers[userIndex] + ". " + allUsers[userIndex].getName() + " " + allUsers[userIndex].getEmail()
                + " " + allUsers[userIndex].getTotalPoints());
        usersLabel.setBounds(10, x += 30, 500, 25);
        panel.add(usersLabel);

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LeaderboardPage(0);
    }

    private static void selectionSort(User[] users)
    {
        for(int i = 0; i < users.length - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < users.length; j++)
            {
                if(users[min].getTotalPoints() < users[j].getTotalPoints())
                {
                    min = j;
                }
            }

            User temp = users[i];
            users[i] = users[min];
            users[min] = temp;
        }
    }

}
