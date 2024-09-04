
package vehiclemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    JButton addOwnerDetails,viewOwnerDetails,updateOwnerDetails,addVehicleDetails,updateVehicleDetails,viewVehicleDetails,about,deleteOwnerDetails,deleteVehicleDetails,retriveOwnerInfo,retriveVehicleInfo,button;
    String username,owner;
    Dashboard(String username){
        this.username=username; 
    setBounds(0,0,1600,1000); 
    setLayout(null);
    
    JPanel p1 = new JPanel();
    p1.setLayout(null);
    p1.setBackground(new Color(54,69,79));
    p1.setBounds(0,0,1600,45);
    add(p1);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("vehiclemanagementsystem/image/earth2.gif"));
    Image i2 = i1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel icon = new JLabel(i3);
    icon.setBounds(5,3,50,50);
    p1.add(icon);
    
    
    JLabel heading = new JLabel("Dashboard");
    heading.setBounds(60,10,300,30);
    heading.setForeground(Color.WHITE);
    heading.setFont(new Font("Times New Roman",Font.BOLD,30));
    p1.add(heading);
    
    JPanel p2 = new JPanel();
    p2.setLayout(null);
    p2.setBackground(new Color(54,69,79));
    p2.setBounds(0,45,300,900);
    add(p2);
    
    addOwnerDetails = new JButton("Add Owner Details");
    addOwnerDetails.setBounds(0,0,300,60);
    addOwnerDetails.setBackground(new Color(100,186,188));
    addOwnerDetails.setForeground(new Color(54,69,79));
    addOwnerDetails.setFont(new Font("Times New Roman",Font.BOLD,20));
    addOwnerDetails.setMargin(new Insets(0,0,0,60));
    addOwnerDetails.addActionListener(this);
    p2.add(addOwnerDetails);
    
    updateOwnerDetails = new JButton("Update Owner Details");
    updateOwnerDetails.setBounds(0,60,300,60);
    updateOwnerDetails.setBackground(new Color(100,186,188));
    updateOwnerDetails.setForeground(new Color(54,69,79));
    updateOwnerDetails.setFont(new Font("Times New Roman",Font.BOLD,20));
    updateOwnerDetails.setMargin(new Insets(0,0,0,30));
    updateOwnerDetails.addActionListener(this);
    p2.add(updateOwnerDetails);
    
    viewOwnerDetails = new JButton("View Owner Details");
    viewOwnerDetails.setBounds(0,120,300,60);
    viewOwnerDetails.setBackground(new Color(100,186,188));
    viewOwnerDetails.setForeground(new Color(54,69,79));
    viewOwnerDetails.setFont(new Font("Times New Roman",Font.BOLD,20));
    viewOwnerDetails.setMargin(new Insets(0,0,0,50));
    viewOwnerDetails.addActionListener(this);
    p2.add(viewOwnerDetails);
    
    
    deleteOwnerDetails = new JButton("Delete Owner Details");
    deleteOwnerDetails.setBounds(0,180,300,60);
    deleteOwnerDetails.setBackground(new Color(100,186,188));
    deleteOwnerDetails.setForeground(new Color(54,69,79));
    deleteOwnerDetails.setFont(new Font("Times New Roman",Font.BOLD,20));
    deleteOwnerDetails.setMargin(new Insets(0,0,0,35));
    deleteOwnerDetails.addActionListener(this);
    p2.add(deleteOwnerDetails);
    
    addVehicleDetails = new JButton("Add Vehicle Details");
    addVehicleDetails.setBounds(0,240,300,60);
    addVehicleDetails.setBackground(new Color(100,186,188));
    addVehicleDetails.setForeground(new Color(54,69,79));
    addVehicleDetails.setFont(new Font("Times New Roman",Font.BOLD,20));
    addVehicleDetails.setMargin(new Insets(0,0,0,50));
    addVehicleDetails.addActionListener(this);
    p2.add(addVehicleDetails);
    
    updateVehicleDetails = new JButton("Upadate Vehicle Details");
    updateVehicleDetails.setBounds(0,300,300,60);
    updateVehicleDetails.setBackground(new Color(100,186,188));
    updateVehicleDetails.setForeground(new Color(54,69,79));
    updateVehicleDetails.setFont(new Font("Times New Roman",Font.BOLD,20));
    updateVehicleDetails.setMargin(new Insets(0,0,0,20));
    updateVehicleDetails.addActionListener(this);
    p2.add(updateVehicleDetails);
    
    viewVehicleDetails = new JButton("View Vehicle Details");
    viewVehicleDetails.setBounds(0,360,300,60);
    viewVehicleDetails.setBackground(new Color(100,186,188));
    viewVehicleDetails.setForeground(new Color(54,69,79));
    viewVehicleDetails.setFont(new Font("Times New Roman",Font.BOLD,20));
    viewVehicleDetails.setMargin(new Insets(0,0,0,50));
    viewVehicleDetails.addActionListener(this);
    p2.add(viewVehicleDetails);
    
    deleteVehicleDetails = new JButton("Delete Vehicle Details");
    deleteVehicleDetails.setBounds(0,420,300,60);
    deleteVehicleDetails.setBackground(new Color(100,186,188));
    deleteVehicleDetails.setForeground(new Color(54,69,79));
    deleteVehicleDetails.setFont(new Font("Times New Roman",Font.BOLD,20));
    deleteVehicleDetails.setMargin(new Insets(0,0,0,40));
    deleteVehicleDetails.addActionListener(this);
    p2.add(deleteVehicleDetails);
    
    retriveOwnerInfo = new JButton("Retrieve Owner Info");
    retriveOwnerInfo.setBounds(0,480,300,60);
    retriveOwnerInfo.setBackground(new Color(100,186,188));
    retriveOwnerInfo.setForeground(new Color(54,69,79));
    retriveOwnerInfo.setFont(new Font("Times New Roman",Font.BOLD,20));
    retriveOwnerInfo.setMargin(new Insets(0,0,0,60));
    retriveOwnerInfo.addActionListener(this);
    p2.add(retriveOwnerInfo);
    
    retriveVehicleInfo = new JButton("Retrieve Vehicle Info");
    retriveVehicleInfo.setBounds(0,540,300,60);
    retriveVehicleInfo.setBackground(new Color(100,186,188));
    retriveVehicleInfo.setForeground(new Color(54,69,79));
    retriveVehicleInfo.setFont(new Font("Times New Roman",Font.BOLD,20));
    retriveVehicleInfo.setMargin(new Insets(0,0,0,50));
    retriveVehicleInfo.addActionListener(this);
    p2.add(retriveVehicleInfo);
    
   
    
    about = new JButton("About");
    about.setBounds(0,660,300,60);
    about.setBackground(new Color(100,186,188));
    about.setForeground(new Color(54,69,79));
    about.setFont(new Font("Times New Roman",Font.BOLD,20));
    about.setMargin(new Insets(0,0,0,170));
    about.addActionListener(this);
    p2.add(about);
    
    button = new JButton("Delete Account");
    button.setBounds(0,600,300,60);
    button.setBackground(new Color(100,186,188));
    button.setForeground(new Color(54,69,79));
    button.setFont(new Font("Times New Roman",Font.BOLD,20));
    button.setMargin(new Insets(0,0,0,90));
    button.addActionListener(this);
    p2.add(button);
    
    ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("vehiclemanagementsystem/image/car8.jpg"));
    Image i5 = i4.getImage().getScaledInstance(1300, 750, Image.SCALE_DEFAULT);
    ImageIcon i6 = new ImageIcon(i5);
    JLabel image = new JLabel(i6);
    image.setBounds(250,45,1300, 750);
    add(image);
    
    JLabel text = new JLabel("Vehicle Management System");
    text.setBounds(320,70,1000,70);
    text.setForeground(Color.   WHITE);
    text.setFont(new Font("Times New Roman",Font.BOLD,55));
    image.add(text);
    
    
    
    setVisible(true);
}
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addOwnerDetails){
            new AddOwnerDetails(username);
        }
        else if(ae.getSource()==viewOwnerDetails){
            new ViewOwnerDetails(username);
        }
        else if(ae.getSource()==updateOwnerDetails){
            new UpdateOwnerDetails(username);
        }
        else if(ae.getSource()==addVehicleDetails){
            new AddVehicleDetails(username);
        }
        else if(ae.getSource()==updateVehicleDetails){
            new UpdateVehicleDetails(username);
        }
        else if(ae.getSource()==viewVehicleDetails){
            new ViewVehicleDetails(username);
        }
        else if(ae.getSource()==about){
            new About();
        }
        else if(ae.getSource()==deleteOwnerDetails){
            new DeleteOwnerDetails(username);
        }
        else if(ae.getSource()==deleteVehicleDetails){
            new DeleteVehicleDetails(username);
        }
        else if(ae.getSource()==retriveOwnerInfo){
            new RetrieveOwnerInfo();
        }
        else if(ae.getSource()==retriveVehicleInfo){
            new RetrieveVehicleInfo();
        }
        else if(ae.getSource()==button){
            new DeleteAccount(username);
        }
    }
    
    public static void main(String[] args)
    {
        new Dashboard("");
    }
}
