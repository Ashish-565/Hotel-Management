package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{

	List<Hotel> check(String hotel, String room_type);
	
}
