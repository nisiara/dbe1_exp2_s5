package com.duoc.ropastore.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private int id;
	private String brand;
	private String name;
	private double price;
	private String description;
	private String imageUrl;
	private String category;
	private int stock;
}
