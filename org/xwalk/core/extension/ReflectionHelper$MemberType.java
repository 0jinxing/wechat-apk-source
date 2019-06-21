package org.xwalk.core.extension;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum ReflectionHelper$MemberType
{
  static
  {
    AppMethodBeat.i(86139);
    JS_METHOD = new MemberType("JS_METHOD", 0);
    JS_PROPERTY = new MemberType("JS_PROPERTY", 1);
    JS_CONSTRUCTOR = new MemberType("JS_CONSTRUCTOR", 2);
    $VALUES = new MemberType[] { JS_METHOD, JS_PROPERTY, JS_CONSTRUCTOR };
    AppMethodBeat.o(86139);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     org.xwalk.core.extension.ReflectionHelper.MemberType
 * JD-Core Version:    0.6.2
 */