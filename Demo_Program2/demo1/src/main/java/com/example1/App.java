package com.example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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
    }
}
