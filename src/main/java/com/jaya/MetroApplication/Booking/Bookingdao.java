package com.jaya.MetroApplication.Booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Bookingdao
 */
@Repository
public class Bookingdao {

    @Autowired
    private BookingRepo repo;

public Booking savedao(Booking booking){
    return repo.save(booking);
}
    
}