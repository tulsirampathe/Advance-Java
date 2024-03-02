import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.ScatteringByteChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

class page {
    /**
     * 
     */
    page() {
        JFrame myFrame = new JFrame();
        myFrame.setLayout(null);
        myFrame.setVisible(true);
        myFrame.setSize(328, 157);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel user = new JLabel("Username", SwingConstants.CENTER);
        myFrame.add(user);
        user.setBounds(50, 30, 64, 22);
        user.setBackground(new Color(161, 255,180));
        user.setOpaque(true);

        JTextField userT = new JTextField();
        myFrame.add(userT);
        userT.setHorizontalAlignment(SwingConstants.CENTER);
        userT.setBounds(120, 30, 145, 22);

        JLabel pass = new JLabel("Password", SwingConstants.CENTER);
        myFrame.add(pass);
        pass.setBounds(50, 60, 64, 22);
        pass.setBackground(new Color(161, 255,180));
        pass.setOpaque(true);

        JPasswordField P = new JPasswordField();
        myFrame.add(P);
        P.setHorizontalAlignment(SwingConstants.CENTER);
        P.setBounds(120, 60, 145, 22);

        JButton B = new JButton("Submit");
        myFrame.add(B);
        B.setBounds(120, 90, 145, 22);
        B.setBackground(Color.LIGHT_GRAY);
        B.setFont(new Font("Times New Roman", Font.BOLD, 15));

        // Second Frame
        JFrame myFrame1 = new JFrame();
        myFrame1.setLayout(null);
        myFrame1.setVisible(false);
        myFrame1.setSize(328, 400);
        myFrame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton home = new JButton("Home");
        myFrame1.add(home);
        home.setBounds(10, 10, 80, 20);
        home.setBackground(new Color(8, 124,124));
        home.setOpaque(true);

        JButton about = new JButton("About");
        myFrame1.add(about);
        about.setBounds(100, 10, 80, 20);
        about.setBackground(new Color(8, 124,124));
        about.setOpaque(true);

        JButton Contant = new JButton("Contant");
        myFrame1.add(Contant);
        Contant.setBounds(200, 10, 80, 20);
        Contant.setBackground(new Color(8, 124,124));
        Contant.setOpaque(true);

        JTextField welcome = new JTextField();
        myFrame1.add(welcome);
        welcome.setBounds(80, 70, 150, 22);
        welcome.setBackground(Color.LIGHT_GRAY);
        welcome.setHorizontalAlignment(SwingConstants.CENTER);
        welcome.setFont(new Font("Times New Roman", Font.BOLD, 15));

        B.addActionListener(new ActionListener() {

            int check = 1;

            @Override
            public void actionPerformed(ActionEvent e) {

                String usernameInput = userT.getText();
                char[] passwordInput = P.getPassword();
                String passwordString = new String(passwordInput);

                try {
                    // Register the Driver class
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    // Create Connection
                    String url = "jdbc:mysql://localhost:3306/userdata";
                    String username = "root";
                    String password = "root";

                    Connection con = DriverManager.getConnection(url, username, password);

                    System.out.println("Connection complete");

                    String query1 = "SELECT * FROM data WHERE username = ?";
                    try (PreparedStatement statement1 = con.prepareStatement(query1)) {
                        statement1.setString(1, usernameInput);

                        try (ResultSet resultSet1 = statement1.executeQuery()) {

                            if (!resultSet1.next()) {

                                check = 0;

                                // Display an alert popup
                                JOptionPane.showMessageDialog(myFrame, "Username Not Found!", "Alert",
                                        JOptionPane.WARNING_MESSAGE);
                            }

                        }

                    } catch (SQLException b) {
                        // TODO: handle exception
                        b.printStackTrace();
                    }

                    String query2 = "SELECT * FROM data WHERE username = ?";
                    try (PreparedStatement statement2 = con.prepareStatement(query2)) {
                        statement2.setString(1, usernameInput);

                        try (ResultSet resultSet2 = statement2.executeQuery()) {
                            if (resultSet2.next()) { // Check if the result set has any rows
                                String getPass = resultSet2.getString("password"); // Retrieve the password from the

                                // result set
                                if (!passwordString.equals(getPass)) {
                                    // Display an alert popup
                                    JOptionPane.showMessageDialog(myFrame, "Wrong Password!", "Alert",
                                            JOptionPane.WARNING_MESSAGE);
                                    check = 0;
                                }
                            } 
                        }

                    } catch (SQLException b) {
                        // TODO: handle exception
                        b.printStackTrace();
                    }

                    // close the connection
                    con.close();

                } catch (SQLException a) {
                    // Handle SQL Exception
                    a.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    // Handle ClassNotFoundException
                    e1.printStackTrace();
                }

                // Add Second Frame
                if (check == 1) {
                    myFrame.setVisible(false);
                    myFrame1.setVisible(true);

                    welcome.setText("Welcome " + usernameInput);
                }
            }

        });

    }
}

public class LoginPage {

    public static void main(String[] args) {
        new page();
    }
}