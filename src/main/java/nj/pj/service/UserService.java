package nj.pj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import nj.pj.mapper.UserMapper;
import nj.pj.pojo.User;

public interface UserService {
	  

	//查询所有用户信息
	public  List<User>  getUserList();

}
