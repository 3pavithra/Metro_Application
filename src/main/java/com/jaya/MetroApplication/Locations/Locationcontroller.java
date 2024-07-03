package com.jaya.MetroApplication.Locations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Locationcontroller
 */
@RestController
@RequestMapping("/locations")
public class Locationcontroller {

    @Autowired
    private Locationservice locationservice;

    @PostMapping("/save")
    public LocationsMetro saveController(Location locations){
return locationservice.saveService(locations);
    }
}