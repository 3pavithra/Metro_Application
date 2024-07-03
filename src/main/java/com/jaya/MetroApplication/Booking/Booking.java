package com.jaya.MetroApplication.Booking;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Booking {
    @Id
    private int id;
    private int StartLocation;
    private int EndLocation;

}
