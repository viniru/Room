package com.vinayak.Booking.Room.dao;

import com.vinayak.Booking.Room.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingDAO extends JpaRepository<Booking,Integer> {
    @Override
    List<Booking> findAll();

}
