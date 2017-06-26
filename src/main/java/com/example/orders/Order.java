package com.example.orders;

import org.springframework.data.annotation.Id;


public class Order {

    @Id
    public String id;

    public String firstName;
    public String lastName;

    public Order() {}

    public Order(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}