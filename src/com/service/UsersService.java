package com.service;

import java.util.ArrayList;

import entity.Users;

public interface UsersService {
	
	/**
	     * 查询用户信息(后台)
	     * @return List<Users>
	     */
  public ArrayList<Users> searchUsers();
  
  

}
