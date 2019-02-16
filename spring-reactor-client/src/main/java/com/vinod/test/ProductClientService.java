package com.vinod.test;

import javax.annotation.PostConstruct;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

/**
 * @author vinodkariyathungalkumaran
 *
 */
@Service
public class ProductClientService {

	private WebClient client = WebClient.create("http://localhost:8080");

	@PostConstruct
	public void getResult() {
		Mono<ClientResponse> product = client.get().uri("/getProduct").accept(MediaType.APPLICATION_JSON).exchange();
		Mono<ClientResponse> products = client.get().uri("/getAllProducts").accept(MediaType.APPLICATION_JSON)
				.exchange();

		System.out.println("Get Product Result=" + product.flatMap(res -> res.bodyToMono(String.class)).block());
		System.out.println("Get All Product Result=" + products.flatMap(res -> res.bodyToMono(String.class)).block());

	}
}
