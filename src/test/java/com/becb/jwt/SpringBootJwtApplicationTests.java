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

	@Test
	public void contextLoads() {
		
		String password = "password";
				
		String encPassword = BCrypt.hashpw(password, BCrypt.gensalt());
		
		String defPass = "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6";
		
		System.out.println("");
		
		System.out.println(encPassword);		
		System.out.println(defPass);
		
		
		System.out.println(BCrypt.checkpw(password, defPass)+" pass definido ");
		System.out.println(BCrypt.checkpw(password, encPassword) +" pass gerado ");
		System.out.println(BCrypt.checkpw(password, "casa31243dd32g12") +" pass Chutado - tem que ser false ");
		
		assertEquals(encPassword,defPass);
		
		
		
	}

}
