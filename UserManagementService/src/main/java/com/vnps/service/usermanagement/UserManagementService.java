package com.vnps.service.usermanagement;

import com.vnps.domain.usermanagement.User;

public interface UserManagementService {

	public void authenticate(String userName,String password) throws UserManagementException;
	
	public void signUp(User user) throws UserManagementException;
	
	public void update(User user) throws UserManagementException;
	
	public void delete(User user) throws UserManagementException;
	
	public void getDetail(String userId) throws UserManagementException;
	
	public void resetPassword(String emailAddress) throws UserManagementException;
}
