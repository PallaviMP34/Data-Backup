package com.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
@Id
	private int id;
@NotBlank(message="title cannot be blank")
@Size(max=100)
	private String title;
@NotBlank(message="author cannot be blank")
@Size(max=200)
	private String author;
@Digits(integer=13,fraction=0)
	private long ISBN;
@Min(value=1000)
@Max(value=9999)
	private int publication_year;
@DecimalMin("1.00")
	private double price;
	
}
