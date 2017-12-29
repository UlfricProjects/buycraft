package com.ulfric.buycraft.model;

import java.util.List;
import java.util.UUID;

public class Cart {

	private List<Item> items;
	private UUID purchaser;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public UUID getPurchaser() {
		return purchaser;
	}

	public void setPurchaser(UUID purchaser) {
		this.purchaser = purchaser;
	}

}
