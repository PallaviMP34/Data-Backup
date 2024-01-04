package com.ust.app.customerapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.app.customerapp.model.Customer;

import com.ust.app.customerapp.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepo repo ;


	@Override
	public Customer addCustomer(Customer customer) {
		
		return repo.addCustomer(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		
		return repo.getCustomer(id);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int id) {
		
		repo.deleteCustomer(id);
	}

	@Override
	public List<Customer> getAllCustomer() 
	{
		return repo.getAllCustomer();
	}

}
