package com.example.products.query.rest;

import java.util.List;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.products.query.FindProductsQuery;

@RestController
@RequestMapping("/products")
public class ProductQueryController {

	@Autowired
	public QueryGateway queryGateway;

	@GetMapping
	public List<ProductRestModel> productsRest() {
		FindProductsQuery findproduct = new FindProductsQuery();

		List<ProductRestModel> products = queryGateway
				.query(findproduct, ResponseTypes.multipleInstancesOf(ProductRestModel.class)).join();
		
		return products;
	}

}
