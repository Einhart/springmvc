package com.woniu.l_validation;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping("save")
	public String save(Model model,@Validated(B.class) User user, Errors errors) {
		System.out.println(user.getUname());
		if (errors.hasErrors()) {
			List<FieldError> fieldErrors = errors.getFieldErrors();
			for (FieldError fieldError : fieldErrors) {
				model.addAttribute(fieldError.getField()+"Error", fieldError.getDefaultMessage());
			}
			return "l";
		} else {
			return "l_success";
		}
	}
}
