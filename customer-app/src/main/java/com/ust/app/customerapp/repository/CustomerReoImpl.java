package com.ust.app.customerapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ust.app.customerapp.model.Customer;
@Repository
public class CustomerReoImpl implements CustomerRepo {
		static List<Customer> customerDb=new ArrayList<>();

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDb.add(customer);
		return customer;
	}

	@Override
	public Customer getCustomer(int id) {
//		for(Customer c:customerDb) {
//			if(c.getId()==id);{
//				return c;
//			}
//		}
		Customer customer=customerDb.stream().filter(c->c.getId()==id).findFirst().get();
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer oldCustomer=customerDb.stream().filter(c->c.getId()==customer.getId()).findFirst().get();
		oldCustomer.setCustomerName(customer.getCustomerName());
		oldCustomer.setDob(customer.getDob());
		oldCustomer.setEmail(customer.getEmail());
		
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		customerDb.remove(id);
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		return new ArrayList<>( customerDb);
	}

}
