package com.woniu.k_exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyExceptionHandler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		System.out.println("MyExceptionHandler.resolveException()");
		if (ex instanceof ArithmeticException) {
			return new ModelAndView("k_error3");
		} else if (ex instanceof NullPointerException) {
			return new ModelAndView("k_error2");
		} else {
			return new ModelAndView("k_error");
		}
	}

}
