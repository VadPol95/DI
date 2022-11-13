package org.di.framework.annotations;

import java.lang.annotation.*;

/**
 * must be applied to a method to be called immediately after the instance is created.
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface PostConstructor {
}
