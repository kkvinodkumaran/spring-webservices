package com.vinod.test.route;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.vinod.test.handler.ProductHandler;

@Configuration
public class ProductRoute {

	@Bean
	public RouterFunction<ServerResponse> route(ProductHandler productHandler) {

		return RouterFunctions
				.route(RequestPredicates.GET("/getProduct").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
						productHandler::getProduct)
				.andRoute(RequestPredicates.GET("/getAllProducts")
						.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), productHandler::getAllProducts);

	}

	
}
