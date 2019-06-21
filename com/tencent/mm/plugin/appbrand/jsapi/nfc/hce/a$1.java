package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.TimerTask;

final class a$1 extends TimerTask
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137885);
    ab.i("MicroMsg.HCEActivityMgr", "alvinluo loop check NFC switch currentCount: %d", new Object[] { Integer.valueOf(a.a(this.hSu)) });
    a.b(this.hSu);
    m.runOnUiThread(new a.1.1(this));
    AppMethodBeat.o(137885);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.1
 * JD-Core Version:    0.6.2
 */