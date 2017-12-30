package com.ulfric.buycraft.sco.model;

import java.util.UUID;

import com.ulfric.buycraft.model.Cart;

public class StandardCheckoutChargeRequest {

	private String buycraftToken;
	private String scoToken;
	private String webstoreId;
	private UUID purchaser;
	private Cart cart;
	private String itemName;

	public String getBuycraftToken() {
		return buycraftToken;
	}

	public void setBuycraftToken(String buycraftToken) {
		this.buycraftToken = buycraftToken;
	}

	public String getScoToken() {
		return scoToken;
	}

	public void setScoToken(String scoToken) {
		this.scoToken = scoToken;
	}

	public String getWebstoreId() {
		return webstoreId;
	}

	public void setWebstoreId(String webstoreId) {
		this.webstoreId = webstoreId;
	}

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
