package com.ulfric.buycraft.sco.model;

public class StandardCheckoutRequest {

	private String buycraftToken;
	private String scoToken;
	private String webstoreId;

	public String getBuycraftToken() {
		return buycraftToken;
	}

	public void setBuycraftToken(String buycraftToken) {
		this.buycraftToken = buycraftToken;
	}

	public String getScoToken() {
		return scoToken;
	}

	public void setScoToken(String scoToken) {
		this.scoToken = scoToken;
	}

	public String getWebstoreId() {
		return webstoreId;
	}

	public void setWebstoreId(String webstoreId) {
		this.webstoreId = webstoreId;
	}

}
