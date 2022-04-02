package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private Button loginButton;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterPasswordField;
    @FXML
    private Button registerButton;


    @FXML
    public void CancelButtonOnAction(ActionEvent event){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    public void loginButtonOnAction(ActionEvent event){
        if (usernameTextField.getText().isBlank() == false && enterPasswordField.getText().isBlank()==false){
            validateLogin();

        }else {
            loginMessageLabel.setText("Please enter username and password");

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void validateLogin(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();
        String verifyLogin = "SELECT COUNT(1) FROM user_account WHERE username = '" +usernameTextField.getText() +"'AND password = '"
                +enterPasswordField.getText() + "'";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()){
                if (queryResult.getInt(1)==1){
                    //loginMessageLabel.setText("Congratulations!");
                    flightPage();
                }else {
                    loginMessageLabel.setText("Invalid login,Please tyr again!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void registerButtonOnAction(ActionEvent event){
        createAccountForm();
    }

    public void createAccountForm(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
            Stage registerStage = new Stage();
            registerStage.initStyle(StageStyle.UNDECORATED);
            registerStage.initModality(Modality.APPLICATION_MODAL);
            registerStage.setScene(new Scene(root,600,433));
            registerStage.show();

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void flightPage(){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("flight.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage registerStage = new Stage();
        registerStage.setScene(new Scene(root,600,433));
        registerStage.show();

    }

}