package com.example.login;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Ticket {
    private final SimpleStringProperty Airlines;
    private final SimpleStringProperty Departure;
    private final SimpleStringProperty Destinations;

    private final SimpleIntegerProperty Takeoff;
    private final SimpleIntegerProperty Landing;
    private final SimpleIntegerProperty NO;

    public String getAirlines() {
        return this.Airlines.get();
    }


    public void setAirlines(String Airlines) {
        this.Airlines.set(Airlines);
    }

    public String getDeparture() {
        return this.Departure.get();
    }



    public void setDeparture(String Departure) {
        this.Departure.set(Departure);
    }

    public String getDestinations() {
        return this.Destinations.get();
    }



    public void setDestinations(String Destinations) {
        this.Destinations.set(Destinations);
    }






    public int getTakeoff() {
        return this.Takeoff.get();
    }




    public void setTakeoff(int Takeoff) {
        this.Takeoff.set(Takeoff);
    }

    public int getLanding() {
        return this.Landing.get();
    }



    public void setLanding(int Landing) {
        this.Landing.set(Landing);
    }

    public int getNO() {
        return this.NO.get();
    }



    public void setNO(int NO) {
        this.NO.set(NO);
    }

    public Ticket(String Departure,String Destinations, Integer Takeoff, Integer Landing, String Airlines,Integer No) {

        this.Airlines = new SimpleStringProperty(Airlines);
        this.Departure = new SimpleStringProperty(Departure);
        this.Destinations = new SimpleStringProperty(Destinations);
        this.Takeoff = new SimpleIntegerProperty(Takeoff);
        this.Landing = new SimpleIntegerProperty(Landing);
        this.NO = new SimpleIntegerProperty(No);




    }
}
