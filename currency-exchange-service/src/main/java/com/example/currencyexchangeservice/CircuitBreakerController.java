package com.example.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {

	@Autowired
	private RestTemplate restTemplete;

	private Logger logger = LoggerFactory.getLogger(getClass());
	int counter = 0;

	@GetMapping("/sample-api")
	@Retry(name = "default", fallbackMethod = "sampleApiFallBack" )
	public String sampleApi() {

		logger.info("DOOOOOO ===> " + counter++);
		restTemplete.exchange("http://localhost:8080/dddd", HttpMethod.GET, null, ExchangeValue.class);

		return "sample";
	}

	public String sampleApiFallBack(Exception e) {

		return e.getMessage();
	}

}
