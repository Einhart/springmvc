package com.woniu.m_restful;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("users")
public class UserController {
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public User save(User user) {
		System.out.println("UserController.save()");
		return new User(1, "网民", 200d);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List findAll() {
		System.out.println("findAll...");
		List<User> list = new ArrayList<>();
		list.add(new User(1,"张无忌", 200d));
		list.add(new User(2,"张学友", 200d));
		list.add(new User(3,"张辽", 200d));
		return list;  
	}
	
	@RequestMapping(value = "{uid}", method = RequestMethod.GET)
	@ResponseBody
	public User findOne(@PathVariable int uid) {
		System.out.println("findAll..." + uid);
		return new User(1, "网民", 200d); 
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public User update(User user) {
		System.out.println("update...");
		return new User(1, "网民", 200d); 
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseBody
	public User delete() {
		System.out.println("delete...");
		return new User(1, "网民", 200d);  
	}
}
