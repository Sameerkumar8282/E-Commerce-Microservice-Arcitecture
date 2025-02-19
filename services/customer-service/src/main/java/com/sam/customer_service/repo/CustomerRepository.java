package com.sam.customer_service.repo;

import com.sam.customer_service.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer,String> {
}
