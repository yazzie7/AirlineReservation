package com.example.login;   // author   Wangjiacheng

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Buy implements Initializable {

    @FXML
    private Label air;

    @FXML
    private Button back;

    @FXML
    private Button confirm;



    @FXML
    private Label departure;

    @FXML
    private Label destinations;

    @FXML
    private Text landing;

    @FXML
    private Text price;

    @FXML
    private Text takeoff;

    @FXML
    void event1(ActionEvent event) {     //event1 is come back
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();
    }

    @FXML
    void event2(ActionEvent event) {     //event2 is come to the next page (finallybuy page)
        Parent root = null;

        try {
            root = (Parent) FXMLLoader.load(this.getClass().getResource("finallybuy.fxml"));
        } catch (IOException var4) {
            var4.printStackTrace();
        }

        Stage registerStage = new Stage();
        registerStage.setScene(new Scene(root, 600.0D, 433.0D));
        registerStage.show();

    }

    void initData(Ticket a) {
        departure.setText(a.getDeparture());
        destinations.setText(a.getDestinations());
        air.setText(a.getAirlines());

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
