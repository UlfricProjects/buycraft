package com.ulfric.buycraft.model;

import java.math.BigDecimal;
import java.util.List;

public class Order {

	private BigDecimal price;
	private List<Package> packages;

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<Package> getPackages() {
		return packages;
	}

	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}

}
