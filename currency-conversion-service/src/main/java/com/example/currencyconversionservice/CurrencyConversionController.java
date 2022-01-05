package com.example.currencyconversionservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@Autowired
	private Environment environment;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private CurrencyExchanageServiceProxy currencyExchangeServiceProxy;

	Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean currencyConversionBean(@PathVariable String from, @PathVariable String to,
			@PathVariable Double quantity) {

//		ResponseEntity<CurrencyConversionBean> rest = restTemplate.exchange(
//				"http://currency-exchange-service/currency-exchange/from/" + from + "/to/" + to, HttpMethod.GET, null,
//				CurrencyConversionBean.class);
//		CurrencyConversionBean response = rest.getBody();

		logger.info("Before calling .");
		CurrencyConversionBean response = currencyExchangeServiceProxy.retrieveExchangeValue(from, to);
//		response.setPort(environment.getProperty("local.server.port"));
		logger.info("After calling .");
		response.setTotalCalculatedAmount(quantity * response.getConversionMultiple());
		response.setQuantity(quantity);
		return response;
	}
}
