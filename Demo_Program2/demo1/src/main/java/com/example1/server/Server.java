import java.sql.Connection;
import java.sql.DriverManager;

public class Server {
    public String connection = "Mysql";
    public Connection getconnection() {
        try {

            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/appdb", "root", "examly");

            if(conn!=null)
            {
                System.out.println("Connected Successfully");
            }
            else
            {
                System.out.println("Failed to connect");
            }
        } catch(Exception e) {

        }
            return conn;

    }
}
