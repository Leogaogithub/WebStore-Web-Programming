package com.leo.webstore.domain.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.leo.webstore.domain.Customer;
import com.leo.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
	public InMemoryCustomerRepository(){
		Customer customer1 = new Customer("C100","LEO");
		customer1.setAddress("UCLA");
		
		Customer customer2 = new Customer("C101","DAVIS");
		customer2.setAddress("UTD");
	    listOfCustomers.add(customer1);
	    listOfCustomers.add(customer2);	    
	}
	private List<Customer> listOfCustomers = new ArrayList<Customer>();
	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}

}
