package com.woniu.d_annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("save")
	public ModelAndView save() {
		System.out.println("UserController.save()");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("d");
		return mav;
	}
}
