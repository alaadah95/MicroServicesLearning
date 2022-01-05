//package com.example.currencyconversionservice.commands;
//
//import java.math.BigDecimal;
//
//import org.axonframework.commandhandling.CommandHandler;
//import org.axonframework.eventsourcing.EventSourcingHandler;
//import org.axonframework.modelling.command.AggregateIdentifier;
//import org.axonframework.modelling.command.AggregateLifecycle;
//import org.axonframework.spring.stereotype.Aggregate;
//import org.springframework.beans.BeanUtils;
//
//import com.example.currencyconversionservice.events.ProductCreatedEvent;
//
//@Aggregate
//public class ProductAggregate {
//	
//	@AggregateIdentifier
//	private String productId;
//	private String title;
//	private BigDecimal price;
//	private Integer quantity;
//	
//	public  ProductAggregate(){
//		
//	}
//	
//	@CommandHandler
//	public  ProductAggregate(CreateProductCommand productCommand){
//		if(productCommand.getPrice().compareTo(BigDecimal.ZERO) <= 0)
//			throw new IllegalArgumentException("price can not be less or equal than zero .");
//		
//		if(productCommand.getTitle() == null || productCommand.getTitle().isBlank())
//			throw new IllegalArgumentException("title is blank .");
//		
//		
//		ProductCreatedEvent event = new ProductCreatedEvent();
//		BeanUtils.copyProperties(productCommand, event);
//		
//		AggregateLifecycle.apply(event);
//		
//	}
//	
//	@EventSourcingHandler
//	public void on(ProductCreatedEvent productEvent) {
//		this.productId = productEvent.getProductId();
//		this.title = productEvent.getTitle();
//		this.price = productEvent.getPrice();
//		this.quantity = productEvent.getQuantity();
//	} 
//}
