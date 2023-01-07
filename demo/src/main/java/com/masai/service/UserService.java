package com.masai.service;


import java.util.List;

import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;


public interface UserService {
	
	public User RegisterUSer(User user)throws UserException;
	
	public List<User> GetAlluser()throws UserException;
	
	public User findbyId(Integer id)throws UserException;
	
	public String delateById(Integer id)throws UserException;
	
	public Email getMaildetails(Integer userid,Integer mailid)throws UserException;


}
