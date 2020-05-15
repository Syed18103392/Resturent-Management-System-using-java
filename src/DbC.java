
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author sajib
 */
public class DbC {

    String[] name = new String[10];
    String[] password = new String[10];
    int i = 0;

    //connect database
    void getData(String tb_login) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");

//here db_mess is the database name, root is the username and "" is the password
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bd_Kashundi", "root", "")) {

                Statement stmt = con.createStatement();
                //retraive data from database Login_info table

                ResultSet rs = stmt.executeQuery("select * from "+tb_login);

                while (rs.next()) {

                    name[i] = rs.getString("username");
                    password[i] = rs.getString("password");
                    i++;
                }

            }

        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    String getname() {
        return name[0];
    }

    String getpass() {
        return password[0];
    }
}
