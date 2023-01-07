package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masai.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class UserController {
	
	@Autowired
	public UserService uservice;
	
	@PostMapping("/user")
	public ResponseEntity<User> RegisterUser(@RequestBody User user) throws UserException{
		
		User Ruser=uservice.RegisterUSer(user);
		
		return new ResponseEntity<User>(Ruser,HttpStatus.ACCEPTED);
		
		
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> Getalluser() throws UserException{
		
		List<User> luser=uservice.GetAlluser();
		return new ResponseEntity<List<User>>(luser,HttpStatus.OK);
		
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> GetUserbyid(@PathVariable Integer id) throws UserException{
		User user=uservice.findbyId(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> delatebyId(@PathVariable Integer id) throws UserException{
		
		String s=uservice.delateById(id);
		return new  ResponseEntity<String>(s,HttpStatus.OK);
		
	}
	
	@GetMapping("/user/{id}/mail/{id}")
	public ResponseEntity<Email> getEmail(@PathVariable Integer uid,@PathVariable Integer eid) throws UserException{
		
		Email email=uservice.getMaildetails(uid, eid);
		return new ResponseEntity<Email>(email,HttpStatus.OK);
		
	}
	

}
