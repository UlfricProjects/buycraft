package com.ulfric.buycraft.sco.model;

import java.time.Instant;

public class ResetToken {

	private String code;
	private Instant created;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
	}

}
