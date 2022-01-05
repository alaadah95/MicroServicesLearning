package com.example.currencyexchangeservice;

public class LimitConfiguration {

	private String maximum;
	private String minimum;

	public LimitConfiguration() {
	}

	public LimitConfiguration(String maximum, String minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public String getMaximum() {
		return maximum;
	}

	public void setMaximum(String maximum) {
		this.maximum = maximum;
	}

	public String getMinimum() {
		return minimum;
	}

	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}
}
