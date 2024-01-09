package com.example.programs.service;

import com.example.programs.model.Customer;
import com.example.programs.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
   public Customer getCustomerById(Long customerId){
       Optional<Customer> OptionalCustomer= customerRepository.findById(customerId);
      return OptionalCustomer.get();
   }

}
