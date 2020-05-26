package com.code.springMvcHibernateXmlCrm.Service;

import java.util.List;

import com.code.springMvcHibernateXmlCrm.Entity.Customer;

public interface CustomerService {

	public List<Customer> findAll();

	public void addCustomer(Customer customer);

	public void deleteById(int id);

	public Customer getCustomerById(int id);
}
