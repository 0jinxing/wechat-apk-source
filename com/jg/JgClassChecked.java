package com.jg;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface JgClassChecked
{
  public abstract int author();

  public abstract String fComment();

  public abstract String lastDate();

  public abstract int level();

  public abstract int reviewer();

  public abstract EType[] vComment();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.jg.JgClassChecked
 * JD-Core Version:    0.6.2
 */