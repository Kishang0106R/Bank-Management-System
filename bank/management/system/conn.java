package bank.management.system;
import java.sql.*;

public class conn {
    Statement s;
    Connection c;
    public conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "for project", "kishansingh337502");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
