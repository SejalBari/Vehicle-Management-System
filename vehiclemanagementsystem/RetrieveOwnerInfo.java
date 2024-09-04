
package vehiclemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class RetrieveOwnerInfo extends JFrame implements ActionListener{
    
    JLabel lbl,lblregNo,lblusername,labelusername,lblid,labelid,lblnumber,labelnumber,lblgender,labelgender,lblname,labelname,lblphone,labelphone,lblstate,labelstate,lbladdress,labeladdress,lblemail,labelemail;
    JTextField tfregNo;
    JButton retrive,back;
    
    RetrieveOwnerInfo(){
        
       setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        lbl=new JLabel("Retrieve Owner Details");
        lbl.setBounds(100,20,400,25);
        lbl.setFont(new Font("Times new roman",Font.BOLD,24));
        lbl.setForeground(new Color(100,186,188));
        add(lbl);
        
        lblregNo= new JLabel("Enter Registration No.");
        lblregNo.setBounds(50,80,200,25);
        lblregNo.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblregNo);
        
        tfregNo = new JTextField();
        tfregNo.setBounds(250,80,200,25);
        tfregNo.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(tfregNo);
        
        retrive = new JButton("Retrieve");
        retrive.setBounds(500,80,100,25);
        retrive.setForeground(Color.BLACK);
        retrive.setBackground(new Color(100,186,188) );
        retrive.setFont(new Font("Tahoma",Font.PLAIN,18));
        retrive.addActionListener(this);
        add(retrive);
        
        
        lblusername =new JLabel("Owner Name");
        lblusername.setBounds(50,160,300,25);
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblusername);
        
        labelusername =new JLabel();
        labelusername.setBounds(250,160,300,25);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelusername);
        
        lblid =new JLabel("Id");
        lblid.setBounds(50,210,300,25);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblid);
        
        labelid =new JLabel();
        labelid.setBounds(250,210,300,25);
        labelid.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelid);
        
        lblnumber =new JLabel("Number");
        lblnumber.setBounds(50,270,300,25);
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblnumber);
        
        labelnumber =new JLabel();
        labelnumber.setBounds(250,270,300,25);
        labelnumber.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelnumber);
        
        lblname =new JLabel("Name");
        lblname.setBounds(50,330,300,25);
        lblname.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblname);
        
        labelname =new JLabel();
        labelname.setBounds(250,330,300,25);
        labelname.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelname);
        
        
        lblgender =new JLabel("Gender");
        lblgender.setBounds(50,390,300,25);
        lblgender.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblgender);
        
        labelgender =new JLabel();
        labelgender.setBounds(250,390,300,25);
        labelgender.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelgender);
        
        
        lblstate =new JLabel("State");
        lblstate.setBounds(450,160,300,25);
        lblstate.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblstate);
        
        labelstate =new JLabel();
        labelstate.setBounds(650,160,300,25);
        labelstate.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelstate);
        
        
        lbladdress =new JLabel("Address");
        lbladdress.setBounds(450,210,300,25);
        lbladdress.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lbladdress);
        
        labeladdress =new JLabel();
        labeladdress.setBounds(650,210,300,25);
        labeladdress.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labeladdress);
        
        lblphone =new JLabel("Phone");
        lblphone.setBounds(450,270,300,25);
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblphone);
        
        labelphone =new JLabel();
        labelphone.setBounds(650,270,300,25);
        labelphone.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelphone);
        
        
        lblemail =new JLabel("Email");
        lblemail.setBounds(450,330,300,25);
        lblemail.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblemail);
        
        labelemail =new JLabel();
        labelemail.setBounds(650,330,300,25);
        labelemail.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelemail);
        
        
        back=new JButton("Back");
        back.setBounds(350,460,100,25);
        back.setForeground(Color.BLACK);
        back.setBackground(new Color(100,186,188) );
        back.setFont(new Font("Tahoma",Font.PLAIN,18));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("vehiclemanagementsystem/image/retriveOwnerInfo.png"));
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
    String registration_no = tfregNo.getText().trim();

    try {
        Conn conn= new Conn();

        
        String query = "SELECT ownerDetails.*, vehicleDetails.registration_no FROM ownerDetails " +
                       "JOIN vehicleDetails ON ownerDetails.username = vehicleDetails.username " +
                       "WHERE vehicleDetails.registration_no='"+registration_no+"'";
        ResultSet rs=conn.s.executeQuery(query);
        
       

     
        if (rs.next()) {
            
            labelusername.setText(rs.getString("username"));
            labelid.setText(rs.getString("id"));
            labelnumber.setText(rs.getString("number"));
            labelname.setText(rs.getString("name"));
            labelgender.setText(rs.getString("gender"));
            labelstate.setText(rs.getString("state"));
            labeladdress.setText(rs.getString("address"));
            labelphone.setText(rs.getString("phone"));
            labelemail.setText(rs.getString("email"));
        } else {
            JOptionPane.showMessageDialog(this, "Owner not found for Registration No: " + registration_no, "Error", JOptionPane.ERROR_MESSAGE);
        }

        conn.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

        
    
    public static void main(String[] args){
        new RetrieveOwnerInfo();
    }
    
}
