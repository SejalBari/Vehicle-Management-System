
package vehiclemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class UpdateVehicleDetails extends JFrame implements ActionListener {
    
    JLabel lblowner,lblmodel,lblmake,lblyear,lblregNumber,labelowner;
    
    JTextField tfmake,tfmodel,tfyear,tfregNumber;
    
    JButton add,back;
    String username;
    
    UpdateVehicleDetails(String username){
        this.username=username;
        setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("UPDATE VEHICLE DETAILS");
        text.setBounds(50,10,500,25);
        text.setFont(new Font("Times new roman",Font.BOLD,20));
        text.setForeground(new Color(100,186,188));
        add(text);
        
        lblowner = new JLabel("Owner Name");
        lblowner.setBounds(40,70,150,25);
        lblowner.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblowner);
        
        labelowner = new JLabel();
        labelowner.setBounds(230,70,150,25);
        labelowner.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelowner);
        
        lblmake = new JLabel("Make");
        lblmake.setBounds(40,140,150,25);
        lblmake.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblmake);
        
        tfmake= new JTextField();
        tfmake.setBounds(230,140,150,25);
        tfmake.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(tfmake);
        
        lblmodel = new JLabel("Model");
        lblmodel.setBounds(40,210,150,25);
        lblmodel.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblmodel);
        
        tfmodel = new JTextField();
        tfmodel.setBounds(230,210,150,25);
        tfmodel.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(tfmodel);
        
        lblyear = new JLabel("Year");
        lblyear.setBounds(40,280,150,25);
        lblyear.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblyear);
      
        tfyear = new JTextField();
        tfyear.setBounds(230,280,150,25);
        tfyear.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(tfyear);
        
       
        
        lblregNumber = new JLabel("Registration Number");
        lblregNumber.setBounds(40,350,200,25);
        lblregNumber.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblregNumber);
        
        tfregNumber = new JTextField();
        tfregNumber.setBounds(230,350,150,25);
        tfregNumber.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(tfregNumber);
        
        
        
        add= new JButton("Update");
        add.setForeground(Color.BLACK);
        add.setBackground(new Color(100,186,188) );
        add.setBounds(70,430,100,25);
        add.addActionListener(this);
        add(add);
        
        back= new JButton("Back");
        back.setForeground(Color.BLACK);
        back.setBackground(new Color(100,186,188) );
        back.setBounds(220,430,100,25);
        back.addActionListener(this);
        add(back);
        
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("vehiclemanagementsystem/image/carDetails1.png"));
        Image i2 = i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(470,90,300,300);
        add(image);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from vehicleDetails where username ='"+username+"'");
            while(rs.next()){
                labelowner.setText(rs.getString("username"));
                tfmake.setText(rs.getString("make"));
                tfmodel.setText(rs.getString ("model"));
                tfyear.setText(rs.getString ("year"));
                tfregNumber.setText(rs.getString ("registration_no"));
                
                
               
            }
                
                
        }catch(Exception e)
        {
            
            e.printStackTrace();
            
        }
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==add){
            username =labelowner.getText();
            String make =tfmake.getText();
            String year=tfyear.getText();
            String model = tfmodel.getText();
            String registration_no =tfregNumber.getText();
            
            
            try{
                Conn c=new Conn();
                String query="update vehicleDetails set username='"+username+"',make='"+make+"',model='"+model+"',year='"+year+"',registration_no= '"+registration_no+"'";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Vehicle Details Updated Successfully");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else
        {
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new UpdateVehicleDetails("");
    }
        
        
}
 