package com.ulfric.buycraft.sco.model;

public class StandardCheckoutChargeResponse extends StandardCheckoutResponse {

	private StandardCheckoutChargeState state;

	public StandardCheckoutChargeState getState() {
		return state;
	}

	public void setState(StandardCheckoutChargeState state) {
		this.state = state;
	}

}
