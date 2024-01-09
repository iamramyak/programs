package com.example.programs.controller;

import com.example.programs.model.Customer;
import com.example.programs.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerService.createCustomer(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);

    }
    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> customers= customerService.getAllCustomers();
        return new ResponseEntity<>(customers,HttpStatus.OK);
    }
    @GetMapping({"/id"})
    public ResponseEntity<Customer> UpdateCustomer(@PathVariable ("id") Long customerId,@RequestBody Customer customer) {
        customer.setId(customerId);
        Customer UpdatedCustomer= customerService.getCustomerById(customerId);
        return new ResponseEntity<>(UpdatedCustomer,HttpStatus.OK);
    }
}
