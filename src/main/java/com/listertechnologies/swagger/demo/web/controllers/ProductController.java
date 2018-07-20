package com.listertechnologies.swagger.demo.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.listertechnologies.swagger.demo.web.model.Product;
import com.listertechnologies.swagger.demo.web.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/products")
@Api(value = "onlinestore", description = "RestAPI to maintain the Online store")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping
	@ApiOperation(value = "Get all products")
	public List<Product> list() {
		List<Product> productList = productService.getAllProducts();
		return productList;
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Get a product by Id", response = Product.class)
	public ResponseEntity<Product> getProduct(@PathVariable Integer id) {
		Product product = productService.getProduct(id);
		if (product != null) {
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		}
		return new ResponseEntity<Product>(product, HttpStatus.NOT_FOUND);
	}
}
