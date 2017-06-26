package com.example.orders;

import java.sql.Array;
import java.util.Date;
import org.springframework.data.annotation.Id;


public class Product {

    @Id
    public String product_id;
    public Integer product_qty;
    public Float product_cost;

    public Product() {

    }
    public Product(String product_id,Integer product_qty,Float product_cost) {
        this.product_id = product_id;
        this.product_cost =product_cost;
        this.product_qty = product_qty;
    }
}