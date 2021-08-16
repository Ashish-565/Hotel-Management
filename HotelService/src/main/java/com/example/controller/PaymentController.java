package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Hotel;
import com.example.repository.HotelRepository;
import com.example.service.PaymentService;

@CrossOrigin(origins = {"*"})
@RestController()
@RequestMapping("/book")
public class PaymentController {

//	@Autowired
//	PaymentService paymentService;
//	
//	public PaymentResponse pay(@RequestBody PaymentRequest paymentRequest) {
//		
//		paymentService.pay(paymentRequest.getRoom_number(), paymentRequest.getRoom_number(), paymentRequest.isIs_available());
//		PaymentResponse paymentResponse = new PaymentResponse();
//		paymentResponse.setMessage("Hotel Room booked");
//		return paymentResponse;
//		
//	}
	
	
	@Autowired
	HotelRepository hotelRepository;
	
	
//	@GetMapping(produces = {"application/json"})
//	public List<String> getAllHotels() {
//		return hotelRepository.findAll()
//				like 'A_'
//	}
	
}
