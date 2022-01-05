package com.example.products.commands.rest;

import java.math.BigDecimal;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateProductCommand {
	@TargetAggregateIdentifier
	private final String productId ;
	@NotBlank(message = "title required")
	private final String title;
	@Min(value = 25 , message = "min value is 25")
	private final BigDecimal price;
	@Min(value = 2 , message = "min value of quantity is 2")
	@Max(value = 100 , message = "max value of quantity is 100")
	private final Integer quantity;
}
