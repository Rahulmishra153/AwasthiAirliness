package com.awasthifoundation.airliness.service;

import com.awasthifoundation.airliness.model.AddBookingRequest;
import com.awasthifoundation.airliness.model.Booking;

public interface BookingService {
	
	public Iterable<Booking>getAllBookings();

	public String addBooking( AddBookingRequest addBookingRequest);
	
	public String deleteBooking(long booking_id);
	
	public String updateBooking(long booking_id,AddBookingRequest addBookingRequest);
}
