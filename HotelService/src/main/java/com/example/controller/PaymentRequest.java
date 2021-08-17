package com.example.controller;

public class PaymentRequest {

	String room_number;
	String room_type;
	
	public String getRoom_number() {
		return room_number;
	}

	public void setRoom_number(String room_number) {
		this.room_number = room_number;
	}

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	@Override
	public String toString() {
		return "PaymentRequest [room_number=" + room_number + ", room_type=" + room_type + "]";
	}
	
}
