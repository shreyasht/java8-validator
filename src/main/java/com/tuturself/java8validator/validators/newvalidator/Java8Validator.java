/**
 * 
 */
package com.tuturself.java8validator.validators.newvalidator;

import com.tuturself.java8validator.exception.EmployeeException;
import com.tuturself.java8validator.model.Employee;
import com.tuturself.java8validator.validators.EmployeeValidator;
import com.tuturself.java8validator.validators.genericvalidator.ValidatorUtil;

/**
 * @author Dragon Warrior
 *
 */
public class Java8Validator implements EmployeeValidator {

	@Override
	public void validate(Employee employee) throws EmployeeException {
		StringBuilder errorFields = new StringBuilder();

		errorFields.append(ValidatorUtil.notNullString.and(ValidatorUtil.notEmptyString).and(ValidatorUtil.stringBetween(1, 100)).test(employee.getFirstName()).getFieldNameIfInvalid(" Please specify valid firstname ").orElse(""));
		
		errorFields.append(ValidatorUtil.notNullString.and(ValidatorUtil.notEmptyString).and(ValidatorUtil.stringBetween(1, 100)).test(employee.getLastName()).getFieldNameIfInvalid(" Please specify valid lastname ").orElse(""));
		
		errorFields.append(ValidatorUtil.notNullString.and(ValidatorUtil.notEmptyString).and(ValidatorUtil.stringBetween(3, 100)).test(employee.getEmail()).getFieldNameIfInvalid(" Please specify valid email ").orElse(""));
		
		errorFields.append(ValidatorUtil.notNullInteger.and(ValidatorUtil.greaterThanZero).and(ValidatorUtil.integerBetween(18, 60)).test(employee.getAge()).getFieldNameIfInvalid(" Please specify valid age ").orElse(""));
		
		String errors = errorFields.toString();
		if (!errors.isEmpty()) {
			throw new EmployeeException(errors);
		}

	}

}
