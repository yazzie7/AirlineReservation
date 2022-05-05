package com.example.login;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class FlightPage {

    @FXML
    private Button back;

    @FXML
    private Button findfight;

    @FXML
    void event1(ActionEvent event) {     //event1 is come back to the login page
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();
    }

    @FXML
    void event2(ActionEvent event) {     //event2 is come to the next page
        Parent root = null;

        try {
            root = (Parent) FXMLLoader.load(this.getClass().getResource("Findfight.fxml"));
        } catch (IOException var4) {
            var4.printStackTrace();
        }

        Stage registerStage = new Stage();
        registerStage.setScene(new Scene(root, 600.0D, 433.0D));
        registerStage.show();

    }

}
