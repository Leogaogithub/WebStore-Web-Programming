package com.leo.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.webstore.domain.Customer;
import com.leo.webstore.domain.repository.CustomerRepository;
import com.leo.webstore.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	public List<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}

}
