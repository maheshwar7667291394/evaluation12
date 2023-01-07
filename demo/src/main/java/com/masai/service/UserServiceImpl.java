package com.masai.service;



import java.net.UnknownServiceException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masai.repo.EmailDao;
import com.masai.repo.UserDao;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	public UserDao udao;
	
	@Autowired
	public EmailDao edao;

	@Override
	public User RegisterUSer(User user)throws UserException {
		
		Email emails=user.getEmail();
			emails.setUser(user);
		
		String em1=emails.getEmail();
		
	User Ruser=udao.findByemail(em1);
		if(Ruser!=null) {
			throw new UserException("User Already present by thid mainl");
		}
		return udao.save(user);
	}

	@Override
	public List<User> GetAlluser() throws UserException {
		
		List<User> luser=udao.findAll();
		if(luser.size()==0)throw new UserException("no any user found");
	
		return luser;
	}

	@Override
	public User findbyId(Integer id) throws UserException {
		Optional<User> user=udao.findById(id);
		User user1=user.get();
		if(user1==null) throw new UserException("User not found");
		return user1;
	}

	@Override
	public String delateById(Integer id) throws UserException {
		
		Optional<User> user=udao.findById(id);
		if(user.isEmpty()) throw new UserException("user not found");
		
		udao.deleteById(id);
		return "delation sussfull";
	}

	@Override
	public Email getMaildetails(Integer userid, Integer mailid) throws UserException {
		
		Optional<User> user=udao.findById(userid);
		if(user.isEmpty()) throw new  UserException("user not found");
		
		Optional<Email> email=Optional.of(edao.getById(mailid));
		if(email.isEmpty()) throw new UserException("User not found");
		
		return email.get();
	}

	

}
