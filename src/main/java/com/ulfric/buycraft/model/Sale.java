package com.ulfric.buycraft.model;

import java.math.BigDecimal;

public class Sale {

	private Boolean active;
	private BigDecimal discount;

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

}