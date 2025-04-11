package com.duoc.ropastore.controller;

import com.duoc.ropastore.model.Product;
import com.duoc.ropastore.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

	private final ProductService productService;

	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts() {
		List<Product> products = productService.getProducts();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@GetMapping("/products/{category}")
	public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable String category) {

		List<Product> products = productService.getProductsByCategory(category);
		if(products.isEmpty()){
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(products, HttpStatus.OK);
		}
	}

	@GetMapping("products/order-by-name")
	public ResponseEntity<List<Product>> getProductsByName(){
		List<Product> products = productService.sortProductsByName();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
}
