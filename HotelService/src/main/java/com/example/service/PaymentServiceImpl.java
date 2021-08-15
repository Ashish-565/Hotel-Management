package com.example.service;

import com.example.entity.Hotel;
import com.example.repository.BookRepository;
import com.example.repository.HotelRepository;

public class PaymentServiceImpl implements PaymentService{

	HotelRepository hotelRepository;
	BookRepository bookRepository;
	
	public PaymentServiceImpl(HotelRepository hotelRepository, BookRepository bookRepository) {
		super();
		this.hotelRepository = hotelRepository;
		this.bookRepository = bookRepository;
	}

	@Override
	public void pay(String hotel_name, String room_type, boolean is_available) {

		//TODO
		Hotel hotel = hotelRepository.findById("like '"+hotel_name+"_'").get();
		System.out.println(hotel.toString());
		
	}

}
