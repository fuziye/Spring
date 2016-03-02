package com.bjsxt.service;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;



public class UserService {
	
	private UserDAO userDAO;  
	

	public void add(User user) {
		userDAO.save(user);
		
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	
	@Resource(name = "u")
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
