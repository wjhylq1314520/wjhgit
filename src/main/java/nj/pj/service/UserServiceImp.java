package nj.pj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nj.pj.mapper.UserMapper;
import nj.pj.pojo.User;
@Service
public class UserServiceImp implements UserService {
	//查询所有用户信息
	@Autowired
	private UserMapper  userMapper;
	public List<User> getUserList() {
		
		return userMapper.getUserList();
	}

}
