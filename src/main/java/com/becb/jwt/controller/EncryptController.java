package com.becb.jwt.controller;


import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.becb.jwt.service.EncryptService;
import com.becb.jwt.trafic.CreatePasswordRequest;
import com.becb.jwt.trafic.CreatePasswordResponse;

@RestController
public class EncryptController {

	@Autowired
	EncryptService encryptedService;
	
	 //private static final Logger LOGGER=LoggerFactory.getLogger(EncryptController.class);
	private static Logger LOGGER = LogManager.getLogger(EncryptController.class);
	
	@RequestMapping({ "/encriptPassword" })
	public  ResponseEntity<?>  firstPage(@RequestBody CreatePasswordRequest request) {
		String retorno = encryptedService.getEncryptedPassword(request.getPassword());
		
	
		
		LOGGER.debug("Debugging "+retorno);
		LOGGER.info("Info "+retorno);
		LOGGER.warn("Warning "+retorno);
		LOGGER.error("Error  "+retorno);
		LOGGER.trace("Damn!  "+retorno);
	    
		return ResponseEntity.ok(new CreatePasswordResponse(retorno));
		
	}	
	
}
