package vehiclemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class AddVehicleDetails extends JFrame implements ActionListener {

    JLabel lblmake, lblmodel, lblyear, lblregnumber,text,lblowner,labelowner ;
    JTextField tfmake, tfmodel, tfyear, tfregnumber,tfowner;

    JButton add, back;
    String username;
    AddVehicleDetails(String username) {
        this.username=username;
        
        setBounds(450, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        text = new JLabel("ADD VEHICLE DETAILS");
        text.setBounds(60,20,300,25);
        text.setFont(new Font("Times new roman",Font.BOLD,25));
        text.setForeground(new Color(100, 186, 188));
        add(text);
        
        lblowner = new JLabel("Owner");
        lblowner.setBounds(30, 90, 150, 25);
        lblowner.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblowner);

        labelowner = new JLabel();
        labelowner.setBounds(220, 90, 150, 25);
        labelowner.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelowner);
        

        lblmake = new JLabel("Make");
        lblmake.setBounds(30, 140, 150, 25);
        lblmake.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblmake);

        tfmake = new JTextField();
        tfmake.setBounds(220, 140, 150, 25);
        tfmake.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(tfmake);

        lblmodel = new JLabel("Model");
        lblmodel.setBounds(30, 190, 150, 25);
        lblmodel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblmodel);

        tfmodel = new JTextField();
        tfmodel.setBounds(220, 190, 150, 25);
        tfmodel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(tfmodel);

        lblyear = new JLabel("Year");
        lblyear.setBounds(30, 240, 150, 25);
        lblyear.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblyear);

        tfyear = new JTextField();
        tfyear.setBounds(220, 240, 150, 25);
        tfyear.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(tfyear);

        lblregnumber = new JLabel("Registration Number");
        lblregnumber.setBounds(30, 290, 150, 25);
        lblregnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblregnumber);

        tfregnumber = new JTextField();
        tfregnumber.setBounds(220, 290, 150, 25);
        tfregnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(tfregnumber);

        add = new JButton("Add");
        add.setForeground(Color.BLACK);
        add.setBackground(new Color(100, 186, 188));
        add.setBounds(70, 400, 100, 25);
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");
        back.setForeground(Color.BLACK);
        back.setBackground(new Color(100, 186, 188));
        back.setBounds(220, 400, 100, 25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("vehiclemanagementsystem/image/carDetails2.png"));
        Image i2 = i1.getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450,80,300,300);
        add(image);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username ='"+username+"'");
            while(rs.next()){
                labelowner.setText(rs.getString("username"));
                
               
            }
                
                
        }catch(Exception e)
        {
            
            e.printStackTrace();
            
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String make = tfmake.getText();
            String model = tfmodel.getText();
            String year = tfyear.getText();
            String registration_no  = tfregnumber.getText();
            String owner = labelowner.getText();
            

            try {
                Conn c = new Conn();
                
                String query = "INSERT INTO vehicleDetails (username,make, model, year, registration_no) VALUES ('" + owner + "','" + make + "','" + model + "','" + year + "','" + registration_no  + "')";
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Vehicle Details Added Successfully");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddVehicleDetails("");
    }
}
