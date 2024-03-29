package com.ust.app.customerapp.service;

import java.util.List;

import com.ust.app.customerapp.model.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	
	public Customer getCustomer(int id);
	
	public Customer updateCustomer(Customer customer);
	
	public void deleteCustomer(int id);
	
	public  List<Customer> getAllCustomer();

}
