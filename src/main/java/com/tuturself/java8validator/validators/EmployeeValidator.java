/**
 * 
 */
package com.tuturself.java8validator.validators;

import com.tuturself.java8validator.exception.EmployeeException;
import com.tuturself.java8validator.model.Employee;

/**
 * @author Dragon Warrior
 *
 */
public interface EmployeeValidator {
  public void validate(Employee employee) throws EmployeeException;
}
