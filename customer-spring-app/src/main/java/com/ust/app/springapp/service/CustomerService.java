package com.ust.app.springapp.service;

import java.time.LocalDate;
import java.util.List;

import com.ust.app.springapp.model.Customer;

public interface CustomerService {

public Customer addCustomer(Customer customer);
	
	public Customer getCustomer(int id);
	
	public Customer updateCustomer(Customer customer);
	
	public void deleteCustomer(int id);
	
	public List<Customer> getAllCustomers();

	public Customer getCustomerByName(String customerName);
	
	public List<Customer> findCustomerInDobRange(LocalDate from, LocalDate to);
	
}

