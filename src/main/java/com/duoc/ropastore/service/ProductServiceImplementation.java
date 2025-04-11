package com.duoc.ropastore.service;

import com.duoc.ropastore.model.Product;
import com.duoc.ropastore.repository.ProductRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {

	//Instanciamos la clase ProductService para acceder a los servicios.
	private final ProductRepository productRepository = new ProductRepository();

	@Override
	public List<Product> getProducts(){
		return productRepository.getProducts();
	}

	@Override
	public List<Product> getProductsByCategory(String category){
		return productRepository.getProductsByCategory(category);
	}

	@Override
	public List<Product> sortProductsByName() {
		return productRepository.sortProductsByName();
	}

}
