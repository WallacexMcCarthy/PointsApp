package views;

import views.loginviews.LoginPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPointsPage
{
    private int userIndex;
    private final JFrame frame;
    private final JPanel panel;
    private final String month = java.time.LocalDate.now().getMonth().toString();
    private final int day = java.time.LocalDate.now().getDayOfMonth();
    private final int year = java.time.LocalDate.now().getYear();
    private final JButton exitButton;
    private final JLabel userName;
    private final JCheckBox itemOne;
    private final JCheckBox itemTwo;
    private final JCheckBox itemThree;
    private final JCheckBox itemFour;
    private final JCheckBox itemFive;
    private final JCheckBox itemSix;
    private final JCheckBox itemSeven;
    private final JCheckBox itemEight;
    private final JCheckBox itemNine;
    private final JCheckBox itemTen;
    private final JCheckBox itemEleven;
    private final JCheckBox itemTweleve;
    private final JCheckBox itemThirteen;
    private final JCheckBox itemFourteen;
    private final JCheckBox itemFifteen;
    private final JLabel itemOneLabel;
    private final JLabel itemTwoLabel;
    private final JLabel itemThreeLabel;
    private final JLabel itemFourLabel;
    private final JLabel itemFiveLabel;
    private final JLabel itemSixLabel;
    private final JLabel itemSevenLabel;
    private final JLabel itemEightLabel;
    private final JLabel itemNineLabel;
    private final JLabel itemTenLabel;
    private final JLabel itemElevenLabel;
    private final JLabel itemTweleveLabel;
    private final JLabel itemThirteenLabel;
    private final JLabel itemFourteenLabel;
    private final JLabel itemFifteenLabel;
    private final JLabel placeholder;
    public AddPointsPage(int userIndex)
    {
        this.userIndex = userIndex;
        frame = new JFrame();
        frame.setSize(750, 750);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(750, 750);
        frame.add(panel);

        userName = new JLabel("User: ");
        userName.setBounds(10, 20, 80, 25);
        panel.add(userName);

        exitButton = new JButton("Back");
        exitButton.setBounds(0, 0, 80, 20);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WelcomePage welcomePage = new WelcomePage(userIndex);
            }
        });
        panel.add(exitButton);


        itemOne = new JCheckBox();
        itemOne.setBounds(350, 45, 80, 25);
        itemOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemOne);
        itemTwo = new JCheckBox();
        itemTwo.setBounds(350, 70, 80, 25);
        itemTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemTwo);
        itemThree = new JCheckBox();
        itemThree.setBounds(350, 95, 80, 25);
        itemThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemThree);
        itemFour = new JCheckBox();
        itemFour.setBounds(350, 120, 80, 25);
        itemFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemFour);
        itemFive = new JCheckBox();
        itemFive.setBounds(350, 145, 80, 25);
        itemFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemFive);
        itemSix = new JCheckBox();
        itemSix.setBounds(350, 170, 80, 25);
        itemSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemSix);
        itemSeven = new JCheckBox();
        itemSeven.setBounds(350, 195, 80, 25);
        itemSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemSeven);
        itemEight = new JCheckBox();
        itemEight.setBounds(350, 220, 80, 25);
        itemEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemEight);
        itemNine = new JCheckBox();
        itemNine.setBounds(350, 245, 80, 25);
        itemNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemNine);
        itemTen = new JCheckBox();
        itemTen.setBounds(350, 270, 80, 25);
        itemTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemTen);
        itemEleven = new JCheckBox();
        itemEleven.setBounds(350, 295, 80, 25);
        itemEleven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemEleven);
        itemTweleve = new JCheckBox();
        itemTweleve.setBounds(350, 320, 80, 25);
        itemTweleve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemTweleve);
        itemThirteen = new JCheckBox();
        itemThirteen.setBounds(350, 345, 80, 25);
        itemThirteen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemThirteen);
        itemFourteen = new JCheckBox();
        itemFourteen.setBounds(350, 370, 80, 25);
        itemFourteen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemFourteen);
        itemFifteen = new JCheckBox();
        itemFifteen.setBounds(350, 395, 80, 25);
        itemFifteen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemFifteen);

        itemOneLabel = new JLabel("Office Worker Person | 2 points: " + month + "/" + day + "/" + year);
        itemOneLabel.setBounds(10, 45, 330, 25);
        panel.add(itemOneLabel);
        itemTwoLabel = new JLabel("Two " + month + " " + day + ", " + year);
        itemTwoLabel.setBounds(10, 70, 330, 25);
        panel.add(itemTwoLabel);
        itemThreeLabel = new JLabel("three " + month + " " + day + ", " + year);
        itemThreeLabel.setBounds(10, 95, 330, 25);
        panel.add(itemThreeLabel);
        itemFourLabel = new JLabel("four " + month + " " + day + ", " + year);
        itemFourLabel.setBounds(10, 120, 330, 25);
        panel.add(itemFourLabel);
        itemFiveLabel = new JLabel("five " + month + " " + day + ", " + year);
        itemFiveLabel.setBounds(10, 145, 330, 25);
        panel.add(itemFiveLabel);
        itemSixLabel = new JLabel("six " + month + " " + day + ", " + year);
        itemSixLabel.setBounds(10, 170, 330, 25);
        panel.add(itemSixLabel);
        itemSevenLabel = new JLabel("sevem " + month + " " + day + ", " + year);
        itemSevenLabel.setBounds(10, 195, 330, 25);
        panel.add(itemSevenLabel);
        itemEightLabel = new JLabel("eight " + month + " " + day + ", " + year);
        itemEightLabel.setBounds(10, 220, 330, 25);
        panel.add(itemEightLabel);
        itemNineLabel = new JLabel("nine " + month + " " + day + ", " + year);
        itemNineLabel.setBounds(10, 245, 330, 25);
        panel.add(itemNineLabel);
        itemTenLabel = new JLabel("ten " + month + " " + day + ", " + year);
        itemTenLabel.setBounds(10, 270, 330, 25);
        panel.add(itemTenLabel);
        itemElevenLabel = new JLabel("eleven " + month + " " + day + ", " + year);
        itemElevenLabel.setBounds(10, 295, 330, 25);
        panel.add(itemElevenLabel);
        itemTweleveLabel = new JLabel("tweleve " + month + " " + day + ", " + year);
        itemTweleveLabel.setBounds(10, 320, 330, 25);
        panel.add(itemTweleveLabel);
        itemThirteenLabel = new JLabel("thirteen " + month + " " + day + ", " + year);
        itemThirteenLabel.setBounds(10, 345, 330, 25);
        panel.add(itemThirteenLabel);
        itemFourteenLabel = new JLabel("fourteen " + month + " " + day + ", " + year);
        itemFourteenLabel.setBounds(10, 370, 330, 25);
        panel.add(itemFourteenLabel);
        itemFifteenLabel = new JLabel("");
        itemFifteenLabel.setBounds(10, 500, 330, 25);
        panel.add(itemFifteenLabel);
        placeholder = new JLabel("");
        placeholder.setBounds(10, 500, 330, 25);
        panel.add(placeholder);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
