
package vehiclemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class AddOwnerDetails extends JFrame implements ActionListener {
    
    JLabel lblusername,lblnumber,labelname;
    JComboBox comboid;
    JTextField tfnumber,tfstate,tfaddress,tfphone,tfemail;
    JRadioButton rmale, rfemale;
    JButton add,back;
    String username;
    AddOwnerDetails(String username){
        this.username=username;
        setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblusername);
        
        lblusername = new JLabel();
        lblusername.setBounds(220,50,150,25);
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblusername);
        
        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30,90,150,25);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblid);
        
        comboid = new JComboBox(new String[] {"Adhar Card","Licence"});
        comboid.setBounds(220,90,150,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
        lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,130,150,25);
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblnumber);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(220,130,150,25);
        tfnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfnumber);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,170,150,25);
        lblname.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblname);
        
        labelname = new JLabel();
        labelname.setBounds(220,170,150,25);
        labelname.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelname);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,210,150,25);
        lblgender.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblgender);
        
        
        rmale = new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.WHITE);
        rmale.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(rmale);
        
        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300,210,100,25);
        rfemale.setBackground(Color.WHITE);
        rfemale.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(rfemale);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        
        JLabel lblstate = new JLabel("State");
        lblstate.setBounds(30,250,150,25);
        lblstate.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblstate);
        
        tfstate = new JTextField();
        tfstate.setBounds(220,250,150,25);
        tfstate.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfstate);
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30,290,150,25);
        lbladdress.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lbladdress);
        
        tfaddress =new JTextField();
        tfaddress.setBounds(220,290,150,25);
        tfaddress.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfaddress);
        
        JLabel lblphone = new JLabel("Phone No.");
        lblphone.setBounds(30,330,150,25);
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblphone);
        
        tfphone =new JTextField();
        tfphone.setBounds(220,330,150,25);
        tfphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfphone);
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(30,370,150,25);
        lblemail.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblemail);
        
        tfemail =new JTextField();
        tfemail.setBounds(220,370,150,25);
        tfemail.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfemail);
        
        add= new JButton("Add");
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
        
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("vehiclemanagementsystem/image/manCar.gif"));
        Image i2 = i1.getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(470,100,300,300);
        add(image);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username ='"+username+"'");
            while(rs.next()){
                lblusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
               
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
            String username =lblusername.getText();
            String id =(String) comboid.getSelectedItem();
            String number=tfnumber.getText();
            String name = labelname.getText();
            String gender =null;
           
            if(rmale.isSelected()){
                gender="Male";
            }
            else{
                gender="Female";
            }
            String state =tfstate.getText();
            String address =tfaddress.getText();
            String phone = tfphone.getText();
            String email=tfemail.getText();
            
            try{
                Conn c=new Conn();
                String query="insert into ownerDetails values('"+username+"','"+id+"','"+number+"','"+name+"', '"+gender+"','"+state+"','"+address+"','"+phone+"','"+email+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Owner Details Added Successfully");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else
        {
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new AddOwnerDetails("");
    }
        
        
}
