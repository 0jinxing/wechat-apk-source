package com.tencent.mm.plugin.appbrand.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.a;
import com.tencent.mm.plugin.appbrand.config.a.e;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.i;
import java.util.Arrays;
import java.util.List;

public final class m
{
  private static final List<String> ixd;

  static
  {
    AppMethodBeat.i(102310);
    ixd = Arrays.asList(new String[] { "scope.userLocation" });
    AppMethodBeat.o(102310);
  }

  public static String a(String paramString, i parami)
  {
    AppMethodBeat.i(102309);
    paramString = parami.getAppConfig().yS(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(102309);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.desc;
      AppMethodBeat.o(102309);
    }
  }

  public static boolean a(String paramString, h paramh)
  {
    boolean bool = false;
    AppMethodBeat.i(102308);
    if (!ixd.contains(paramString))
      AppMethodBeat.o(102308);
    while (true)
    {
      label24: return bool;
      int i = -1;
      switch (paramString.hashCode())
      {
      default:
      case -653473286:
      }
      while (true)
        switch (i)
        {
        default:
          AppMethodBeat.o(102308);
          break label24;
          if (paramString.equals("scope.userLocation"))
            i = 0;
          break;
        case 0:
        }
      bool = paramh.hgZ;
      AppMethodBeat.o(102308);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.m
 * JD-Core Version:    0.6.2
 */