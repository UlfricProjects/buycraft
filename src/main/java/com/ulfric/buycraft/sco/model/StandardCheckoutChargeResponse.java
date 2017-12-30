package com.ulfric.buycraft.sco.model;

public class StandardCheckoutChargeResponse extends StandardCheckoutResponse {

	private boolean state = false;
	private Boolean requiresAuthorization;

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public Boolean getRequiresAuthorization() {
		return requiresAuthorization;
	}

	public void setRequiresAuthorization(Boolean requiresAuthorization) {
		this.requiresAuthorization = requiresAuthorization;
	}

}
