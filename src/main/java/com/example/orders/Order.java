package com.example.orders;

import java.sql.Array;
import java.util.Date;
import org.springframework.data.annotation.Id;


public class Order {

    @Id
    public String id;

    public String orderBy;
    public Product[] products;
    public Date orderDate;

    public Order() {}

    public Order(String firstName, String lastName) {
        this.orderBy = firstName;
        this.orderDate = new Date();
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, orderBy, orderDate);
    }

}