package com.duoc.ropastore.repository;

import com.duoc.ropastore.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {

	private final List<Product> products = new ArrayList<>();

	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public List<Product> getProductsByCategory(String category) {
		return getProducts().stream()
			.filter(product -> product.getCategory().equals(category)).collect(Collectors.toList());
	}

	public List<Product> sortProductsByName() {
		return getProducts().stream()
			.sorted(Comparator.comparing(Product::getName)).toList();
	}

	public ProductRepository(){
		products.add(new Product(
			1,
			"fjallraven",
			"foldsack backpack",
			109.95,
			"your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
			"https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
			"accesories",
			12
			)
		);

		products.add(new Product(
				2,
				"adidas",
				"slim fit t-shirt",
				22.3,
				"Slim-fitting style, contrast raglan long sleeve, three-button henley placket, light weight & soft fabric for breathable and comfortable wearing. And Solid stitched shirts with round neck made for durability and a great fit for casual fashion wear and diehard baseball fans. The Henley style round neckline includes a three-button placket.",
				"https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_.jpg",
				"clothing",
				5
			)
		);

		products.add(new Product(
				3,
				"benetton",
				"cotton jacket",
				55.99,
				"great outerwear jackets for Spring/Autumn/Winter, suitable for many occasions, such as working, hiking, camping, mountain/rock climbing, cycling, traveling or other outdoors. Good gift choice for you or your family member.",
				"https://fakestoreapi.com/img/71li-ujtlUL._AC_UX679_.jpg",
				"clothing",
				0
			)
		);
	}

}
