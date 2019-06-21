package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class es
{
  private static boolean a = true;
  private static boolean b = true;

  public static void a(String paramString1, int paramInt1, int paramInt2, String paramString2, Map<String, String> paramMap1, Map<String, String> paramMap2, boolean paramBoolean)
  {
    AppMethodBeat.i(98825);
    bx.a(paramString1, paramInt1, paramInt2, paramString2, paramMap1, paramMap2, paramBoolean, 1);
    AppMethodBeat.o(98825);
  }

  public static boolean a(String paramString, int paramInt, Map<String, String> paramMap)
  {
    AppMethodBeat.i(98827);
    boolean bool;
    if (paramInt == bt.c())
      if ((a) && (("HLReqRspEvent".equals(paramString)) || ("HLHttpAgent".equals(paramString))))
      {
        a = false;
        bool = true;
      }
    while (true)
    {
      AppMethodBeat.o(98827);
      return bool;
      if ((b) && ("HLHttpDirect".equals(paramString)))
      {
        paramString = (String)paramMap.get("B15");
        if ((!eu.a(paramString)) && (paramString.equals("app")))
        {
          b = false;
          bool = true;
        }
      }
      else
      {
        bool = false;
      }
    }
  }

  public static void b(String paramString1, int paramInt1, int paramInt2, String paramString2, Map<String, String> paramMap1, Map<String, String> paramMap2, boolean paramBoolean)
  {
    AppMethodBeat.i(98826);
    bx.a(paramString1, paramInt1, paramInt2, paramString2, paramMap1, paramMap2, paramBoolean);
    AppMethodBeat.o(98826);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.es
 * JD-Core Version:    0.6.2
 */