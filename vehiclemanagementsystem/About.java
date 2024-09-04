
package vehiclemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class About extends JFrame implements ActionListener {
    
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        
        JLabel l1 = new JLabel("About");
        l1.setBounds(200,10,100,40);
        l1.setForeground(new Color(100,186,188));
        l1.setFont(new Font("Tahoma",Font.BOLD,28));
        add(l1);
        
        String s="About Project:\n"+
                "\n"+
                "The Vehicle Management System project facilitates efficient tracking of vehicles and owners. It includes features to add and update owner and vehicle details, ensuring accurate and current information. Users can also view detailed information about owners and vehicles and delete outdated records as needed. This system aims to streamline the management of vehicle-related data for optimal organization and accessibility. ";
        
        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        JButton back= new JButton("Back");
        back.setBounds(200,420,100,25);
        back.setForeground(Color.BLACK);
        back.setBackground(new Color(100,186,188) );
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
        
    }
    
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String[] args){
        new About();
    }
}
