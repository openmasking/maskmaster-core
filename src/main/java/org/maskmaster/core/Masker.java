package org.maskmaster.core;

/**
 * Core interface, that is responsible to perform actual masking
 *
 * @author Mikhail Polivakha
 */
public interface Masker {

  /**
   * Perform masking.
   *
   * @param source the string representation of the field to mask
   * @return masked string
   */
  String mask(String source);
}
