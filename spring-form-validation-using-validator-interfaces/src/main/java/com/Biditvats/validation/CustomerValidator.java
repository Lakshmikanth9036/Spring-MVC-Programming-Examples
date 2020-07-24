package com.Biditvats.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.Biditvats.domain.Customer;

public class CustomerValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Customer.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmpty(errors, "firstName", "InvalidFirstName");
		ValidationUtils.rejectIfEmpty(errors, "lastName", "InvalidLastName");
		ValidationUtils.rejectIfEmpty(errors, "email", "InvalidEmail");
		ValidationUtils.rejectIfEmpty(errors, "gender", "InvalidGender");
		ValidationUtils.rejectIfEmpty(errors, "password", "InvalidPassword");
		
		Customer customer = (Customer) target;
		if(customer.getMobile() < 1)
			errors.rejectValue("mobile", "InvalidMobile");
		
	}

}
