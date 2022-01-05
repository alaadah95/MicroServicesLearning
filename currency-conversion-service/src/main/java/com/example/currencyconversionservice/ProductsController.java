//package com.example.currencyconversionservice;
//
//import java.math.BigDecimal;
//import java.util.UUID;
//
//import org.axonframework.commandhandling.gateway.CommandGateway;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.currencyconversionservice.commands.CreateProductCommand;
//
//@RestController
//@RequestMapping("/products")
//public class ProductsController {
//
//	
//	@Autowired
//	private CommandGateway commandGateway ;
//	@Autowired
//	private Environment env ;
//	
//	@PostMapping()
//	public String createProduct(@RequestBody CreateProductModel request)   {
//		CreateProductCommand command = CreateProductCommand.builder().price(new BigDecimal(25)).quantity(25)
//				.title("Product => " + System.currentTimeMillis()).productId(UUID.randomUUID().toString()).build();
//		commandGateway.sendAndWait(command);
//		return request.getTitle();
//	}
//}
