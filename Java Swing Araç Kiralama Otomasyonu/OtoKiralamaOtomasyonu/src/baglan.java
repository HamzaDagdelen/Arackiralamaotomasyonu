import java.sql.*;
import javax.swing.*;

public class baglan {
     
    Connection conn =null;
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
     static final String DB_URL = "jdbc:mysql://localhost:3306/otokiralama";
      static final String USER = "root";
          static final String PASS = "";
    public static Connection ConnecrDb(){
    
    try{
    Class.forName("com.mysql.jdbc.Connection");
  
    Connection conn=DriverManager.getConnection(DB_URL, USER, PASS);
   
    return conn;
    }catch(Exception e){
    
    JOptionPane.showMessageDialog(null,e);    
    return null;
    }
}
}
