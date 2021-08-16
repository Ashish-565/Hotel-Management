package com.example.controller;

public class PaymentRequest {

	String hotel_name;
	String room_type;
	
	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	@Override
	public String toString() {
		return "PaymentRequest [hotel_name=" + hotel_name + ", room_type=" + room_type + "]";
	}
	
}
