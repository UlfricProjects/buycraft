package com.ulfric.buycraft.model;

import java.util.List;

public class Cart {

	private List<Item> items;
	private String username;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
