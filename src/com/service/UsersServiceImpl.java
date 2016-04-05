package com.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import entity.Users;
import sqlmappers.UsersMapper;



@Service
@Transactional
// @Transactional表示该类被Spring作为管理事务的类
public class UsersServiceImpl implements UsersService{

	   @Resource
	    private UsersMapper usersMapper;
	
	@Override
	public ArrayList<Users> searchUsers() {
		// TODO Auto-generated method stub
		 return usersMapper.searchUsers();
	}
	
	
	

}
