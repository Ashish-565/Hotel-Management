package com.example.service;

import java.util.Date;

public interface PaymentService {

	void pay(String hotel, Date from_date, Date to_date, String room_type);
	
}
