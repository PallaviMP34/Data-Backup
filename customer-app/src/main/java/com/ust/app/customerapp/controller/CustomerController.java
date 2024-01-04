package com.ust.app.customerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ust.app.customerapp.model.Customer;
import com.ust.app.customerapp.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@ResponseStatus(code=HttpStatus.CREATED)
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	@ResponseStatus(code=HttpStatus.OK)
	@GetMapping("/customers")
	public List<Customer> getAllCustomer(){
		return service.getAllCustomer();
	}
	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return service.getCustomer(id);
		
	}
	@DeleteMapping("/customers/delete/{id}")
	public void deleteCustomer( int id) {
		service.deleteCustomer(id);
	}
	
}
