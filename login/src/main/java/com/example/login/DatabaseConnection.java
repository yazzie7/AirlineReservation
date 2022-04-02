package com.example.login;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection(){
        //I'm using mysql to be database
        //and the name of table is users, this table includes all the user information
        //like firstname lastname username password
        //These three lines need to be changed on your own computer
        String databaseName = "airline";//here you can use your own database name
        String databaseUser = "root";//this is the username of your database
        String databasePassword = "qyc220284";//here is the password for the user
        String url = "jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return databaseLink;


    }
}
