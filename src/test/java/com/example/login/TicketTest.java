package com.example.login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {


    @Test
    void TicketConstructor(){
        Assertions.assertThrows(Exception.class,() ->{
            new Ticket("China","Hungary",1645,1845,"KLM",-10);
        });
    }

}