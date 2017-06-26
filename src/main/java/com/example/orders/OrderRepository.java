package com.example.orders;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {

    public Order findByFirstName(String firstName);
    public List<Order> findByLastName(String lastName);

}