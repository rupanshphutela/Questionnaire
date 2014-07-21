/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
/**
 *
 * @author Rupansh Phutela
 */
public class Splashscr extends JWindow {
    public static void main(String Args[])
    {
        Splashscr ob=new Splashscr();
    }
    Splashscr()
    { 
        JPanel P=(JPanel) getContentPane();
        P.setBackground(Color.red);
        JLabel L=new JLabel(new ImageIcon("C:\\Users\\Rupansh Phutela\\Documents\\NetBeansProjects\\NetBeansProjects\\JavaApplication1\\quiz first page texture.jpg"));
        P.setBorder(BorderFactory.createLineBorder(Color.yellow, 15));
        setBounds(600,180,707,708);
        P.add(L);
        show();
        setVisible(true);
    
    try
    {
    Thread.sleep(10000);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    setVisible(false);
    QuizLogin f=new QuizLogin();
    f.setVisible(true);
    }
    
}

