package com.example.login;  // author:Wangjiacheng
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class Findfight implements Initializable {

    @FXML
    private TableColumn<Ticket, String> airlines;

    @FXML
    private TableColumn<Ticket, String> departure;

    @FXML
    private TableColumn<Ticket, String> destinations;

    @FXML
    private TableColumn<Ticket, Integer> landing;

    @FXML
    private TableColumn<Ticket, Integer> price;

    @FXML
    private TableColumn<Ticket, Integer> takeoff;


    @FXML
    private TableView table;


    String databaseName = "demo_ticket";
    String databaseUser = "root";
    String databasePassword = "abc123";
    String url = "jdbc:mysql://localhost/" + databaseName;
    String jdbc = "com.mysql.cj.jdbc.Driver";
    ResultSet rst = null;
    Connection cont = null;
    Statement ppst = null;


    public void start() throws Exception {


        departure.setCellValueFactory(new PropertyValueFactory("Departure"));
        destinations.setCellValueFactory(new PropertyValueFactory("Destinations"));
        takeoff.setCellValueFactory(new PropertyValueFactory("Takeoff"));
        landing.setCellValueFactory(new PropertyValueFactory("Landing"));
        airlines.setCellValueFactory(new PropertyValueFactory("Airlines"));
        price.setCellValueFactory(new PropertyValueFactory("Price"));
        table.setOnMousePressed(event -> {
            if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
                try {
                    showCustomerDialog((Ticket) table.getSelectionModel().getSelectedItem());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(table.getSelectionModel().getSelectedItem());

            }
        });

        try {
            Class.forName(jdbc);
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql4 = "SELECT * FROM inf_ticket";
        ObservableList<Ticket> data = FXCollections.observableArrayList();
        try {
            cont = DriverManager.getConnection(url, databaseUser, databasePassword);
            ppst = cont.createStatement();
            rst = ppst.executeQuery(sql4);
            //System.out.print("connected");
            while(rst.next()) {
                data.add(new
                        Ticket(rst.getString(1),rst.getString(2),rst.getInt(3),rst.getInt(4),rst.getString(5),rst.getInt(6)));

                table.setItems(data);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            if(cont != null && ppst != null && rst != null) {
                try {
                    cont.close();
                    ppst.close();
                    rst.close();
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public Stage showCustomerDialog(Ticket a) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "buy.fxml"
                )
        );

        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setScene(
                new Scene(loader.load())
        );

        Buy controller = loader.getController();
        controller.initData(a);

        stage.show();

        return stage;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {

            start();



        } catch (Exception ex) {
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

