package com.ulfric.buycraft.sco.model;

public class StandardCheckoutChargeResponse {

	private Boolean state = false;
	private Boolean requiresAuthorization;
	private StandardCheckoutChargeError error;

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
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
