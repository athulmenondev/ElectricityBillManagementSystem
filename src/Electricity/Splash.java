import Electricity.Login;

import javax.swing.*;
import java.awt.*;
import java.lang.*;
public class Splash extends JFrame implements Runnable{
    Splash() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(800,500,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        setSize(800, 500);
        setLocation(350, 100);
        setVisible(true);
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread t = new Thread(this);
        t.start();
    }
    public void run(){
        try {
            Thread.sleep(3000);
            setVisible(false);
            new Login();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Splash();
    }
}