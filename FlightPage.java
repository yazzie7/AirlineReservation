package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FlightPage implements Initializable {

    @FXML
    private Button Find;

    @FXML
    private Button contacter;

    @FXML
    private Button tickets;

    @FXML
    void push1(ActionEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("ChooseFlight.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage registerStage = new Stage();
        registerStage.setScene(new Scene(root,600,433));
        registerStage.show();
    }

    @FXML
    void push2(ActionEvent event) {

    }

    @FXML
    void push3(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }
}
