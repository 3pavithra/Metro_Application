package com.jaya.MetroApplication.Locations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Locationrepo extends JpaRepository<LocationsMetro,Integer>{
    
}
