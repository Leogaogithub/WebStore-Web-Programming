package com.leo.webstore.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.webstore.domain.Product;
import com.leo.webstore.domain.repository.ProductRepository;
import com.leo.webstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;
	public List<Product> getAllProducts() {		
		return productRepository.getAllProducts();
	}
	public List<Product> getProductsByCategory(String category) {
		  return productRepository.getProductsByCategory(category);
		}
	
	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
	    return productRepository.getProductsByFilter(filterParams);
	}
	
	public Product getProductById(String productId){
		return productRepository.getProductById(productId);
	}
}
