/**
 * 
 */
package com.tuturself.java8validator.oldvalidator;

import com.tuturself.java8validator.EmployeeValidatorTest;
import com.tuturself.java8validator.validators.EmployeeValidator;
import com.tuturself.java8validator.validators.oldvalidator.OldValidator;

/**
 * @author Dragon Warrior
 *
 */
public class OldValidatorTest extends EmployeeValidatorTest {

	@Override
	public EmployeeValidator getInstance() {
		return new OldValidator();
	}

}
