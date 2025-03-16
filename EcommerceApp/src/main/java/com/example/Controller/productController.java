package com.example.Controller;

import org.springframework.web.bind.annotation.*;


import java.util.List;
import com.example.model.product;
import com.example.Service.productservice;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class productController {
	private final productservice products;
	
	public productController(productservice products) {
		this.products =products;
	}
	@GetMapping
	public List<product> getAllProduct(){
		return products.getAllProduct();
	}
@PostMapping
public product createProduct(@RequestBody product product) {
	return products.createProduct(product);
}
}
