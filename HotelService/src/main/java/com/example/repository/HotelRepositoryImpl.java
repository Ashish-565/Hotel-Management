package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.entity.Hotel;

public abstract class HotelRepositoryImpl implements HotelRepository{


	@Override
	public List<Hotel> check(String hotel, String room_type) {
		// TODO Auto-generated method stub
		return null;
	}

}
