package com.sol.validation;

import org.springframework.stereotype.Service;

@Service
public class CustomValidator {
	
	//example method
	public boolean checkNameLength(String name) {
		if(name.length() > 2 && name.length() < 120) {
			return true;
		} else {
			return false;
		}
	}

}
