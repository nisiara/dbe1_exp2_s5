package com.duoc.ropastore.service;

import com.duoc.ropastore.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

	List<Product> getProducts();
	List<Product> getProductsByCategory(String category);
	List<Product> sortProductsByName();

}
