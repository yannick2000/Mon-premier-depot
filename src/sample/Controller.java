package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {

    @FXML
    private Label usernameTextLabel;

    public void connectionButton(ActionEvent event){
        DatabaseConnector connectNow = new DatabaseConnector();
        Connection connectDB = connectNow.getConnection();
        String connectQuery = "SELECT username FROM connexion";

        try{
            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(connectQuery);

            while (queryOutput.next()){
                usernameTextLabel.setText(queryOutput.getString("username"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
