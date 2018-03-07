/**
 * 
 */
package com.tuturself.java8validator.validators.oldvalidator;

import com.tuturself.java8validator.exception.EmployeeException;
import com.tuturself.java8validator.model.Employee;
import com.tuturself.java8validator.validators.EmployeeValidator;

/**
 * @author Dragon Warrior
 *
 */
public class OldValidator implements EmployeeValidator {

  public void validate(Employee employee) throws EmployeeException {
    if (employee.getFirstName() == null || employee.getFirstName().isEmpty())
      throw new EmployeeException("Please specify valid firstname");
    if (employee.getFirstName().length() < 2)
      throw new EmployeeException("Please specify valid firstname");
    if (employee.getFirstName().length() > 100)
      throw new EmployeeException("Please specify valid firstname");

    if (employee.getLastName() == null || employee.getLastName().isEmpty())
      throw new EmployeeException("Please specify valid lastname");
    if (employee.getLastName().length() < 2)
      throw new EmployeeException("Please specify valid lastname");
    if (employee.getLastName().length() > 100)
      throw new EmployeeException("Please specify valid lastname");

    if (employee.getEmail() == null || employee.getEmail().isEmpty())
      throw new EmployeeException("Please specify valid email");
    if (employee.getEmail().length() < 3)
      throw new EmployeeException("Please specify valid email");
    if (employee.getEmail().length() > 100)
      throw new EmployeeException("Please specify valid email");

    if (employee.getAge() == null || employee.getAge() == 0)
      throw new EmployeeException("Please specify valid age");
    if (employee.getAge() < 18)
      throw new EmployeeException("Please specify valid age");
    if (employee.getAge() > 60)
      throw new EmployeeException("Please specify valid age");
  }

}
