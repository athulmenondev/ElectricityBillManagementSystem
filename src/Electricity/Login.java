package Electricity;
import javax.swing.*;
import java.lang.*;
import java.awt.*;

public class Login extends JFrame {
    public Login(){
        super("Login page");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lusername = new JLabel("Username: ");
        add(lusername);
        lusername.setBounds(100,20,100,20);

        JTextField ltusername= new JTextField();
        ltusername.setBounds(200,20,100,20);
        add(ltusername);

        JLabel lpassword = new JLabel("Password: ");
        add(lpassword);
        lpassword.setBounds(100,60,100,20);

        JTextField ltpassword = new JTextField();
        ltpassword.setBounds(200,60,100,20);
        add(ltpassword);

        JLabel logininas =new JLabel("login in as");
        logininas.setBounds(100,90,100,20);
        add(logininas);

        Choice loginin = new Choice();
        loginin.add("Admin");
        loginin.add("Customer");
        loginin.setBounds(200,90,100,20);
        add(loginin);

        JButton login= new JButton("Login");
        login.setBounds(120,140,80,20);
        add(login);

        JButton cancel= new JButton("Cancel");
        cancel.setBounds(220,140,80,20);
        add(cancel);

        JButton signup = new JButton("Sign Up");
        signup.setBounds(150,170,100,20);
        add(signup);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/userlogin.jpg"));
        Image i2=i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(400,0,250,250);
        add(image);

        setSize(640,300);
        setLocation(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new Login();
    }
}
