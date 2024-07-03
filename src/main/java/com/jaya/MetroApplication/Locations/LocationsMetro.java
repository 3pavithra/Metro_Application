package com.jaya.MetroApplication.Locations;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class LocationsMetro {
  @Id
private int id;
  private String name;
  private int kms;
  private int amount;
  
}