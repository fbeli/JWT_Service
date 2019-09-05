package com.becb.jwt.trafic;

import java.io.Serializable;

public class CreatePasswordResponse implements Serializable {

	private String passwordEncrypted;

	public CreatePasswordResponse(String password) {
		this.passwordEncrypted = password;
	}
	public String getPasswordEncrypted() {
		return passwordEncrypted;
	}

	public void setPasswordEncrypted(String passwordEncrypted) {
		this.passwordEncrypted = passwordEncrypted;
	}
	
	
	
	
	
}
