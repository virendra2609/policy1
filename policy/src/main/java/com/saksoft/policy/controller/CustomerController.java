package com.saksoft.policy.controller;

import com.saksoft.policy.CustomerService.ServiceDAO;
import com.saksoft.policy.model.Customer;
import com.saksoft.policy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private ServiceDAO service;

    @RequestMapping(value = "/cust/{no}")
    public Product getAllCustomers(@PathVariable("no") int id){
        return service.getAll(id);
    }
}
