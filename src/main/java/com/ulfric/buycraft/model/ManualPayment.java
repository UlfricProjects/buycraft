package com.ulfric.buycraft.model;

import java.math.BigDecimal;
import java.util.List;

public class ManualPayment {

	private String ign;
	private BigDecimal price;
	private List<ManualPaymentItem> packages;

	public String getIgn() {
		return ign;
	}

	public void setIgn(String ign) {
		this.ign = ign;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<ManualPaymentItem> getPackages() {
		return packages;
	}

	public void setPackages(List<ManualPaymentItem> packages) {
		this.packages = packages;
	}

}