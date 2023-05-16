package com.benze.securitydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.benze.securitydemo.model.UserEntity;
import com.benze.securitydemo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	public String register(UserEntity user) {
		
		if(userRepository.existsByEmail(user.getEmail())) {
			return "User already exists";
		}
		
		user.setPassword(passwordEncoder.encode((user.getPassword())));
		userRepository.save(user);
		return "Register successfully";
	}
	

}
