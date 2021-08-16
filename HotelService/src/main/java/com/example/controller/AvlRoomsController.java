package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Hotel;
import com.example.service.PaymentService;

@CrossOrigin(origins = {"*"})
@RestController()
@RequestMapping("/avl/rooms")
public class AvlRoomsController {

	@Autowired
	PaymentService paymentService;
	
	@GetMapping(value="/{hotel_name}/{room_type}", produces = {"application/json"})
	public List<Hotel> getAvlRooms(@PathVariable(value="hotel_name") String hotel_name, @PathVariable(value="room_type") String room_type) {
		List<Hotel> hotels = paymentService.check(hotel_name, room_type);
		return hotels;
	}
	
}
