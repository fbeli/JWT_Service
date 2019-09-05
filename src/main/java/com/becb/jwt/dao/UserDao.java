package com.becb.jwt.dao;

import java.util.ArrayList;
import java.util.Properties;

import org.springframework.stereotype.Repository;

import com.becb.jwt.model.User;
import com.becb.jwt.dao.LocalProperties;

@Repository
public class UserDao {

	
	public User getUser(String username) {
		
		Properties prop = LocalProperties.getProp();
		if (null == prop)
			return null;
		
		
		return new User(username, prop.get(username).toString(), new ArrayList<>() );
	}
}
