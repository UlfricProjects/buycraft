package com.ulfric.buycraft.model;

import java.util.List;

public class Category extends StoreElement {

	private List<Category> subcategories;
	private List<Package> packages;

	public List<Category> getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(List<Category> subcategories) {
		this.subcategories = subcategories;
	}

	public List<Package> getPackages() {
		return packages;
	}

	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}

}