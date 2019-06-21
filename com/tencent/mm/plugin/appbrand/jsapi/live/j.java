package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.rtmp.TXLiveBase;

public final class j
{
  private static boolean hLG;

  public static void aDJ()
  {
    AppMethodBeat.i(96129);
    if (hLG)
      AppMethodBeat.o(96129);
    while (true)
    {
      return;
      TXLiveBase.setLogLevel(1);
      TXLiveBase.setConsoleEnabled(false);
      TXLiveBase.setListener(new j.1());
      hLG = true;
      AppMethodBeat.o(96129);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.j
 * JD-Core Version:    0.6.2
 */