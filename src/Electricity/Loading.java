package Electricity;
import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame {
    private JProgressBar progressBar;

    public Loading() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(800,500,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        setTitle("Loading...");
        setSize(300, 100);
        setLocation(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        add(progressBar, BorderLayout.CENTER);

        setVisible(true);

        // Simulate loading process
        for (int i = 0; i <= 100; i++) {
            progressBar.setValue(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Once loading is complete, hide the loading screen and show the main screen
        dispose();
        // Replace this with your actual main screen code
       /* ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(800,500,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        setSize(800, 500);
        setLocation(350, 100);
        setVisible(false);
        */
        new Login();

    }

    public static void main(String[] args) {
        new Loading();
    }
}