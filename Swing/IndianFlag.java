import java.awt.Color;
import java.awt.FlowLayout;

import javax.sound.sampled.FloatControl;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

class Flag {
    Flag() {
        JFrame myFrame = new JFrame("India Flag");

        myFrame.setVisible(true);
        // myFrame.setResizable(false);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setSize(600, 600);
        myFrame.setLayout(null);

        JLabel O = new JLabel();
        myFrame.add(O);
        // O.setBounds(250, 250, 130, 30);
        // O.setBackground(Color.orange);
        // O.setOpaque(true);

        // ImageIcon icon = new ImageIcon("Ashoka.png");

        JLabel W = new JLabel();
        myFrame.add(W);
        // W.setBounds(250, 280, 130, 30);
        // W.setBackground(Color.white);
        // W.setOpaque(true);
        // W.setIcon(icon);

        JLabel G = new JLabel();
        myFrame.add(G);
        // G.setBounds(250, 310, 130, 30);
        // G.setBackground(Color.green);
        // G.setOpaque(true);

        JLabel B = new JLabel();
        myFrame.add(B);
        // B.setBounds(250, 340, 10, 80);
        // B.setBackground(Color.black);
        // B.setOpaque(true);


        JPanel P1 = new JPanel();
        P1.setBounds(250, 250, 130, 30);
        P1.setBackground(Color.ORANGE);
        myFrame.add(P1);
        P1.setLayout(null);
        P1.add(O);
        myFrame.add(P1);

        JPanel P2 = new JPanel();
        P2.setBounds(250, 280, 130, 30);
        P2.setBackground(Color.WHITE);
        myFrame.add(P2);
        P2.setLayout(null);
        P2.add(W);
        myFrame.add(P2);

        JPanel P3 = new JPanel();
        P3.setBounds(250, 310, 130, 30);
        P3.setBackground(Color.GREEN);
        myFrame.add(P3);
        P3.setLayout(null);
        P3.add(G);
        myFrame.add(P3);

        JPanel P4 = new JPanel();
        P4.setBounds(250, 340, 10, 80);
        P4.setBackground(Color.BLACK);
        myFrame.add(P4);
        P4.setLayout(null);
        P4.add(G);
        myFrame.add(P4);
    }
}

public class IndianFlag {
    public static void main(String args[]) {
        new Flag();
    }
}
