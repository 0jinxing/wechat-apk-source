package com.tencent.mm.plugin.appbrand.jsapi.q;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;

public final class a extends p
{
  private static final int CTRL_INDEX = 153;
  private static final String NAME = "onNetworkStatusChange";
  private static a hXw;

  public static void k(c paramc)
  {
    try
    {
      AppMethodBeat.i(86976);
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      Object localObject = d.cK(ah.getContext());
      if (localObject != d.a.hXx);
      for (boolean bool = true; ; bool = false)
      {
        localHashMap.put("isConnected", Boolean.valueOf(bool));
        localHashMap.put("networkType", ((d.a)localObject).value);
        if (hXw == null)
        {
          localObject = new com/tencent/mm/plugin/appbrand/jsapi/q/a;
          ((a)localObject).<init>();
          hXw = (a)localObject;
        }
        hXw.i(paramc).s(localHashMap).aCj();
        AppMethodBeat.o(86976);
        return;
      }
    }
    finally
    {
    }
    throw paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.a
 * JD-Core Version:    0.6.2
 */