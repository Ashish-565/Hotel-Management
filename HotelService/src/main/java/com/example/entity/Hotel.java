package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Hotel {

	@Id
	String room_number;
	String room_type;
	double price;
	boolean is_available;
	
	@Override
	public String toString() {
		return "roomNumber ="+room_number;
	}
}
