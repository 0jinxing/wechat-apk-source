package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;

final class d$3 extends TimerTask
{
  d$3(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137875);
    d locald = this.hSh;
    while (true)
    {
      synchronized (locald.mLock)
      {
        boolean bool = locald.eTM;
        if (!bool)
          locald.eTM = true;
        if (bool)
        {
          ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE onStartHCEOvertime has finished, return");
          AppMethodBeat.o(137875);
          return;
        }
      }
      if (HCEEventLogic.aEt())
      {
        ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE onStartHCEOvertime has stop, return");
        AppMethodBeat.o(137875);
      }
      else
      {
        ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo start HCEService overtime, expect time limit: %d seconds", new Object[] { Integer.valueOf(10) });
        HCEEventLogic.eo(true);
        if (localObject1.hzz != null)
          com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.c.G(localObject1.hzz.getAppId(), 13007, -2);
        ??? = new HashMap();
        ((Map)???).put("errCode", Integer.valueOf(13007));
        localObject1.AR(localObject1.j("fail: start HCEService failed", (Map)???));
        AppMethodBeat.o(137875);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.d.3
 * JD-Core Version:    0.6.2
 */