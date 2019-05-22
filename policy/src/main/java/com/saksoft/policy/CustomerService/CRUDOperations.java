package com.saksoft.policy.CustomerService;

import com.saksoft.policy.model.Customer;
/*
import org.springframework.data.jpa.repository.JpaRepository;
*/
import com.saksoft.policy.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CRUDOperations extends CrudRepository<Customer,Integer> {

    @Query(value = "select * from  policy p, left join customer c on (p.cust_id=c.cust_id) where cust_id= ?1",nativeQuery = true)
    public Product findAllCustomers(int id);
}
