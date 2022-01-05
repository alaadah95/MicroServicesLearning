package com.example.products.query;

import java.util.List;
import java.util.stream.Collectors;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.products.query.rest.ProductRestModel;
import com.example.products.respository.ProductRepo;

@Component
public class productQueryHandler {
	@Autowired
	private ProductRepo productRepo;

	@QueryHandler
	public List<ProductRestModel> findProducts(FindProductsQuery query) {
		return productRepo.findAll().stream().map(entity -> {
			ProductRestModel res = new ProductRestModel();
			BeanUtils.copyProperties(entity, res);
			return res;
		}).collect(Collectors.toList());
	}
}
