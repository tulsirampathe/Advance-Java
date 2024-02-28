import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

class Note {
    Note() {
        JFrame myFrame = new JFrame("Notepad");
        myFrame.setLayout(null);
        myFrame.setVisible(true);
        myFrame.setSize(10000, 10000);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // File
        JMenuBar menuBar = new JMenuBar();
        myFrame.setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        JMenuItem newTabMenuItem = new JMenuItem("New Tab");
        JMenuItem newWinMenuItem = new JMenuItem("New Window");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem saveAsMenuItem = new JMenuItem("Save as");

        fileMenu.add(newTabMenuItem);
        fileMenu.add(newWinMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(saveAsMenuItem);

        menuBar.add(fileMenu);
        myFrame.setJMenuBar(menuBar);

        // Edit
        JMenu editMenu = new JMenu("Edit");

        JMenuItem undo = new JMenuItem("Undo");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem delete = new JMenuItem("Delete");
        JMenuItem find = new JMenuItem("Find");

        // Add menu items to the edit menu
        editMenu.add(undo);
        editMenu.add(cut);
        editMenu.add(paste);
        editMenu.add(delete);
        editMenu.add(find);

        menuBar.add(editMenu); // Add the edit menu to the menu bar

        // View
        JMenu viewMenu = new JMenu("View");

        JMenuItem zoom = new JMenuItem("Zoom");
        JMenuItem status = new JMenuItem("Status bar");
        JMenuItem word = new JMenuItem("Word wrap");

        // Add menu items to the View menu
        viewMenu.add(zoom);
        viewMenu.add(status);
        viewMenu.add(word);

        menuBar.add(viewMenu); // Add the View menu to the menu bar

        JTextArea area = new JTextArea();
        area.setBounds(0, 0, 10000, 10000);
        area.setBackground(Color.BLACK);
        area.setForeground(Color.WHITE);
        area.setOpaque(true);
        area.setFont(new Font("Times New Roman", Font.BOLD, 20));
        myFrame.add(area);

    }
}

public class notepade {
    public static void main(String[] args) {
        new Note();
    }
}
