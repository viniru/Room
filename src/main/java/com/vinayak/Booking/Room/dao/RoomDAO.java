package com.vinayak.Booking.Room.dao;

import com.vinayak.Booking.Room.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomDAO extends CrudRepository<Room,Integer> {
    @Override
    List<Room> findAll();

}
