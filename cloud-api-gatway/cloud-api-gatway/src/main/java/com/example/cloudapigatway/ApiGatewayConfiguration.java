package com.example.cloudapigatway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

	@Bean
	public RouteLocator getewayRouter(RouteLocatorBuilder builder) {

		return builder.routes().route(p -> p.path("/currency-conversion/**").uri("lb://currency-conversion-service"))
				.route(p -> p.path("/currency-exchange/**").uri("lb://currency-exchange-service"))
				.route(p -> p.path("/currency-conversion-new/**")
						.filters(f -> f.rewritePath("/currency-conversion-new/(?<segment>.*)",
								"/currency-conversion/${segment}"))
						.uri("lb://currency-conversion-service"))
				.route(p -> p.path("/albums").uri("lb://limits-service")).build();

	}
}
