package com.ulfric.buycraft.model;

import java.math.BigDecimal;

public class Package extends StoreElement {

	private BigDecimal price;
	private Sale sale;

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

}