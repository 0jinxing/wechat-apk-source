package com.tencent.mm.compatible.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

public final class ab
{
  private static Class<?> aIl = null;
  private static Method eug = null;
  private static Method euh = null;

  static
  {
    AppMethodBeat.i(93021);
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      aIl = localClass;
      eug = localClass.getDeclaredMethod("get", new Class[] { String.class });
      euh = aIl.getDeclaredMethod("getInt", new Class[] { String.class, Integer.TYPE });
      eug.setAccessible(true);
      euh.setAccessible(true);
      AppMethodBeat.o(93021);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.SystemProperties", localException, "", new Object[0]);
        AppMethodBeat.o(93021);
      }
    }
  }

  public static String get(String paramString)
  {
    AppMethodBeat.i(93020);
    try
    {
      paramString = (String)eug.invoke(null, new Object[] { paramString });
      AppMethodBeat.o(93020);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.SystemProperties", paramString, "", new Object[0]);
        AppMethodBeat.o(93020);
        paramString = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.ab
 * JD-Core Version:    0.6.2
 */