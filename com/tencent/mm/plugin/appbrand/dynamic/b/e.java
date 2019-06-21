package com.tencent.mm.plugin.appbrand.dynamic.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class e
{
  private static volatile e hmz;
  private Map<String, SoftReference<WxaPkgWrappingInfo>> eGu;

  private e()
  {
    AppMethodBeat.i(10789);
    this.eGu = new ConcurrentHashMap();
    AppMethodBeat.o(10789);
  }

  public static WxaPkgWrappingInfo Ac(String paramString)
  {
    AppMethodBeat.i(10791);
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(10791);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = (SoftReference)azP().eGu.get(paramString);
      if (paramString != null)
      {
        paramString = (WxaPkgWrappingInfo)paramString.get();
        AppMethodBeat.o(10791);
      }
      else
      {
        AppMethodBeat.o(10791);
        paramString = null;
      }
    }
  }

  public static boolean a(String paramString, WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(10790);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0) || (paramWxaPkgWrappingInfo == null))
    {
      bool = false;
      AppMethodBeat.o(10790);
    }
    while (true)
    {
      return bool;
      azP().eGu.put(paramString, new SoftReference(paramWxaPkgWrappingInfo));
      bool = true;
      AppMethodBeat.o(10790);
    }
  }

  private static e azP()
  {
    AppMethodBeat.i(10788);
    if (hmz == null);
    try
    {
      if (hmz == null)
      {
        locale = new com/tencent/mm/plugin/appbrand/dynamic/b/e;
        locale.<init>();
        hmz = locale;
      }
      e locale = hmz;
      AppMethodBeat.o(10788);
      return locale;
    }
    finally
    {
      AppMethodBeat.o(10788);
    }
  }

  public static void removeAll()
  {
    AppMethodBeat.i(10792);
    azP().eGu.clear();
    AppMethodBeat.o(10792);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.b.e
 * JD-Core Version:    0.6.2
 */