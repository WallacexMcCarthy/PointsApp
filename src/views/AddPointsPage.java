package views;

import views.loginviews.LoginPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPointsPage
{
    private int userIndex;
    private final String onePoint;
    private final String twoPoints;
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
    public AddPointsPage(int userIndex)
    {
        onePoint = "1 point | ";
        twoPoints = "2 points | ";
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
        itemOne.setBounds(10, 45, 80, 25);
        itemOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemOne);
        itemTwo = new JCheckBox();
        itemTwo.setBounds(10, 70, 80, 25);
        itemTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemTwo);
        itemThree = new JCheckBox();
        itemThree.setBounds(10, 95, 80, 25);
        itemThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemThree);
        itemFour = new JCheckBox();
        itemFour.setBounds(10, 120, 80, 25);
        itemFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemFour);
        itemFive = new JCheckBox();
        itemFive.setBounds(10, 145, 80, 25);
        itemFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemFive);
        itemSix = new JCheckBox();
        itemSix.setBounds(10, 170, 80, 25);
        itemSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemSix);
        itemSeven = new JCheckBox();
        itemSeven.setBounds(10, 195, 80, 25);
        itemSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemSeven);
        itemEight = new JCheckBox();
        itemEight.setBounds(10, 220, 80, 25);
        itemEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemEight);
        itemNine = new JCheckBox();
        itemNine.setBounds(10, 245, 80, 25);
        itemNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemNine);
        itemTen = new JCheckBox();
        itemTen.setBounds(10, 270, 80, 25);
        itemTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemTen);
        itemEleven = new JCheckBox();
        itemEleven.setBounds(10, 295, 80, 25);
        itemEleven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemEleven);
        itemTweleve = new JCheckBox();
        itemTweleve.setBounds(10, 320, 80, 25);
        itemTweleve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemTweleve);
        itemThirteen = new JCheckBox();
        itemThirteen.setBounds(10, 345, 80, 25);
        itemThirteen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(itemThirteen);

        itemOneLabel = new JLabel("Vigorous Cardio Vascular Workout | " + twoPoints + month + "/" + day + "/" + year);
        itemOneLabel.setBounds(40, 45, 700, 25);
        panel.add(itemOneLabel);
        itemTwoLabel = new JLabel("Mental or Physical Strength Training | " + onePoint + twoPoints  + month + " " + day + ", " + year);
        itemTwoLabel.setBounds(40, 70, 700, 25);
        panel.add(itemTwoLabel);
        itemThreeLabel = new JLabel("Drink  64 oz of Water | " + onePoint + month + " " + day + ", " + year);
        itemThreeLabel.setBounds(40, 95, 700, 25);
        panel.add(itemThreeLabel);
        itemFourLabel = new JLabel("Eat 2 4 Ounce Servings of Fresh Fruit or Vegetables | " + onePoint + month + " " + day + ", " + year);
        itemFourLabel.setBounds(40, 120, 700, 25);
        panel.add(itemFourLabel);
        itemFiveLabel = new JLabel("Replace a Meal With a Salad | " + onePoint + month + " " + day + ", " + year);
        itemFiveLabel.setBounds(40, 145, 700, 25);
        panel.add(itemFiveLabel);
        itemSixLabel = new JLabel("No Soda | " + onePoint + month + " " + day + ", " + year);
        itemSixLabel.setBounds(40, 170, 700, 25);
        panel.add(itemSixLabel);
        itemSevenLabel = new JLabel("No Breaded or Deep Fried Foods | " + onePoint + month + " " + day + ", " + year);
        itemSevenLabel.setBounds(40, 195, 700, 25);
        panel.add(itemSevenLabel);
        itemEightLabel = new JLabel("Climb 300 Stairs | " + onePoint + month + " " + day + ", " + year);
        itemEightLabel.setBounds(40, 220, 700, 25);
        panel.add(itemEightLabel);
        itemNineLabel = new JLabel("Wall Sits or Planks | " + onePoint + month + " " + day + ", " + year);
        itemNineLabel.setBounds(40, 245, 700, 25);
        panel.add(itemNineLabel);
        itemTenLabel = new JLabel("200 Rope Jumps | " + twoPoints  + month + " " + day + ", " + year);
        itemTenLabel.setBounds(40, 270, 700, 25);
        panel.add(itemTenLabel);
        itemElevenLabel = new JLabel("Sit ups or Push ups | " + onePoint + month + " " + day + ", " + year);
        itemElevenLabel.setBounds(40, 295, 700, 25);
        panel.add(itemElevenLabel);
        itemTweleveLabel = new JLabel("Walk continuously for 30 minutes or 10,000 steps | " + twoPoints  + month + " " + day + ", " + year);
        itemTweleveLabel.setBounds(40, 320, 700, 25);
        panel.add(itemTweleveLabel);
        itemThirteenLabel = new JLabel("75 Squats and or Lunges | " + onePoint + month + " " + day + ", " + year);
        itemThirteenLabel.setBounds(40, 345, 700, 25);
        panel.add(itemThirteenLabel);


        /*
        not normal ones:
        office sponsored wellness related trainings
        participate in fitnesschallenge or race/
        participate in cpr trainign or blood drive
        organize or conduct fitness thing with 4+ coworkers.
        reduce body mass
        no smoking / vaping 120 days.
        anual physical exam by doctor
         */

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
