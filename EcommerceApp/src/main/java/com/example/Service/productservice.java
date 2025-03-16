package com.example.Service;
import com.example.model.product;



import java.util.List;
import org.springframework.stereotype.Service;

import com.example.repository.ProductRepository;
@Service
public class productservice {
	private final ProductRepository ProductRepositorY;
	 public productservice(ProductRepository ProductRepositorY) {
		 this.ProductRepositorY= ProductRepositorY;
	 }
public List<product> getAllProduct(){
	return ProductRepositorY.findAll();
}
 
public product createProduct(product Product) {
	return ProductRepositorY.save(Product); 
}
 
}
