package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
{
  public static void IF()
  {
    AppMethodBeat.i(21006);
    try
    {
      c localc = c.bzM();
      d.1 local1 = new com/tencent/mm/plugin/freewifi/ui/d$1;
      local1.<init>();
      localc.a(local1);
      AppMethodBeat.o(21006);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiLocationReporter", "report location error. " + localException.getMessage());
        AppMethodBeat.o(21006);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.d
 * JD-Core Version:    0.6.2
 */