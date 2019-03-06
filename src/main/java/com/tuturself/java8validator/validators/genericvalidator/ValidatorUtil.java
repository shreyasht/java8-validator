/**
 * 
 */
package com.tuturself.java8validator.validators.genericvalidator;

import java.util.List;

/**
 * @author Dragon Warrior
 *
 */
public class ValidatorUtil {

  public static final Validation<String> notNullString = GenericValidation.from(s -> s != null);
  
  public static final Validation<Object> notNullObject = GenericValidation.from(s -> s != null);

  public static final Validation<String> notEmptyString = GenericValidation.from(s -> !s.isEmpty());

  public static final Validation<Integer> notNullInteger = GenericValidation.from(s -> s != null);

  public static final Validation<Integer> greaterThanZero = GenericValidation.from(s -> s > 0);
  
  public static final Validation<List> notEmptyList = GenericValidation.from(s -> s != null && !s.isEmpty());
  
  public static final Validation<Enum> notNullEnum = GenericValidation.from(s -> s != null);

  public static final Validation<String> stringMoreThan(int size) {
    return GenericValidation.from(s -> ((String) s).length() > size);
  };

  public static final Validation<String> stringLessThan(int size) {
    return GenericValidation.from(s -> ((String) s).length() < size);
  };

  public static final Validation<String> stringBetween(int morethan, int lessThan) {
    return stringMoreThan(morethan).and(stringLessThan(lessThan));
  };

  public static final Validation<Integer> integerMoreThan(int limit) {
    return GenericValidation.from(s -> s > limit);
  };

  public static final Validation<Integer> integerLessThan(int size) {
    return GenericValidation.from(s -> s < size);
  };

  public static final Validation<Integer> integerBetween(int morethan, int lessThan) {
    return integerMoreThan(morethan).and(integerLessThan(lessThan));
  };

}
