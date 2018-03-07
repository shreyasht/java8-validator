/**
 * 
 */
package com.tuturself.java8validator.validators.genericvalidator;

import java.util.Optional;

/**
 * @author Dragon Warrior
 *
 */
public class GenericValidationResult {

  private boolean valid;

  public boolean isValid() {
    return valid;
  }

  public static GenericValidationResult ok() {
    return new GenericValidationResult(true);
  }

  private GenericValidationResult(boolean valid) {
    this.valid = valid;
  }

  public static GenericValidationResult fail() {
    return new GenericValidationResult(false);
  }

  public Optional<String> getFieldNameIfInvalid(String field) {
    return this.valid ? Optional.empty() : Optional.of(field);
  }

}
