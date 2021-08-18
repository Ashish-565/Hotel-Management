package com.example.controller;

import java.util.Date;

public class PaymentRequest {

	String room_number;
	Date from_date;
	Date to_date;
	
	public String getRoom_number() {
		return room_number;
	}

	public void setRoom_number(String room_number) {
		this.room_number = room_number;
	}

	public Date getFrom_date() {
		return from_date;
	}

	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}

	public Date getTo_date() {
		return to_date;
	}

	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}

	@Override
	public String toString() {
		return "PaymentRequest [room_number=" + room_number + ", from_date=" + from_date + ", to_date=" + to_date + "]";
	}

}
