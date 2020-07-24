package com.Biditvats.spring.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.Biditvats.spring.bean.User;

@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmpty(errors, "userName", "userName.required");
		ValidationUtils.rejectIfEmpty(errors, "gender", "gender.required");
		ValidationUtils.rejectIfEmpty(errors, "password", "password.required");
		ValidationUtils.rejectIfEmpty(errors, "address", "address.required");
	
		User user = (User) target;
		if(user.getHobbies().length == 0)
			errors.rejectValue("hobbies", "hobbies.required");
		if(user.getSkills().length ==0)
			errors.rejectValue("skills", "skills.required");
	}

}
