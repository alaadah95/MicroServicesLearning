package com.example.currencyconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversion")
public class LimitsConfigurationController {

	@Autowired
	private Environment config;

	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsConfigs() {
		return new LimitConfiguration(config.getProperty("limit-service.maximum"),
				config.getProperty("limit-service.minimum"));
	}
}
