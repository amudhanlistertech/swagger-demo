package com.listertechnologies.swagger.demo.web.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.listertechnologies.swagger.demo.web.model.Product;

@Service
public class ProductService {

	private List<Product> products = new ArrayList<Product>() {
		{
			add(new Product(1, 1, "101", "Laptop", "/products/laptop/101/image1.jpg", new BigDecimal(2000)));
			add(new Product(2, 1, "102", "Computer", "/products/computer/102/image1.jpg", new BigDecimal(1500)));
			add(new Product(3, 1, "103", "Camera", "/products/camera/103/image1.jpg", new BigDecimal(500)));
		}
	};

	public List<Product> getAllProducts() {
		return products;
	}

	public Product getProduct(Integer id) {
		Optional<Product> result = products.stream().filter(p -> p.getId().equals(id)).findFirst();
		Product product = result.isPresent() ? result.get() : null;
		return product;
	}

}
