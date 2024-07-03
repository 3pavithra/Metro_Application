package com.jaya.MetroApplication.Booking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BookingRepo
 */
@Repository
public interface BookingRepo  extends JpaRepository<Booking,Integer>{
    
}