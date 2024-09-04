

package vehiclemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class RetrieveVehicleInfo extends JFrame implements ActionListener{
    
    JLabel lbl,lblusername,lblmake,labelmake,lblmodel,labelmodel,lblyear,labelyear,lblregNo,labelregNo;
    JTextField tfusername;
    JButton retrive,back;
    
    RetrieveVehicleInfo(){
        
        setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        lbl=new JLabel("Retrive Vehicle Details");
        lbl.setBounds(100,20,400,25);
        lbl.setFont(new Font("Times new roman",Font.BOLD,24));
        lbl.setForeground(new Color(100,186,188));
        add(lbl);
        
        lblusername= new JLabel("Enter Owner Name");
        lblusername.setBounds(50,80,200,25);
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(250,80,200,25);
        tfusername.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(tfusername);
        
        retrive = new JButton("Retrieve");
        retrive.setBounds(500,80,100,25);
        retrive.setForeground(Color.BLACK);
        retrive.setBackground(new Color(100,186,188) );
        retrive.setFont(new Font("Tahoma",Font.PLAIN,18));
        retrive.addActionListener(this);
        add(retrive);
        
        
        lblmake =new JLabel("Make :");
        lblmake.setBounds(50,160,300,25);
        lblmake.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblmake);
        
        labelmake =new JLabel();
        labelmake.setBounds(250,160,300,25);
        labelmake.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelmake);
        
        lblmodel =new JLabel("Model :");
        lblmodel.setBounds(50,210,300,25);
        lblmodel.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblmodel);
        
        labelmodel =new JLabel();
        labelmodel.setBounds(250,210,300,25);
        labelmodel.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelmodel);
        
        lblyear =new JLabel("Year :");
        lblyear.setBounds(50,270,300,25);
        lblyear.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblyear);
        
        labelyear =new JLabel();
        labelyear.setBounds(250,270,300,25);
        labelyear.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelyear);
        
        lblregNo =new JLabel("Registration No :");
        lblregNo.setBounds(50,330,300,25);
        lblregNo.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblregNo);
        
        labelregNo =new JLabel();
        labelregNo.setBounds(250,330,300,25);
        labelregNo.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelregNo);
       
        back=new JButton("Back");
        back.setBounds(350,400,100,25);
        back.setForeground(Color.BLACK);
        back.setBackground(new Color(100,186,188) );
        back.setFont(new Font("Tahoma",Font.PLAIN,18));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("vehiclemanagementsystem/image/retriveVehicleInfo1.png"));
        Image i2 = i1.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30,10,50,50);
        add(image);
        
        
        
        setVisible(true);
        
    }
    
     public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==retrive) {
            retrieveOwnerInfo();
        }
        
        else if(ae.getSource()==back){
            setVisible(false);
        }
    }
    
    private void retrieveOwnerInfo() {
    String username = tfusername.getText().trim();

    try {
        Conn conn= new Conn();

        
        String query = "select * from vehicleDetails where username='"+username+"'";
        ResultSet rs=conn.s.executeQuery(query);
        
       

     
        if (rs.next()) {
            
            labelmake.setText(rs.getString("make"));
            labelmodel.setText(rs.getString("model"));
            labelyear.setText(rs.getString("year"));
            labelregNo.setText(rs.getString("registration_no"));
            
        } else {
            JOptionPane.showMessageDialog(this, "Vehicle not found for Username : " + username, "Error", JOptionPane.ERROR_MESSAGE);
        }

        conn.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

        
    
    public static void main(String[] args){
        new RetrieveVehicleInfo();
    }
    
}