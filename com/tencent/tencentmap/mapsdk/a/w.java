package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ic;

public class w extends s
{
  private static volatile w b;

  private w(Context paramContext)
  {
    AppMethodBeat.i(98291);
    if (paramContext == null)
      AppMethodBeat.o(98291);
    while (true)
    {
      return;
      this.a = paramContext.getSharedPreferences("com.tencent.tencentmap.mapsdk.maps.offlinemap", 0);
      c();
      AppMethodBeat.o(98291);
    }
  }

  public static w a(Context paramContext)
  {
    AppMethodBeat.i(98290);
    if (b == null);
    try
    {
      if (b == null)
      {
        w localw = new com/tencent/tencentmap/mapsdk/a/w;
        localw.<init>(paramContext);
        b = localw;
      }
      paramContext = b;
      AppMethodBeat.o(98290);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(98290);
    }
    throw paramContext;
  }

  private void c()
  {
    AppMethodBeat.i(98292);
    if (b == null)
      AppMethodBeat.o(98292);
    while (true)
    {
      return;
      a(new String[] { "taiwanClearCacheVersion", "taiwanStyle", "taiwanVersion", "mapPoiIcon" });
      String str = a("sdkVersion");
      if (str == null)
      {
        AppMethodBeat.o(98292);
      }
      else
      {
        if (ic.b("4.1.0", str) > 0)
          a();
        AppMethodBeat.o(98292);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.w
 * JD-Core Version:    0.6.2
 */