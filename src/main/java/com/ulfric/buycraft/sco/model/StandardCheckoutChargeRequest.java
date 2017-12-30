package com.ulfric.buycraft.sco.model;

import java.util.UUID;

import com.ulfric.buycraft.model.Cart;

public class StandardCheckoutChargeRequest extends StandardCheckoutRequest {

	private UUID purchaser;
	private Cart cart;
	private String itemName;

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

}
