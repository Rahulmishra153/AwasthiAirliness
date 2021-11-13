package com.awasthifoundation.airliness.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
	
	
	@Id
	@GeneratedValue
	@Column(name="booking_id")
	private long booking_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="mobile_num")
	private String mobile_num;
	
	@Column(name="price")
	private float price;
	
	@Column(name="seats")
	private int seats;

	@Column(name="from_where")
	private String from_where;
	
	@Column(name="to_where")
	private String to_where;
	
	@Column(name="date")
	private String date;

	public long getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(long booking_id) {
		this.booking_id = booking_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile_num() {
		return mobile_num;
	}

	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getFrom_where() {
		return from_where;
	}

	public void setFrom_where(String from_where) {
		this.from_where = from_where;
	}

	public String getTo_where() {
		return to_where;
	}

	public void setTo_where(String to_where) {
		this.to_where = to_where;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
