package com.woniu.f_parameter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("f1")
	public ModelAndView f1(byte b, short s, int i, long l, float f, double d, char c, boolean bl) {
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bl);
		return null;
	}
	
	@RequestMapping("f2")
	public ModelAndView f2(String username, String password) {
		System.out.println(username);
		System.out.println(password);
		return null;
	}
	
	@RequestMapping("f3")
	public ModelAndView f3(User user) {
		System.out.println(user);
		return null;
	}
	
	@RequestMapping("f4")
	public ModelAndView f3(@RequestParam List<String> hobby) {
		System.out.println(hobby);
		return null;
	}
	
	@RequestMapping("f5")
	public ModelAndView f3(@RequestParam Set<String> hobby) {
		System.out.println(hobby);
		return null;
	}
	
	@RequestMapping("f6")
	public ModelAndView f3(@RequestParam Map<String, String> map) {
		System.out.println(map);
		System.out.println(map.getClass());
		return null;
	}
	
	@RequestMapping("f7")
	public ModelAndView f3(String[] strs) {
		System.out.println(Arrays.toString(strs));
		return null;
	}
}
