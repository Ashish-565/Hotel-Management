package com.example.service;

import java.util.Date;
import java.util.List;

import com.example.entity.Hotel;

public interface PaymentService {

	String pay(String hotel_name, Date from_date, Date to_date);
	
}
