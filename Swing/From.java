import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

class Sample {
    Sample() {
        JFrame myFrame = new JFrame("My Form");

        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        myFrame.setSize(400, 300);
        myFrame.setLayout(null);

        // Name
        JLabel L1 = new JLabel("Name: ", SwingConstants.RIGHT);
        myFrame.add(L1);
        L1.setBounds(50, 20, 80, 30);
        L1.setFont(new Font("Times New Roman", Font.BOLD, 14));

        JTextField T1 = new JTextField();
        myFrame.add(T1);
        T1.setBounds(150, 20, 180, 30);

        // Roll No
        JLabel L2 = new JLabel("Roll No.: ", SwingConstants.RIGHT);
        myFrame.add(L2);
        L2.setBounds(50, 60, 80, 30);
        L2.setFont(new Font("Times New Roman", Font.BOLD, 14));

        JTextField T2 = new JTextField();
        myFrame.add(T2);
        T2.setBounds(150, 60, 180, 30);

        // DOB
        JLabel L3 = new JLabel("DOB: ", SwingConstants.RIGHT);
        myFrame.add(L3);
        L3.setBounds(50, 100, 80, 30);
        L3.setFont(new Font("Times New Roman", Font.BOLD, 14));

        JTextField T3 = new JTextField();
        myFrame.add(T3);
        T3.setBounds(150, 100, 180, 30);

        // Gender
        JLabel L4 = new JLabel("Gender: ", SwingConstants.RIGHT);
        myFrame.add(L4);
        L4.setBounds(50, 140, 80, 30);
        L4.setFont(new Font("Times New Roman", Font.BOLD, 14));

        JRadioButton mRadio = new JRadioButton("Male");
        JRadioButton fRadio = new JRadioButton("Female");

        mRadio.setBounds(150, 140, 70, 30);
        fRadio.setBounds(230, 140, 80, 30);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(mRadio);
        buttonGroup.add(fRadio);

        myFrame.add(mRadio);
        myFrame.add(fRadio);

        // Submit
        JLabel L5 = new JLabel("SUBMIT", SwingConstants.CENTER);
        myFrame.add(L5);
        L5.setBounds(150, 200, 100, 30);
        L5.setBackground(Color.LIGHT_GRAY);
        L5.setOpaque(true);
        L5.setFont(new Font("Times New Roman", Font.BOLD, 18));

    }

}

class Form {
    public static void main(String args[]) {
        new Sample();
    }
}
