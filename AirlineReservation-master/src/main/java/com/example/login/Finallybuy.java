package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Finallybuy {

    @FXML
    private Button back;

    @FXML
    private Button next;

    @FXML
    void event11(ActionEvent event) {
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();

    }

    @FXML
    void event22(ActionEvent event) {
        Parent root = null;

        try {
            root = (Parent) FXMLLoader.load(this.getClass().getResource("choose.fxml"));
        } catch (IOException var4) {
            var4.printStackTrace();
        }

        Stage registerStage = new Stage();
        registerStage.setScene(new Scene(root, 600.0D, 433.0D));
        registerStage.show();

    }

}