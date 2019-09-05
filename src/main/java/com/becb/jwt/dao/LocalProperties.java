package com.becb.jwt.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LocalProperties {

	
	public static Properties getProp()  {
        Properties props = new Properties();
       
        
        try{
           	FileInputStream file = new FileInputStream("src\\main\\resources\\usuarios.properties");
        	props.load(file);
        }
        catch (IOException e) {
			e.printStackTrace();
			return null;
		}
      
        return props;
 
    }
	
}
