package com.awasthifoundation.airliness.model;

public class AddBookingRequest {
	
	private String name;
	private String mobile_num;
	private float price;
	private int seats;
	private String from_where;
	private String to_where;
	private String date;
	
	
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
