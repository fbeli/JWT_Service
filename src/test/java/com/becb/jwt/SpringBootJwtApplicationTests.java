package com.becb.jwt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.test.context.junit4.SpringRunner;

import com.sun.xml.messaging.saaj.packaging.mime.util.BEncoderStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJwtApplicationTests {

	//@Test
	public void print() {
		System.out.println("Senhas: ");
		String password = "nadegas";				
		String encPassword = BCrypt.hashpw(password, BCrypt.gensalt(10));
		System.out.println(password);		
		System.out.println(encPassword);
		
		password = "password";				
		encPassword = BCrypt.hashpw(password, BCrypt.gensalt(10));
		System.out.println(password);		
		System.out.println(encPassword);
		
		password = "frederico";				
		encPassword = BCrypt.hashpw(password, BCrypt.gensalt(10));
		System.out.println(password);		
		System.out.println(encPassword);
	}
	
	@Test
	public void contextLoads() {
		
		String password = "pelado";				
		String encPassword = BCrypt.hashpw(password, BCrypt.gensalt());
		System.out.println(password);		
		System.out.println(encPassword);
		
		
		
		String defPass = "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6";
		
		System.out.println("");
		
		System.out.println("gerado :          "+encPassword);		
		System.out.println("pre definido :    "+defPass);
		
		
		System.out.println(BCrypt.checkpw(password, defPass)+" pass pré definido ");
		System.out.println(BCrypt.checkpw(password, encPassword) +" pass gerado ");
		System.out.println(BCrypt.checkpw(password, "casa31243dd32g12") +" pass Chutado - tem que ser false ");
		
		assertEquals(encPassword,defPass);
		
	}
	

	
	
	
	
	
	
	
	
	

}
