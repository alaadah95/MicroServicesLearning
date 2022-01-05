package com.example.products.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class ProductEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6743739000034198605L;
	@Id
	private String productId;
	private String title;
	private BigDecimal price;
	private Integer quantity;
}
