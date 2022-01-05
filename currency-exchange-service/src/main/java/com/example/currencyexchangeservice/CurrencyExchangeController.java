package com.example.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;
	@Autowired
	private ExchangeValueRepo exchangRepo;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) throws Exception {

		ExchangeValue object = new ExchangeValue(System.currentTimeMillis(), from, to, 55D);
		object.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
//	
//		if (1 == 1)
//			throw new Exception();
		return exchangRepo.save(object);
	}
}
