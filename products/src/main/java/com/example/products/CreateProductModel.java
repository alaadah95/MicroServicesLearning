package com.example.products;

import java.math.BigDecimal;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class CreateProductModel {
	@NotBlank(message = "title required")
	private String title;
	@Min(value = 25, message = "min value is 25")
	private BigDecimal price;
	@Min(value = 2, message = "min value of quantity is 2")
	@Max(value = 100, message = "max value of quantity is 100")
	private Integer quantity;

}
