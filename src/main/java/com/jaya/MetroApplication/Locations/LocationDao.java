package com.jaya.MetroApplication.Locations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * LocationDao
 */
@Repository
public class LocationDao {

@Autowired
private Locationrepo repo;


public Locations saveDao(Locations locations){
    return repo.save(locations);
}
    
}