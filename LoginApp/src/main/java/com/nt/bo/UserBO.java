package com.nt.bo;

import org.springframework.jdbc.core.RowMapper;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserBO {
	private String userName;
	private String password;
	
	public UserBO() {
		System.out.println("UserBO:: 0-param constructor");
	}

	public int[] getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	public RowMapper getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
