import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class firstMySQl {

    public static void main(String[] args) {
        
        try {

            // Register the Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            String url = "jdbc:mysql://localhost:3306/college";
            String username = "root";
            String pass = "root";

           Connection con = DriverManager.getConnection(url, username, pass);

           // Create statement
           String q = "create table Student(id int, name varchar(20))";
           Statement stmt = con.createStatement();

            // Execute query
            stmt.executeUpdate(q);

           // Create statement
           String p = "insert into student values (1, 'Tulisram'), (2, 'Prince')";
           Statement stmt1 = con.createStatement();

            // Execute query
            stmt1.executeUpdate(p);

            // close the connection
            con.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}