
package mp1_2cse_alvear_naniong_sison;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MP1_2CSE_ALVEAR_NANIONG_SISON 
{
private JFrame f;
    private JPanel p1,p2,p3;
    private JLabel l1,l2;
    private JTextField tf1,tf2;
    private JButton ln;
    
    public LoginScreen()
    {
     //frame
     f = new JFrame("Login Screen");
     //panel
     p1 = new JPanel();
     p2 = new JPanel();
     p3 = new JPanel();
     //label
     l1 = new JLabel("Username: ");
     l2 = new JLabel("Password: ");
     //text fields
     tf1= new JTextField(20);
     tf2= new JTextField(20);
     //buttons
     ln = new JButton("Log in");
    }
    
    public void startApp()
    {
     p1.add(l1);
     p1.add(tf1);
      
     p2.add(l2);
     p2.add(tf2);
     
     p3.add(ln);
     
     f.setLayout(new GridLayout(3,1));
     
     f.add(p1);
     f.add(p2);
     f.add(p3);
     
     f.pack();
     f.setVisible(true);
    }
   
    private class MyCloseButtonHandler extends WindowAdapter
    {
      @Override
      public void windowClosing(WindowEvent w)
      {
       System.exit(0);
      }
    }
    public static void main(String[] args) 
    {
      LoginScreen ls = new  LoginScreen();
      ls.startApp();  
    }
    
}
