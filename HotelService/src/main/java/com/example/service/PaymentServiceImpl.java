package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Hotel;
import com.example.repository.BookRepository;
import com.example.repository.HotelRepository;

@Service
public class PaymentServiceImpl implements PaymentService{

	HotelRepository hotelRepository;
	BookRepository bookRepository;
	
	public PaymentServiceImpl(HotelRepository hotelRepository, BookRepository bookRepository) {
		super();
		this.hotelRepository = hotelRepository;
		this.bookRepository = bookRepository;
	}

	@Transactional
	@Override
	public String pay(String room_number, String room_type) {

		List<Hotel> hotels = hotelRepository.findAllByNameAndType(room_number+"_", room_type);
		if(hotels.size()>0) {
			
			return "Hotel booked";
		}else {
			return "No rooms are available"; 
		}

	}

}
