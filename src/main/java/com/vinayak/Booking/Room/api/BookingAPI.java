package com.vinayak.Booking.Room.api;

import com.vinayak.Booking.Room.model.Booking;
import com.vinayak.Booking.Room.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingAPI {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/{roomId}")
    public com.vinayak.Booking.Room.model.Booking addBooking(@PathVariable int roomId, @RequestBody Booking booking){
        return bookingService.addBooking(roomId,booking);
    }

    @GetMapping
    public List<Booking> getBookings(){
        return bookingService.getBookings();
    }

    @GetMapping("/{bookingId}")
    public Booking getBooking(@PathVariable int bookingId){
        return bookingService.getBooking(bookingId);
    }

    @DeleteMapping("/{bookingId}")
    public void checkOut(@PathVariable int bookingId){
        bookingService.checkOut(bookingId);
    }

}
