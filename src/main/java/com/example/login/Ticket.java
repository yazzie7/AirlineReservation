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

    public String getDeparture() {
        return this.Departure.get();
    }

    public String getDestinations() {
        return this.Destinations.get();
    }

    public int getTakeoff() {
        return this.Takeoff.get();
    }

    public int getLanding() {
        return this.Landing.get();
    }

    public int getNO() {
        return this.NO.get();
    }



    public Ticket(String Departure, String Destinations, Integer Takeoff, Integer Landing, String Airlines, Integer NO) {

        if(NO<0) throw new RuntimeException("Please enter valid Number");
        this.Airlines = new SimpleStringProperty(Airlines);
        this.Departure = new SimpleStringProperty(Departure);
        this.Destinations = new SimpleStringProperty(Destinations);
        this.Takeoff = new SimpleIntegerProperty(Takeoff);
        this.Landing = new SimpleIntegerProperty(Landing);
        this.NO = new SimpleIntegerProperty(NO);

    }
}


