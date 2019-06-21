package com.tencent.mm.ui.chatting.c.a;

import com.tencent.mm.ui.chatting.c.v;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface a
{
  public abstract Class<? extends v> dFp();

  public static class a
    implements v
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.a.a
 * JD-Core Version:    0.6.2
 */