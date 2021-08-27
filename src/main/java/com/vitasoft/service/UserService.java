package com.vitasoft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitasoft.model.UserDetails;
import com.vitasoft.repository.UserRepository;

@Service
public class UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	public List<UserDetails> findAll() {
        return userRepository.findAll();
    }
	
	public Optional<UserDetails> findById(int id) {
        return userRepository.findById(id);
    }
	
	
	
	 public UserDetails saveContact(UserDetails details) {
	        return userRepository.save(details);
	 }
	
    public UserDetails updateContact(int id, UserDetails details) {
    	UserDetails updateUser = userRepository.findById(id).orElse(null);
        	updateUser.setFirstName(details.getFirstName());
        	updateUser.setMiddleName(details.getMiddleName());
        	updateUser.setLastName(details.getMiddleName());
        	updateUser.setAddress(details.getAddress());
        	updateUser.setCountry(details.getCountry());
        	updateUser.setState(details.getState());
        	updateUser.setZipcode(details.getZipcode());
        	updateUser.setEmail(details.getEmail());
        	updateUser.setPhoneNumber(details.getPhoneNumber());
        	updateUser.setUserName(details.getUserName());
        	updateUser.setPassWord(details.getPassWord());
        return userRepository.save(updateUser);
    }
    
    
    
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }
}
