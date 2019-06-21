package com.tencent.mm.plugin.appbrand.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class d
{
  private static volatile d hlw;
  Map<String, c> hlx;

  private d()
  {
    AppMethodBeat.i(10675);
    this.hlx = new ConcurrentHashMap();
    AppMethodBeat.o(10675);
  }

  public static d azy()
  {
    AppMethodBeat.i(10676);
    if (hlw == null);
    try
    {
      if (hlw == null)
      {
        locald = new com/tencent/mm/plugin/appbrand/dynamic/d;
        locald.<init>();
        hlw = locald;
      }
      d locald = hlw;
      AppMethodBeat.o(10676);
      return locald;
    }
    finally
    {
      AppMethodBeat.o(10676);
    }
  }

  public final c zR(String paramString)
  {
    AppMethodBeat.i(10677);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.DynamicPageViewIPCProxyManager", "get IPCProxy from manager failed, key is null or nil.");
      paramString = null;
      AppMethodBeat.o(10677);
    }
    while (true)
    {
      return paramString;
      paramString = (c)this.hlx.get(paramString);
      AppMethodBeat.o(10677);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d
 * JD-Core Version:    0.6.2
 */