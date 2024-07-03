package com.jaya.MetroApplication.Booking;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaya.MetroApplication.Locations.Locationrepo;
import com.jaya.MetroApplication.Locations.LocationsMetro;

@Service
public class BookingService {

    @Autowired
    private Bookingdao dao;

    @Autowired
    private Locationrepo locationrepo;
    
    public Booking saveService(Booking booking){
        //logic starts here

        //we need 2 locations here from locations table
        int StartLocation=booking.getStartLocation();
        Optional<LocationsMetro> locationsMetro1=locationrepo.findById(StartLocation);
        


        int endLocation=booking.getEndLocation();
        Optional<LocationsMetro> locationsMetro2=locationrepo.findById(endLocation);

    
int sum=0;
        for (int i = StartLocation; i <=endLocation; i++) {
          sum+=locationsMetro1.getKms();
        }
System.out.println(sum);

return dao.savedao(booking);
    }
}
