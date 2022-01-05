package com.example.currencyconversionservice;

public class CurrencyConversionBean {
	private Long id;
	private String from;
	private String to;
	private String port;
	private Double conversionMultiple;
	private Double quantity;
	private Double totalCalculatedAmount;

	public CurrencyConversionBean() {
	}

	public CurrencyConversionBean(Long id, String from, String to, Double conversionMultiple,
			Double quantity, Double totalCalculatedAmount) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

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

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Double getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(Double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(Double totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

}
