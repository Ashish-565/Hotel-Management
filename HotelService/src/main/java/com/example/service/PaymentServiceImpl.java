package com.example.service;

import java.util.Date;

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
	public void pay(String hotel_id, Date from_date, Date to_date, String room_type) {

		Hotel hotel = hotelRepository.findById("like '"+hotel_id+"_'").get();
		System.out.println(hotel.toString());
		
	}

}
