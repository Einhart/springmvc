package com.woniu.g_httpmessageconverter.b;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("f1")
	public void f1(HttpServletRequest request, HttpServletResponse response) {
		String accept = request.getHeader("Accept");
		System.out.println(accept);
	}
	
	@RequestMapping("f2")
	public void f2(@RequestBody String str) {
		System.out.println(str);
	}
	
	@RequestMapping("f3")
	public void f3(@RequestBody User user) {
		System.out.println(user);
	}
	
	@RequestMapping("f4")
	@ResponseBody	//该注解的作用用来使返回的逻辑视图失效，当然如果直接返回ModelAndView那就不起作用
	public String f4() {
		return "g";
	}
	
	//Accept : string/s --> My  String
	//supports : user --> my
	//my : write
	@RequestMapping("f5")
	@ResponseBody
	public User f5() {
		User user = new User();
		user.setUid(11);
		user.setUname("张三");
		user.setBirthday(new Date());
		return user;
	}
}
