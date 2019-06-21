package com.tencent.smtt.utils;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

public class q
{
  private static Class a;
  private static Method b;

  static
  {
    AppMethodBeat.i(65285);
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      a = localClass;
      b = localClass.getDeclaredMethod("get", new Class[] { String.class, String.class });
      AppMethodBeat.o(65285);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(65285);
    }
  }

  public static String a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65283);
    if (TextUtils.isEmpty(paramString1))
      AppMethodBeat.o(65283);
    while (true)
    {
      return paramString2;
      paramString2 = b(paramString1, paramString2);
      AppMethodBeat.o(65283);
    }
  }

  private static String b(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65284);
    if ((a == null) || (b == null))
    {
      AppMethodBeat.o(65284);
      paramString1 = paramString2;
    }
    while (true)
    {
      return paramString1;
      try
      {
        paramString1 = (String)b.invoke(a, new Object[] { paramString1, paramString2 });
        AppMethodBeat.o(65284);
      }
      catch (Throwable paramString1)
      {
        while (true)
          paramString1 = paramString2;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.q
 * JD-Core Version:    0.6.2
 */