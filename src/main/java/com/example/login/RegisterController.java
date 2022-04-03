package com.example.login;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {

    @FXML
    private Button closeButton;
    @FXML
    private Label registrationMessageLabel;
    @FXML
    private PasswordField setPasswordField;
    @FXML
    private PasswordField confirmPasswordField;
    @FXML
    private Label confirmPasswordLabel;


    @FXML
    private TextField nameTextFiled;
    @FXML
    private TextField passportTextFiled;
    @FXML
    private TextField usernameTextFiled;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }


    @FXML
    public void registerButtonOnAction(ActionEvent event){
        //registrationMessageLabel.setText("User has been registered successfully!!");
        if (nameTextFiled.getText().isEmpty() || passportTextFiled.getText().isEmpty()|| usernameTextFiled.getText().isEmpty()
        ||setPasswordField.getText().isEmpty() || confirmPasswordField.getText().isEmpty()
        ){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill all the information");
            alert.show();
        }else {
        if (setPasswordField.getText().equals(confirmPasswordField.getText())) {
            confirmPasswordLabel.setText("");
            registerUser();
        }else {
            confirmPasswordLabel.setText("Password does not match");
        }
    }
    }



    @FXML
    public void closeButtonOnAction(ActionEvent event){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

    }

    public void registerUser() {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String name = nameTextFiled.getText();
        String passport = passportTextFiled.getText();
        String username = usernameTextFiled.getText();
        String password = setPasswordField.getText();

        String insertFields = "INSERT INTO user_account(name,passport,username,password) VALUES('";
        String insertValues = name +"','"+ passport +"','" + username +"','" + password + "')";
        String insertToRegister = insertFields + insertValues;

        Statement statement = null;
        try {
            statement = connectDB.createStatement();
            statement.executeUpdate(insertToRegister);
            registrationMessageLabel.setText("User has been registered successfully!!");

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }


    }
}
