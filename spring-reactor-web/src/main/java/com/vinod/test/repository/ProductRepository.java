package com.vinod.test.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vinod.test.model.Product;

import reactor.core.publisher.Flux;

@Repository
public class ProductRepository {

	/**
	 * @return
	 */
	public Product getProduct() {
		return new Product("Phone", "Nokia3310", "2000", "2019");
	}
	/**
	 * @return
	 */
	public Flux<Product> getAllProducts() {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Phone", "Nokia3310", "2000", "2019"));
		list.add(new Product("Phone", "Motorola", "2000", "2019"));
		list.add(new Product("Phone", "samsung", "2000", "2019"));
		list.add(new Product("Phone", "LG", "2000", "2019"));
		return Flux.fromIterable(list);
	}
}
