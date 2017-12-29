package com.ulfric.buycraft.model;

public class StoreElement extends BuycraftIdentifiable {

	private String name;
	private Integer order;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

}