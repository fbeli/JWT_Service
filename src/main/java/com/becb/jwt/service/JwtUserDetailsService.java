package com.becb.jwt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.becb.jwt.model.User;
import com.becb.jwt.model.UserDTO;
import com.becb.jwt.model.UserDao;

//import com.javainuse.dao.UserDao;
//import com.javainuse.model.DAOUser;
//import com.javainuse.model.UserDTO;


@Service
public class JwtUserDetailsService implements UserDetailsService {

	/*
	 * @Autowired private UserDao userDao;
	 */

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("javainuse".equals(username)) {
			UserDetails user =		
			 new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
					new ArrayList<>());
			
			
			return user;
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

	
	  public UserDao save(UserDTO user) { 
		 // DAOUser newUser = new DAOUser();
		  //newUser.setUsername(user.getUsername());
		  //userDao.save(newUser);
		  return null;
	  }
	 

}
