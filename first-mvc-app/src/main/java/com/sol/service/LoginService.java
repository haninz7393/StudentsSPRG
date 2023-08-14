package com.sol.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUserLogin(String username, String password) {
		if (username.equalsIgnoreCase("Sol") && password.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}

}
