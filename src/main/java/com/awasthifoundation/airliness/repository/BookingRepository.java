package com.awasthifoundation.airliness.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.awasthifoundation.airliness.model.Booking;

@Repository
public interface BookingRepository  extends CrudRepository <Booking,Long>{

}
