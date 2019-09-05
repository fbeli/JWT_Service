package com.becb.jwt.service;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

/**
 * encriptar senha para utilização do JWF
 * @author fpsousa
 *
 */
@Service
public class EncryptService {

	
	public String getEncryptedPassword(String password) {		
		return BCrypt.hashpw(password, BCrypt.gensalt());
	}
	
}
