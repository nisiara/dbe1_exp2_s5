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
	private String id;
	private String name;
	private double price;
	private String description;
	private String imageUrl;
	private String category;
	private boolean hasStock;
}
