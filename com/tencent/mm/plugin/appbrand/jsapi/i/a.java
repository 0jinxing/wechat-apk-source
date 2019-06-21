package com.tencent.mm.plugin.appbrand.jsapi.i;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.l.p.c;
import java.util.HashMap;

public final class a extends ah
{
  private static final int CTRL_INDEX = 530;
  private static final String NAME = "onLocalServiceEvent";
  private static a hRp;

  static
  {
    AppMethodBeat.i(108018);
    hRp = new a();
    AppMethodBeat.o(108018);
  }

  public static void a(c paramc, p.c paramc1)
  {
    AppMethodBeat.i(108013);
    a(paramc, paramc1, "found");
    AppMethodBeat.o(108013);
  }

  private static void a(c paramc, p.c paramc1, String paramString)
  {
    try
    {
      AppMethodBeat.i(108017);
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      localHashMap.put("event", paramString);
      if ((TextUtils.equals(paramString, "found")) || (TextUtils.equals(paramString, "lost")) || (TextUtils.equals(paramString, "resolveFail")))
      {
        localHashMap.put("serviceType", paramc1.ipA);
        localHashMap.put("serviceName", paramc1.ipz);
        if (!TextUtils.equals(paramString, "resolveFail"))
        {
          localHashMap.put("ip", paramc1.ip);
          localHashMap.put("port", Integer.valueOf(paramc1.port));
          localHashMap.put("attributes", paramc1.ipy);
        }
      }
      hRp.t(localHashMap).j(paramc).aCj();
      AppMethodBeat.o(108017);
      return;
    }
    finally
    {
    }
    throw paramc;
  }

  public static void b(c paramc, p.c paramc1)
  {
    AppMethodBeat.i(108014);
    a(paramc, paramc1, "lost");
    AppMethodBeat.o(108014);
  }

  public static void c(c paramc, p.c paramc1)
  {
    AppMethodBeat.i(108015);
    a(paramc, paramc1, "resolveFail");
    AppMethodBeat.o(108015);
  }

  public static void r(c paramc)
  {
    AppMethodBeat.i(108016);
    a(paramc, null, "stopScan");
    AppMethodBeat.o(108016);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.a
 * JD-Core Version:    0.6.2
 */