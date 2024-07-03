package com.jaya.MetroApplication.Locations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Locationservice
 */

 @Service
public class Locationservice {

    @Autowired
    private LocationDao dao;

    public Locations saveService(Locations locations){
        return dao.saveDao(locations);
    }
    
}