package com.test;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.UsersService;

import entity.Users;


@Controller
public class Mycontro {

	   @Resource
	    private UsersService usersService;
	
	
	 @RequestMapping("/")    
	    public String index(){    
	    System.out.println("----------------hello---------------------");	    
//	    ArrayList<Users> user=usersService.searchUsers();
//        if(user.size()> 0){
//        	 System.out.println("-------------Mybatis鏌ヨ鎴愬姛锛�----------------"+user.get(user.size()-1).getName());
//        }
	        return "hello";    
	    }
}
