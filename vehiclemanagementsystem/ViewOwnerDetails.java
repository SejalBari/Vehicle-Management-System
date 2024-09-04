
package vehiclemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ViewOwnerDetails extends JFrame implements ActionListener{
    
    JButton back;
    String username;
    ViewOwnerDetails(String username){
        this.username=username;
        setBounds(450,180,870,625);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        lblusername.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        labelusername.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(labelusername);
        
        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30,110,150,25);
        lblid.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(lblid);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(220,110,150,25);
        labelid.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,170,150,25);
        lblnumber.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(lblnumber);
        
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220,170,150,25);
        labelnumber.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(labelnumber);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,230,150,25);
        lblname.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(lblname);
        
        JLabel labelname = new JLabel();
        labelname.setBounds(220,230,150,25);
        labelname.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(labelname);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,290,150,25);
        lblgender.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(lblgender);
        
        JLabel labelgender = new JLabel();
        labelgender.setBounds(220,290,150,25);
        labelgender.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(labelgender);
        
        JLabel lblstate = new JLabel("State");
        lblstate.setBounds(500,50,150,25);
        lblstate.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(lblstate);
        
        JLabel labelstate = new JLabel();
        labelstate.setBounds(690,50,150,25);
        labelstate.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(labelstate);
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(500,110,150,25);
        lbladdress.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(lbladdress);
        
        JLabel labeladdress = new JLabel();
        labeladdress.setBounds(690,110,150,25);
        labeladdress.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(labeladdress);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(500,170,150,25);
        lblphone.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(690,170,150,25);
        labelphone.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(labelphone);
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(500,230,150,25);
        lblemail.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(lblemail);
        
        JLabel labelemail = new JLabel();
        labelemail.setBounds(690,230,150,25);
        labelemail.setFont(new Font("Tamhoma",Font.PLAIN,20));
        add(labelemail);
        
        back = new JButton("Back");
        back.setBackground(new Color(100,186,188) );
        back.setForeground(Color.BLACK );
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(350,350,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("vehiclemanagementsystem/image/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,400,600,200);
        add(image);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("vehiclemanagementsystem/image/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(600,400,600,200);
        add(image2);
        
        
        try{
            Conn conn = new Conn();
            String query ="select * from ownerDetails where username='"+username+"'";
            ResultSet rs=conn.s.executeQuery(query);
            while (rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelname.setText(rs.getString("name"));
                labelgender.setText(rs.getString("gender"));
                labelstate.setText(rs.getString("state"));
                labeladdress.setText(rs.getString("address"));
                labelphone.setText(rs.getString("phone"));
                labelemail.setText(rs.getString("email"));
                
            }
        }catch(Exception e)
                {
                    
                }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String[] args){
     new ViewOwnerDetails("");   
    }
}
