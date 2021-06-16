package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {

    public Connection databaseLink;

    public Connection getConnection(){
        String databaseName = "bibliotheque";
        String databaseUser = "root";
        String databasePassword = "";
        String url = "jdbc:mysql://localhost:3308/" + databaseName;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return databaseLink;
    }

}
