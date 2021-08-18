package com.example.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Book;
import com.example.entity.Hotel;
import com.example.exception.NoRoomFoundException;
import com.example.repository.BookRepository;
import com.example.repository.HotelRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

	HotelRepository hotelRepository;
	BookRepository bookRepository;

	public PaymentServiceImpl(HotelRepository hotelRepository, BookRepository bookRepository) {
		super();
		this.hotelRepository = hotelRepository;
		this.bookRepository = bookRepository;
	}

	@Transactional
	@Override
	public String pay(String room_number, Date from_date, Date to_date) {

//		Hotel hotel = hotelRepository.findRoomById(room_number);
//		
//		hotel.setIs_available(false);

		Optional<Hotel> optionalHotel = hotelRepository.findById(room_number);
		Hotel hotel = optionalHotel.orElseThrow(() -> new NoRoomFoundException(room_number));
		
		hotel.setIs_available(false);
		hotelRepository.save(hotel);
		
		Book book = new Book(room_number, from_date, to_date);
		bookRepository.save(book);
		
		return "Hotel room booked";
	}

}
