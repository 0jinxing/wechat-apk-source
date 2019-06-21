package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TbsVideoUtils
{
  private static bg a = null;

  private static void a(Context paramContext)
  {
    bg localbg = null;
    AppMethodBeat.i(64628);
    try
    {
      if (a == null)
      {
        o.a(true).a(paramContext, false, false, null);
        bi localbi = o.a(true).a();
        paramContext = localbg;
        if (localbi != null)
          paramContext = localbi.b();
        if (paramContext != null)
        {
          localbg = new com/tencent/smtt/sdk/bg;
          localbg.<init>(paramContext);
          a = localbg;
        }
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(64628);
    }
    throw paramContext;
  }

  public static void deleteVideoCache(Context paramContext, String paramString)
  {
    AppMethodBeat.i(64629);
    a(paramContext);
    if (a != null)
      a.a(paramContext, paramString);
    AppMethodBeat.o(64629);
  }

  public static String getCurWDPDecodeType(Context paramContext)
  {
    AppMethodBeat.i(64630);
    a(paramContext);
    if (a != null)
    {
      paramContext = a.a(paramContext);
      AppMethodBeat.o(64630);
    }
    while (true)
    {
      return paramContext;
      paramContext = "";
      AppMethodBeat.o(64630);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsVideoUtils
 * JD-Core Version:    0.6.2
 */