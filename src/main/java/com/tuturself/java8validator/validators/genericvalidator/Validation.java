/**
 * 
 */
package com.tuturself.java8validator.validators.genericvalidator;

/**
 * @author Dragon Warrior
 *
 */
@FunctionalInterface
public interface Validation<K> {

	public GenericValidationResult test(K param);

	default Validation<K> and(Validation<K> other) {
		return (param) -> {
			GenericValidationResult result = this.test(param);
			return !result.isValid() ? result : other.test(param);
		};
	}

	default Validation<K> or(Validation<K> other) {
		return (param) -> {
			GenericValidationResult result = this.test(param);
			return result.isValid() ? result : other.test(param);
		};
	}

}
