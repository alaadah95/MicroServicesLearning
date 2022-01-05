package com.example.products.query;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.products.entities.ProductEntity;
import com.example.products.events.ProductCreatedEvent;
import com.example.products.respository.ProductRepo;

@Component
public class ProductEventHandler {
	
	private final ProductRepo productRepo ;
	
	
	
	public ProductEventHandler(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}



	@EventHandler
	public void on (ProductCreatedEvent event) {
		ProductEntity productEntity = new ProductEntity();
		BeanUtils.copyProperties(event, productEntity);
		productRepo.save(productEntity);
	}
	
}
