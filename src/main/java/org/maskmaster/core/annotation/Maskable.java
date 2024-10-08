package org.maskmaster.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.maskmaster.core.Masker;

/**
 * A marker to signify a particular annotation
 *
 * @author Mikhail Polivakha
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Maskable {

  /**
   * Class of the {@link Masker}, that is responsible for the masking itself
   */
  Class<? extends Masker> masker();
}
