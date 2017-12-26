/**
 * 
 */
package com.tuturself.java8validator.newvalidator;

import com.tuturself.java8validator.EmployeeValidatorTest;
import com.tuturself.java8validator.validators.EmployeeValidator;
import com.tuturself.java8validator.validators.newvalidator.Java8Validator;

/**
 * @author Dragon Warrior
 *
 */
public class Java8ValidatorTest extends EmployeeValidatorTest {

	
	@Override
	public EmployeeValidator getInstance() {
		return new Java8Validator();
	}

}
