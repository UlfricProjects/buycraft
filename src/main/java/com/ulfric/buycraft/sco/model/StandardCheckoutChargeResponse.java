package com.ulfric.buycraft.sco.model;

public class StandardCheckoutChargeResponse {

	private boolean state = false;
	private Boolean requiresAuthorization;
	private StandardCheckoutChargeError error;

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

	public StandardCheckoutChargeError getError() {
		return error;
	}

	public void setError(StandardCheckoutChargeError error) {
		this.error = error;
	}

}
