
package vehiclemanagementsystem;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            c=DriverManager.getConnection("jdbc:mysql:///vehiclemanagementsystem","root","Milkyway@9");
            s =c.createStatement(); 
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
