package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.PaymentService;

@RestController
@RequestMapping("/book")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	public PaymentResponse pay(@RequestBody PaymentRequest paymentRequest) {
		
		paymentService.pay(paymentRequest.getRoom_number(), paymentRequest.getRoom_number(), paymentRequest.isIs_available());
		PaymentResponse paymentResponse = new PaymentResponse();
		paymentResponse.setMessage("Hotel Room booked");
		return paymentResponse;
		
	}
	
}
