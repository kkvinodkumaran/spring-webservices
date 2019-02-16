package com.vinod.test.handler;

import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.vinod.test.model.Product;
import com.vinod.test.repository.ProductRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Component
public class ProductHandler {

	@Autowired
	 private  ProductRepository repository;
	 
	public Mono<ServerResponse> getProduct(ServerRequest request) {
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
			.body(BodyInserters.fromObject(repository.getProduct()));
	}
	public Mono<ServerResponse> getAllProducts(ServerRequest request) {
		Flux<Product> productList=repository.getAllProducts();
		System.out.println(productList);
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
			.body(repository.getAllProducts(),Product.class);
	}
}
