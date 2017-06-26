package com.example.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrdersApplication {

	@Autowired
	private OrderRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(OrdersApplication.class, args);
	}	
	@RequestMapping(path="/orders", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public String postCustomer(@RequestBody Order order){
		System.out.println(order.toString());
		order.orderState="NEW";
		repository.save(order);
        return "OK";
    } 	
}
