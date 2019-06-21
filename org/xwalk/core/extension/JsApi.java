package org.xwalk.core.extension;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD})
public @interface JsApi
{
  public abstract boolean isEntryPoint();

  public abstract boolean isEventList();

  public abstract boolean isWritable();

  public abstract boolean withPromise();

  public abstract String wrapArgs();

  public abstract String wrapReturns();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.xwalk.core.extension.JsApi
 * JD-Core Version:    0.6.2
 */