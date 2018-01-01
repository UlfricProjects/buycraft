package com.ulfric.buycraft.sco.model;

import java.math.BigDecimal;
import java.util.UUID;

import com.ulfric.buycraft.model.Cart;

public class StandardCheckoutChargeRequest extends StandardCheckoutRequest {

	private UUID purchaser;
	private Cart cart;
	private BigDecimal price;
	private String itemName;
	private String referrer;

	public UUID getPurchaser() {
		return purchaser;
	}

	public void setPurchaser(UUID purchaser) {
		this.purchaser = purchaser;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

}
