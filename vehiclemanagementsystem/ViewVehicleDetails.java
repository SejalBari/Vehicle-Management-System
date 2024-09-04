package vehiclemanagementsystem;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;


public class ViewVehicleDetails extends JFrame implements ActionListener{
    JLabel lblmake, lblmodel, lblyear, lblregnumber,text,lblowner,labelowner,labelmake,labelmodel,labelyear,labelregnumber;
        JButton  back;
        String username;
            
        ViewVehicleDetails (String username){
        this.username=username;
        setBounds(450, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        text = new JLabel("VEHICLE DETAILS");
        text.setBounds(60,20,300,25);
        text.setFont(new Font("Times new roman",Font.BOLD,25));
        text.setForeground(new Color(100, 186, 188));
        add(text);
        
        lblowner = new JLabel("Owner");
        lblowner.setBounds(50, 90, 150, 25);
        lblowner.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblowner);

        labelowner = new JLabel();
        labelowner.setBounds(220, 90, 150, 25);
        labelowner.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelowner);
        

        lblmake = new JLabel("Make");
        lblmake.setBounds(50, 140, 150, 25);
        lblmake.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblmake);

        labelmake = new JLabel();
        labelmake.setBounds(220, 140, 150, 25);
        labelmake.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelmake);

        lblmodel = new JLabel("Model");
        lblmodel.setBounds(50, 190, 150, 25);
        lblmodel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblmodel);

        labelmodel = new JLabel();
        labelmodel.setBounds(220, 190, 150, 25);
        labelmodel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelmodel);

        lblyear = new JLabel("Year");
        lblyear.setBounds(50, 240, 150, 25);
        lblyear.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblyear);

        labelyear = new JLabel();
        labelyear.setBounds(220, 240, 150, 25);
        labelyear.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelyear);

        lblregnumber = new JLabel("Registration Number");
        lblregnumber.setBounds(50, 290, 150, 25);
        lblregnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblregnumber);

        labelregnumber = new JLabel();
        labelregnumber.setBounds(220, 290, 150, 25);
        labelregnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelregnumber);

       

        back = new JButton("Back");
        back.setForeground(Color.BLACK);
        back.setBackground(new Color(100, 186, 188));
        back.setBounds(220, 400, 100, 25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("vehiclemanagementsystem/image/carDetails1.png"));
        Image i2 = i1.getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(480,50,300,300);
        add(image);
        
        try{
            Conn conn = new Conn();
            String query ="select * from vehicleDetails where username='"+username+"'";
            ResultSet rs=conn.s.executeQuery(query);
            while (rs.next()){
                labelowner.setText(rs.getString("username"));
                labelmake.setText(rs.getString("make"));
                labelmodel.setText(rs.getString("model"));
                labelyear.setText(rs.getString("year"));
                labelregnumber.setText(rs.getString("registration_no"));
                
                
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
           new ViewVehicleDetails ("");
        }
}
