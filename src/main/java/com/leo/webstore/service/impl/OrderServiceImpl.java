package com.leo.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.webstore.domain.Product;
import com.leo.webstore.domain.repository.ProductRepository;
import com.leo.webstore.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private ProductRepository productRepostory;
	public void processOrder(String productId, long quantity) {
		Product productById = productRepostory.getProductById(productId);
		if(productById.getUnitsInStock() < quantity){
			throw new IllegalArgumentException("Out of Stock. Available Units in stock"+ productById.getUnitsInStock());
		}		
		productById.setUnitsInStock(productById.getUnitsInStock() - quantity);

	}
}
