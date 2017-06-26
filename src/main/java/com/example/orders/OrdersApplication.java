package com.example.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrdersApplication implements CommandLineRunner{

	@Autowired
	private OrderRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(OrdersApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of Orders
		repository.save(new Order("Alice", "Smith"));
		repository.save(new Order("Bob", "Smith"));

		// fetch all Orders
		System.out.println("Orders found with findAll():");
		System.out.println("-------------------------------");
		for (Order Order : repository.findAll()) {
			System.out.println(Order);
		}
		System.out.println();

		// fetch an individual Order
		System.out.println("Order found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Orders found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Order Order : repository.findByLastName("Smith")) {
			System.out.println(Order);
		}

	}
}
