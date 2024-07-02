package com.jaya.MetroApplication.Profile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProfileDto {
   
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Id
    private int roll_no;
    private String name;
    private String address;
    private String email;
    private int mobile_no;
    




}
  

    



    
