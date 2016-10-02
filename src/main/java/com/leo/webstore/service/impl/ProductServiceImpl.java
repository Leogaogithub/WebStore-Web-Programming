package com.leo.webstore.service.impl;

import java.util.List;

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

}
