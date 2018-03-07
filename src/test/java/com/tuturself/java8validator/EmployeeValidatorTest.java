package com.tuturself.java8validator;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.tuturself.java8validator.exception.EmployeeException;
import com.tuturself.java8validator.model.Employee;
import com.tuturself.java8validator.validators.EmployeeValidator;

/**
 * @author Dragon Warrior
 *
 */
public abstract class EmployeeValidatorTest {

  public abstract EmployeeValidator getInstance();

  @Test
  public void employee_isComplete_validationSucceed() {
    try {
      getInstance().validate(new Employee("ABCD", "XYZS", "jon@abc.mail", 37));
    } catch (EmployeeException e) {
      fail("Should have been valid and therefore not thrown an exception");
    }
  }

  @Test
  public void employee_withoutFirstName_validationFail() {
    try {
      getInstance().validate(new Employee(null, "XYZS", "jon@abc.mail", 37));
      fail("Should have had EmployeeException containing 'valid firstname'");
    } catch (EmployeeException e) {
      assertTrue(e.getMessage().contains("valid firstname"));
    }
  }

  @Test
  public void employee_shortFirstName_validationFail() {
    try {
      getInstance().validate(new Employee("A", "XYZS", "jon@abc.mail", 37));
      fail("Should have had EmployeeException containing 'valid firstname'");
    } catch (EmployeeException e) {
      assertTrue(e.getMessage().contains("valid firstname"));
    }
  }

  @Test
  public void employee_wrongEmail_validationFail() {
    try {
      getInstance().validate(new Employee("ABCD", "XYZS", "1", 37));
      fail("Should have had EmployeeException containing 'valid email'");
    } catch (EmployeeException e) {
      assertTrue(e.getMessage().contains("valid email"));
    }
  }

  @Test
  public void employee_underAge_validationFail() {
    try {
      getInstance().validate(new Employee("ABCD", "XYZS", "jon", 16));
      fail("Should have had EmployeeException containing 'valid age'");
    } catch (EmployeeException e) {
      assertTrue(e.getMessage().contains("valid age"));
    }
  }

  @Test
  public void employee_overAge_validationFail() {
    try {
      getInstance().validate(new Employee("ABCD", "XYZS", "jon", 65));
      fail("Should have had EmployeeException containing 'valid age'");
    } catch (EmployeeException e) {
      assertTrue(e.getMessage().contains("valid age"));
    }
  }

}
