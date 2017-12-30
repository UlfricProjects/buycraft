package com.ulfric.buycraft.model;

import java.util.Map;

public class ManualPaymentItem extends BuycraftIdentifiable {

	private Map<String, String> options;

	public Map<String, String> getOptions() {
		return options;
	}

	public void setOptions(Map<String, String> options) {
		this.options = options;
	}

}
