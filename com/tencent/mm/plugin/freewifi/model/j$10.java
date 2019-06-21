package com.tencent.mm.plugin.freewifi.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.go;
import com.tencent.mm.g.a.go.a;
import com.tencent.mm.plugin.freewifi.d.g;
import com.tencent.mm.plugin.freewifi.e.c.1;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

final class j$10 extends c<go>
{
  j$10(j paramj)
  {
    AppMethodBeat.i(20750);
    this.xxI = go.class.getName().hashCode();
    AppMethodBeat.o(20750);
  }

  private static boolean a(go arg0)
  {
    AppMethodBeat.i(20751);
    String str1;
    f.b localb1;
    if ((???.cBl.data == "MAIN_UI_EVENT_UPDATE_VIEW") && (m.byr()))
    {
      str1 = "InterruptedProtocol31-" + System.currentTimeMillis();
      localb1 = f.a.byS().byQ();
      if ((localb1 != null) && (!localb1.mvR) && (System.currentTimeMillis() - localb1.mvE <= 180000L) && (!m.isEmpty(localb1.mvP)) && (!m.isEmpty(localb1.mvO)) && (!m.isEmpty(localb1.mvQ)))
        break label114;
    }
    while (true)
    {
      AppMethodBeat.o(20751);
      return false;
      label114: ab.i("MicroMsg.FreeWifi.Protocol31Handler", "sessionKey=%s, step=%d, method=Protocol31Handler.handleInterruptedProtocol31Schema, desc=It gets info of the wifi switched to last time. apSSid=%s, apBssid=%s, mobileMac=%s, time=%d", new Object[] { str1, Integer.valueOf(1), localb1.mvO, localb1.mvP, localb1.mvQ, Long.valueOf(localb1.mvE) });
      ab.i("MicroMsg.FreeWifi.Protocol31Handler", "sessionKey=%s, step=%d, method=Protocol31Handler.handleInterruptedProtocol31Schema, desc=It gets info of the wifi connected right now. ", new Object[] { str1, Integer.valueOf(2) });
      String str2 = m.Mx("MicroMsg.FreeWifi.Protocol31Handler");
      if (m.Mv(localb1.mvO).equals(str2))
      {
        String str3 = m.My("MicroMsg.FreeWifi.Protocol31Handler");
        Object localObject = m.Mz("MicroMsg.FreeWifi.Protocol31Handler");
        synchronized (f.a.byS())
        {
          if (localb1 == f.a.byS().byQ());
        }
        ab.i("MicroMsg.FreeWifi.Protocol31Handler", "sessionKey=%s, step=%d, method=Protocol31Handler.handleInterruptedProtocol31Schema, desc=it starts net request [GetInterruptedProtocol31] for schema url. apSSid=%s, apBssid=%s, mobileMac=%s", new Object[] { str1, Integer.valueOf(3), str2, str3, localObject });
        g localg = new com/tencent/mm/plugin/freewifi/d/g;
        localg.<init>(str2, str3, (String)localObject);
        localObject = new com/tencent/mm/plugin/freewifi/e/c$1;
        ((c.1)localObject).<init>(str1, localb2);
        localg.c((com.tencent.mm.ai.f)localObject);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.j.10
 * JD-Core Version:    0.6.2
 */