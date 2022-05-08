package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Choose {

    @FXML
    private Button a1;

    @FXML
    private Button b1;

    @FXML
    private Button back;

    @FXML
    private Button c1;

    @FXML
    private Button d1;

    @FXML
    void event1(ActionEvent event) {
        Parent root = null;

        try {
            root = (Parent) FXMLLoader.load(this.getClass().getResource("choose1.fxml"));
        } catch (IOException var4) {
            var4.printStackTrace();
        }

        Stage registerStage = new Stage();
        registerStage.setScene(new Scene(root, 600.0D, 433.0D));
        registerStage.show();
    }

    @FXML
    void event13(ActionEvent event) {
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();
    }

    @FXML
    void event2(ActionEvent event) {
        Parent root = null;

        try {
            root = (Parent) FXMLLoader.load(this.getClass().getResource("choose2.fxml"));
        } catch (IOException var4) {
            var4.printStackTrace();
        }

        Stage registerStage = new Stage();
        registerStage.setScene(new Scene(root, 600.0D, 433.0D));
        registerStage.show();
    }

    @FXML
    void event3(ActionEvent event) {
        Parent root = null;

        try {
            root = (Parent) FXMLLoader.load(this.getClass().getResource("choose3.fxml"));
        } catch (IOException var4) {
            var4.printStackTrace();
        }

        Stage registerStage = new Stage();
        registerStage.setScene(new Scene(root, 600.0D, 433.0D));
        registerStage.show();
    }

    @FXML
    void event4(ActionEvent event) {
        Parent root = null;

        try {
            root = (Parent) FXMLLoader.load(this.getClass().getResource("choose4.fxml"));
        } catch (IOException var4) {
            var4.printStackTrace();
        }

        Stage registerStage = new Stage();
        registerStage.setScene(new Scene(root, 600.0D, 433.0D));
        registerStage.show();
    }

}