package com.vinayak.Booking.Room.service;

import com.vinayak.Booking.Room.dao.BookingDAO;
import com.vinayak.Booking.Room.dao.RoomDAO;
import com.vinayak.Booking.Room.model.Booking;
import com.vinayak.Booking.Room.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookingService{

    @Autowired
    private RoomDAO roomDAO;

    @Autowired
    private BookingDAO bookingDAO;

    public Booking addBooking(int roomId, Booking booking){

        Room room = roomDAO.findById(roomId).orElse(new Room());
        booking.setRoom(room);
        //.setBooking(booking);
        bookingDAO.save(booking);
        return booking;
    }

    public List<Booking> getBookings(){
        return bookingDAO.findAll();
    }

    public Booking getBooking(int bookingId){
        return bookingDAO.findById(bookingId).orElse(new Booking());
    }

    public void checkOut(int bookingId){
        System.out.println(bookingId);
        bookingDAO.deleteById(bookingId);
    }

}
