
/**
 * Question 2. The following code is meant to create a GUI (JFrame) with one
 * menu called “Exam 2” which has two menu items, “Pass” and “Fail”. Write the
 * proper code for each of the missing pieces in the box to the right. Assume
 * there is a class called Exam2Listener which implements ActionListener which
 * can handle the menu items.
 */

import java.awt.*;
import javax.swing.*;

import javafx.scene.control.Menu;

// Class
public class MainWindow extends JFrame {
    private JFrame mainWindow;
    private JMenuBar mainMenuBar;
    private Menu exam2;
    private JMenuItem mPass, mFail, mQuit;
    private Exam2Listener exam2ML;

    public static void main(String args[]) {
        MainWindow m = new MainWindow("Exam 2");
    }

    // Constructor
    public MainWindow(String title) {
        mainWindow = new JFrame(title);
        mPass = new JMenuItem("Pass");
        mFail = new JMenuItem("Fail");
        mQuit = new JMenuItem("Quit");
        exam2 = new Menu("Exam 2", /* tearoff = */ false);
        exam2.add(mPass);
        exam2.add(mFail);
        exam2.addSeparator();
        exam2.add(mQuit);
        mainMenuBar = new MenuBar();
        mainMenuBar.add(exam2);
        mainWindow.setMenuBar(mainMenuBar);
        exam2ML = new Exam2Listener(this);
        mPass.addActionListener(exam2ML);
        mFail.addActionListener(exam2ML);
        mQuit.addActionListener(exam2ML);

        mainWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainWindow.setSize(400, 400);
        mainWindow.setLocation(100, 100);
        mainWindow.setVisible(true);
    }
}