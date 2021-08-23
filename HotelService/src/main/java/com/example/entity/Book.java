package com.example.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int book_id;
	String room_number;
	Date from_date;
	Date to_date;
	@OneToOne(cascade = CascadeType.ALL, targetEntity = Customer.class)
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	int customer_id;
	
	public Book(String room_number, Date from_date, Date to_date) {
		super();
		this.room_number = room_number;
		this.from_date = from_date;
		this.to_date = to_date;
	}
	
}
