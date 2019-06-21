package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.sdk.platformtools.bo;

public final class l$a
{
  public static void C(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(129858);
    if (f.xH() == null)
      AppMethodBeat.o(129858);
    while (true)
    {
      return;
      f.xH().bG(aS(paramString, paramInt1), String.valueOf(paramInt2));
      AppMethodBeat.o(129858);
    }
  }

  public static void D(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(129859);
    if (f.xH() == null)
      AppMethodBeat.o(129859);
    while (true)
    {
      return;
      f.xH().bG(aT(paramString, paramInt1), String.valueOf(paramInt2));
      AppMethodBeat.o(129859);
    }
  }

  private static String aS(String paramString, int paramInt)
  {
    AppMethodBeat.i(129855);
    paramString = String.format("%s_%s_local_version", new Object[] { paramString, Integer.valueOf(paramInt) });
    AppMethodBeat.o(129855);
    return paramString;
  }

  private static String aT(String paramString, int paramInt)
  {
    AppMethodBeat.i(129856);
    paramString = String.format("%s_%s_server_version", new Object[] { paramString, Integer.valueOf(paramInt) });
    AppMethodBeat.o(129856);
    return paramString;
  }

  private static String aU(String paramString, int paramInt)
  {
    AppMethodBeat.i(129857);
    paramString = String.format("%s_%s_config", new Object[] { paramString, Integer.valueOf(paramInt) });
    AppMethodBeat.o(129857);
    return paramString;
  }

  public static int aV(String paramString, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(129861);
    if (f.xH() == null)
    {
      AppMethodBeat.o(129861);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      paramInt = bo.getInt(f.xH().get(aS(paramString, paramInt), "0"), 0);
      AppMethodBeat.o(129861);
    }
  }

  public static int aW(String paramString, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(129862);
    if (f.xH() == null)
    {
      AppMethodBeat.o(129862);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      paramInt = bo.getInt(f.xH().get(aT(paramString, paramInt), "0"), 0);
      AppMethodBeat.o(129862);
    }
  }

  public static String aX(String paramString, int paramInt)
  {
    AppMethodBeat.i(129863);
    if (f.xH() == null)
    {
      paramString = "";
      AppMethodBeat.o(129863);
    }
    while (true)
    {
      return paramString;
      paramString = f.xH().get(aU(paramString, paramInt), "");
      AppMethodBeat.o(129863);
    }
  }

  public static void h(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(129860);
    if (f.xH() == null)
      AppMethodBeat.o(129860);
    while (true)
    {
      return;
      f.xH().bG(aU(paramString1, paramInt), paramString2);
      AppMethodBeat.o(129860);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.l.a
 * JD-Core Version:    0.6.2
 */