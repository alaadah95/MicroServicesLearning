package com.example.currencyconversionservice;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CreateProductModel {
	private String title;
	private BigDecimal price;
	private Integer quantity;
	
	
}
