package com.woniu.c_default;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UserController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("嘻嘻嘻嘻----------");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("c");
		return mav;
	}

}
