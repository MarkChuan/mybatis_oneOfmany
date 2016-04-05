package sqlmappers;

import java.util.ArrayList;

import entity.Users;

public interface  UsersMapper {

	
	
	/**
     * 查询用户信息(后台)
     *
     * @return ArrayList<Users>
     */
    public ArrayList<Users> searchUsers();
    
}
