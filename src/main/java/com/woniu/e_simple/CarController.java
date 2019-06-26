package com.woniu.e_simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("car")
public class CarController {
	
	@RequestMapping("run")
	public ModelAndView run() {
		System.out.println("CarController.run()");
		return null;
	}
}
