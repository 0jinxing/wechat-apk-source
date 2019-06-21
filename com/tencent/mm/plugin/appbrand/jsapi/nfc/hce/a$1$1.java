package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.d;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1$1
  implements Runnable
{
  a$1$1(a.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137884);
    if (a.a(this.hSv.hSu) > 10)
    {
      ab.i("MicroMsg.HCEActivityMgr", "alvinluo loop check count exceed max limit: %d", new Object[] { Integer.valueOf(10) });
      a.c(this.hSv.hSu);
      a.d(this.hSv.hSu);
      AppMethodBeat.o(137884);
    }
    while (true)
    {
      return;
      if (d.aEC())
      {
        ab.i("MicroMsg.HCEActivityMgr", "alvinluo loopCheck NFC switch is opened, and cancel task");
        a.c(this.hSv.hSu);
        a.e(this.hSv.hSu);
      }
      AppMethodBeat.o(137884);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.1.1
 * JD-Core Version:    0.6.2
 */