package com.woniu.b_replace;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UserController2 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("哈哈");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("a");//逻辑视图名
		mav.addObject("msg", "曹操");
		return mav;
	}

}
