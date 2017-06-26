package com.example.orders;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.HttpStatus;

public interface OrderRepository extends MongoRepository<Order, String> {

    public List<Order> findByorderUserEmail(String orderBy);
}