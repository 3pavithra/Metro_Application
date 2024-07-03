package com.jaya.MetroApplication.Booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {
    
@Autowired
private BookingService bookingService;

public Booking saveController(Booking booking){
    return bookingService.saveService(booking);
}

}
