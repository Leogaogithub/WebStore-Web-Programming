package com.leo.webstore.domain.repository;

import java.util.List;

import com.leo.webstore.domain.Product;

public interface ProductRepository {
	List <Product> getAllProducts();
	Product getProductById(String productId);
}
