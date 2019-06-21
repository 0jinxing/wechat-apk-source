package com.tencent.wework.api.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;

public final class ReflecterHelper
{
  public static Object newInstance(String paramString)
  {
    AppMethodBeat.i(80515);
    paramString = Class.forName(paramString).getDeclaredConstructor(null);
    paramString.setAccessible(true);
    paramString = paramString.newInstance(null);
    AppMethodBeat.o(80515);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wework.api.util.ReflecterHelper
 * JD-Core Version:    0.6.2
 */