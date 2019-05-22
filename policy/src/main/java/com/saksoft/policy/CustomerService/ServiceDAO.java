package com.saksoft.policy.CustomerService;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.saksoft.policy.model.Customer;
import com.saksoft.policy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServiceDAO {
   @Autowired
    private CRUDOperations crud;

    public Product getAll(int id){
        return crud.findAllCustomers(id);

    }

}
