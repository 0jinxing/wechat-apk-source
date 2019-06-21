package org.xwalk.core.extension;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface JsConstructor
{
  public abstract boolean isEntryPoint();

  public abstract Class<?> mainClass();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     org.xwalk.core.extension.JsConstructor
 * JD-Core Version:    0.6.2
 */