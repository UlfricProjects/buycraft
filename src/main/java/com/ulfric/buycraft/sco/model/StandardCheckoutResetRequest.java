package com.ulfric.buycraft.sco.model;

import java.util.UUID;

public class StandardCheckoutResetRequest extends StandardCheckoutRequest {

	private UUID mojangId;
	private ResetToken token;

	public UUID getMojangId() {
		return mojangId;
	}

	public void setMojangId(UUID mojangId) {
		this.mojangId = mojangId;
	}

	public ResetToken getToken() {
		return token;
	}

	public void setToken(ResetToken token) {
		this.token = token;
	}

}
