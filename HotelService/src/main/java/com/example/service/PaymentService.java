package com.example.service;

import java.util.List;

import com.example.entity.Hotel;

public interface PaymentService {

	List<Hotel> check(String hotel_name, String room_type);
	String pay(String hotel_name, String room_type);
	
}
