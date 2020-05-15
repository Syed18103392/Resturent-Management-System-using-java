/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bonna
 */
public class TableInput {
    static Connection connection() throws SQLException, ClassNotFoundException{
        //database connection
    String driver="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost/Bd_Kashundi";
    String username="root";
    String password="";
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
            return con; 
    }
}
