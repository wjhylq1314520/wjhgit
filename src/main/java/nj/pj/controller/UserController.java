package nj.pj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import nj.pj.pojo.User;
import nj.pj.service.UserService;

@Controller
public class UserController {
	
	//查询所有用户信息
	@Autowired
	private UserService userService;
	@RequestMapping("show")
	public  String    userList(Model model)
	{
		List<User> userList = userService.getUserList();
		
		model.addAttribute("userList",userList);
		
		return  "index";
	}

}
