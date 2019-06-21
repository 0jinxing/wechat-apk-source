package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.r.h;
import com.tencent.mm.sdk.platformtools.ab;

public class HCEEventLogic
{
  private static String hRT;
  private static boolean hRU;
  private static g.c hRV;

  static
  {
    AppMethodBeat.i(137858);
    hRT = null;
    hRU = true;
    hRV = new HCEEventLogic.1();
    AppMethodBeat.o(137858);
  }

  public static void BE(String paramString)
  {
    AppMethodBeat.i(137855);
    if ((hRT != null) && (hRV != null))
    {
      ab.i("MicroMsg.HCEEventLogic", "alvinluo remove HCELifeCycleListener before add, appId: %s", new Object[] { hRT });
      g.b(hRT, hRV);
    }
    hRT = paramString;
    g.a(paramString, hRV);
    AppMethodBeat.o(137855);
  }

  public static void BF(String paramString)
  {
    AppMethodBeat.i(137856);
    if (paramString != null)
      g.b(paramString, hRV);
    AppMethodBeat.o(137856);
  }

  public static void a(String paramString, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(137857);
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
      localBundle = new Bundle();
    ab.i("MicroMsg.HCEEventLogic", "alvinluo HCEEventLogic sendHCEEventToMM appId: %s, eventType: %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    paramString = new HCEEventLogic.SendHCEEventToMMTask(paramString, paramInt, localBundle, (byte)0);
    h.bB(paramString);
    AppBrandMainProcessService.a(paramString);
    AppMethodBeat.o(137857);
  }

  public static boolean aEt()
  {
    try
    {
      boolean bool = hRU;
      return bool;
    }
    finally
    {
    }
  }

  public static void eo(boolean paramBoolean)
  {
    try
    {
      hRU = paramBoolean;
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.HCEEventLogic
 * JD-Core Version:    0.6.2
 */