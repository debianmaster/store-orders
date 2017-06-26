package com.example.orders;

import java.sql.Array;
import java.util.Date;
import org.springframework.data.annotation.Id;


public class Order {

    @Id
    public String id;

    public String orderUserEmail;
    public Product[] products;
    public Date orderDate;
    public String orderState;

    public Order() {}
    public String toString(){
        return orderUserEmail;
    }
}