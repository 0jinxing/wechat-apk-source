package com.tencent.soter.core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import junit.framework.Assert;

public final class d
{
  private static c Avg;

  static
  {
    AppMethodBeat.i(73031);
    Avg = new d.a((byte)0);
    AppMethodBeat.o(73031);
  }

  public static void a(c paramc)
  {
    AppMethodBeat.i(73024);
    if (paramc != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      Avg = paramc;
      AppMethodBeat.o(73024);
      return;
    }
  }

  public static void a(String paramString1, Throwable paramThrowable, String paramString2)
  {
    AppMethodBeat.i(73030);
    Avg.a(paramString1, paramThrowable, paramString2);
    AppMethodBeat.o(73030);
  }

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73026);
    Avg.d(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(73026);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73029);
    Avg.e(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(73029);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73027);
    Avg.i(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(73027);
  }

  public static void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73025);
    Avg.v(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(73025);
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73028);
    Avg.w(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(73028);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.c.d
 * JD-Core Version:    0.6.2
 */