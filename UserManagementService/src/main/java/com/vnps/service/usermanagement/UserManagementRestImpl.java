package com.vnps.service.usermanagement;

import org.springframework.web.bind.annotation.RestController;

import com.vnps.domain.usermanagement.User;

@RestController
public class UserManagementRestImpl implements UserManagementService {

	public UserManagementRestImpl() {
		// TODO Auto-generated constructor stub
	}

	public void authenticate(String userName, String password) throws UserManagementException {
		// TODO Auto-generated method stub

	}

	public void signUp(User user) throws UserManagementException {
		// TODO Auto-generated method stub
		
	}

	public void update(User user) throws UserManagementException {
		// TODO Auto-generated method stub
		
	}

	public void delete(User user) throws UserManagementException {
		// TODO Auto-generated method stub
		
	}

	public void getDetail(String userId) throws UserManagementException {
		// TODO Auto-generated method stub
		
	}

	public void resetPassword(String emailAddress) throws UserManagementException {
		// TODO Auto-generated method stub
		
	}
}
