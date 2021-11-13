package com.awasthifoundation.airliness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.awasthifoundation.airliness.model.AddBookingRequest;
import com.awasthifoundation.airliness.model.Booking;
import com.awasthifoundation.airliness.service.BookingService;

@RestController
public class BookingController {

@Autowired	
BookingService bookingService;
	
	//Get Request without input parameters
	@GetMapping(path="/ping")
	public String ping() {
		return "ping successfull";
	}
	//Get request with parameters
	@GetMapping(path="/hello")
	public String hello(@RequestParam String name,@RequestParam  int age) {
		return "Hello"  + name +  ",Your age is: "  +age;
	}
	//Get request with parameters
		@GetMapping(path="/getAllBookings")
		public Iterable<Booking> getAllBookings() {
			return bookingService.getAllBookings();
		}
		
		@PostMapping(path="/addBooking")
		public String addBooking(@RequestBody AddBookingRequest addBookingRequest) {
			return bookingService.addBooking(addBookingRequest);
			 	}
		@DeleteMapping(path="/deleteBooking")
		public String deleteBooking(@RequestParam long booking_id) {
			return bookingService.deleteBooking(booking_id);
		}
		@PutMapping(path="/updateBooking")
		public String updateBooking(@RequestParam long booking_id,@RequestBody AddBookingRequest addBookingRequest) {
			return bookingService.updateBooking(booking_id,addBookingRequest);
		}
}
