package com.dharani.security;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import com.dharani.entity.User;
import com.dharani.spring.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	 @Autowired
	 private WebApplicationContext applicationContext;
	 private UserRepository userRepository;
	 
	  public UserDetailsServiceImpl() {
		super();
	}
	 
	   @PostConstruct
	    public void completeSetup() {
	        userRepository = applicationContext.getBean(UserRepository.class);
	    }
	  
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		 User user = userRepository.findByUsername(username);
	        if (user == null) {
	            throw new UsernameNotFoundException(username);
	        }
		
		return new UserPrinicipal(user);
	}

}
