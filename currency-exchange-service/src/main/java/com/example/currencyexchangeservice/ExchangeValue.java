package com.example.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXCHANGE_VALUE")
public class ExchangeValue {
	@Id
	private Long id;
	@Column(name = "from_c")
	private String from;
	@Column(name = "to_c")
	private String to;
	@Column
	private Double conversionMultiple;
	@Column
	private int port;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Double getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(Double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public ExchangeValue() {
		super();
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ExchangeValue(Long id, String from, String to, Double conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

}
