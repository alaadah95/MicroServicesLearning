package com.example.cloudapigatway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class PreGlobal implements GlobalFilter {

	final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logger.info("FIRST PRE FILTER IS EXC ." );
		return chain.filter(exchange);
	}

}
