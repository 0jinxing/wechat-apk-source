package com.tencent.mm.plugin.appbrand.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class k
{
  private static final Map<String, WxaWidgetContext> hlK;

  static
  {
    AppMethodBeat.i(10716);
    hlK = new ConcurrentHashMap();
    AppMethodBeat.o(10716);
  }

  public static WxaWidgetContext Aa(String paramString)
  {
    AppMethodBeat.i(10714);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(10714);
    }
    while (true)
    {
      return paramString;
      paramString = (WxaWidgetContext)hlK.get(paramString);
      AppMethodBeat.o(10714);
    }
  }

  public static WxaWidgetContext Ab(String paramString)
  {
    AppMethodBeat.i(10715);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(10715);
    }
    while (true)
    {
      return paramString;
      paramString = (WxaWidgetContext)hlK.remove(paramString);
      AppMethodBeat.o(10715);
    }
  }

  public static boolean a(String paramString, WxaWidgetContext paramWxaWidgetContext)
  {
    AppMethodBeat.i(10713);
    boolean bool;
    if ((bo.isNullOrNil(paramString)) || (paramWxaWidgetContext == null))
    {
      bool = false;
      AppMethodBeat.o(10713);
    }
    while (true)
    {
      return bool;
      hlK.put(paramString, paramWxaWidgetContext);
      bool = true;
      AppMethodBeat.o(10713);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.k
 * JD-Core Version:    0.6.2
 */