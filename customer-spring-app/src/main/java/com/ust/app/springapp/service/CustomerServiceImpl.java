package com.ust.app.springapp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.codec.Decoder;
import org.springframework.core.codec.Encoder;
import org.springframework.http.codec.CodecConfigurer.CustomCodecs;
import org.springframework.http.codec.CodecConfigurer.DefaultCodecConfig;
import org.springframework.http.codec.HttpMessageReader;
import org.springframework.http.codec.HttpMessageWriter;
import org.springframework.stereotype.Service;

import com.ust.app.springapp.exception.CustomerNotFoundException;
import com.ust.app.springapp.exception.DuplicateCustomerException;
import com.ust.app.springapp.model.Customer;
import com.ust.app.springapp.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository repo;
	
	
	public Customer addCustomer(Customer customer) {
		
//		if(repo.existsById(customer.getId())) {
//            throw new DuplicateCustomerException("Customer Already Exists");
//        }
		
		return repo.save(customer);	
	}
	public Customer addCustomer(int id) {

		 

        if(!repo.existsById(id)) {
            throw new DuplicateCustomerException("Already customer with :"+id+ " will exiust");
        }
        Customer customer = repo.findById(id).get();
        return customer;
    }


	public Customer getCustomer(int id) {
		
		if(!repo.existsById(id)) {
			throw new CustomerNotFoundException("Customer with ID : "+id+" Not found");
		}
		
//		Customer customer = repo.findById(id)
//							.orElseThrow(()->new CustomerNotFoundException("Customer with ID : "+id+" Not found")); 
		
		Customer customer = repo.findById(id).get();
		
		return customer;
		
		
	}


	public Customer updateCustomer(Customer customer) {
		return repo.save(customer);	
	}


	public void deleteCustomer(int id) {
		repo.deleteById(id);
	}


	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	
	public Customer getCustomerByName(String customerName) {
		return repo.findByCustomerName(customerName).get();
	}
	
	@Override
	public List<Customer> findCustomerInDobRange(LocalDate from, LocalDate to) {
		return repo.findByDobRange(from, to);
	}

}
