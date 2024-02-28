import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

class Sample {
    Sample() {
        // Creating the main frame
        JFrame myFrame = new JFrame("My Form");

        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setSize(1000, 1000);
        myFrame.setLayout(null);

        JLabel lab = new JLabel();
        lab.setBounds(450, 300, 400, 300);
        lab.setBackground(new Color(173, 216, 230));
        lab.setOpaque(true);
        myFrame.add(lab);

        // Name
        JLabel L1 = new JLabel("Num1: ", SwingConstants.RIGHT);
        lab.add(L1);
        L1.setBounds(50, 20, 80, 30);
        L1.setFont(new Font("Times New Roman", Font.BOLD, 20));

        JTextField T1 = new JTextField();
        lab.add(T1);
        T1.setBounds(150, 20, 180, 30);
        T1.setFont(new Font("Times New Roman", Font.BOLD, 20));

        // Roll No
        JLabel L2 = new JLabel("Num2: ", SwingConstants.RIGHT);
        lab.add(L2);
        L2.setBounds(50, 60, 80, 30);
        L2.setFont(new Font("Times New Roman", Font.BOLD, 20));

        JTextField T2 = new JTextField();
        lab.add(T2);
        T2.setBounds(150, 60, 180, 30);
        T2.setFont(new Font("Times New Roman", Font.BOLD, 20));

        // Submit
        JButton S = new JButton("SUBMIT");
        lab.add(S);
        S.setBounds(150, 100, 150, 30);
        S.setBackground(Color.LIGHT_GRAY);
        S.setOpaque(true);
        S.setFont(new Font("Times New Roman", Font.BOLD, 20));

        // Creating the second frame
        JFrame myFrame2 = new JFrame("Second Frame");
        myFrame2.setVisible(false);
        myFrame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame2.setSize(800, 800);
        myFrame2.setLayout(null);

        JTextField F = new JTextField();
        myFrame2.add(F);
        F.setBounds(150, 100, 200, 80);
        F.setBackground(Color.lightGray);
        F.setFont(new Font("Times New Roman", Font.BOLD, 20));

        JButton B = new JButton("Return Frame 1");
        myFrame2.add(B);
        B.setBounds(150, 200, 300, 30);
        B.setBackground(Color.LIGHT_GRAY);
        B.setOpaque(true);
        B.setFont(new Font("Times New Roman", Font.BOLD, 20));

        JButton C = new JButton("Close");
        myFrame2.add(C);
        C.setBounds(500, 200, 300, 30);
        C.setBackground(Color.LIGHT_GRAY);
        C.setOpaque(true);
        C.setFont(new Font("Times New Roman", Font.BOLD, 20));

        // Action listener for the Submit button
        S.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame.setVisible(false);
                myFrame2.setVisible(true);
                int n1 = Integer.parseInt(T1.getText());
                int n2 = Integer.parseInt(T2.getText());
                int sum = n1 + n2;
                String temp = Integer.toString(sum);
                F.setText(temp);
            }
        });

        // Action listener for the "Return Frame 1" button
        B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame.setVisible(true);
                myFrame2.setVisible(false);
            }
        });

        // Action listener for the "Close" button
        C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame2.dispose(); // Close the second frame
            }
        });
    }
}

public class TwoFrame {
    public static void main(String args[]) {
        new Sample();
    }
}
