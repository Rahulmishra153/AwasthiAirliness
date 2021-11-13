package com.awasthifoundation.airliness.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awasthifoundation.airliness.model.AddBookingRequest;
import com.awasthifoundation.airliness.model.Booking;
import com.awasthifoundation.airliness.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService  {

	
	
	@Autowired
	BookingRepository bookingRepository;
	@Override
	public Iterable<Booking> getAllBookings() {
	Iterable<Booking> allBookings=bookingRepository.findAll();
	return allBookings;
	}
	@Override
	public String addBooking( AddBookingRequest addBookingRequest) {
		Booking booking=new Booking();
		booking.setDate(addBookingRequest.getDate());
		booking.setFrom_where(addBookingRequest.getFrom_where());
		booking.setMobile_num(addBookingRequest.getMobile_num());
		booking.setName(addBookingRequest.getName());
		booking.setPrice(addBookingRequest.getPrice());
		booking.setSeats( addBookingRequest.getSeats());
		booking.setTo_where(addBookingRequest.getTo_where());
		booking= bookingRepository.save(booking);
		return "Booking Added Successfully with booking id- " + booking.getBooking_id();
	}
	@Override
	public String deleteBooking(long booking_id) {
		 bookingRepository.deleteById(booking_id);
		return "Booking deleted successfully";
	}
	@Override
	public String updateBooking(long booking_id, AddBookingRequest addBookingRequest) {
		Optional<Booking> booking = bookingRepository.findById(booking_id);
		if(booking.isPresent()) {
			booking.get().setDate(addBookingRequest.getDate());
			booking.get().setFrom_where(addBookingRequest.getFrom_where());
			booking.get().setMobile_num(addBookingRequest.getMobile_num());
			booking.get().setName(addBookingRequest.getName());
			booking.get().setPrice(addBookingRequest.getPrice());
			booking.get().setSeats( addBookingRequest.getSeats());
			booking.get().setTo_where(addBookingRequest.getTo_where());
			 bookingRepository.save(booking.get());
	}
		return "Booking Updated Successfully with booking id- " + booking.get().getBooking_id();

	}

}
