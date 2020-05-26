package com.code.springMvcHibernateXmlCrm.Dao;

import java.util.List;

import com.code.springMvcHibernateXmlCrm.Entity.Customer;

public interface CustomerDao {

	public List<Customer> findAll();

	public Customer getCustomerById(int id);

	public void addCustomer(Customer customer);

	public void deleteById(int id);

}
