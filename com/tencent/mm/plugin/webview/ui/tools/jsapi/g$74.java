package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.dp;
import com.tencent.mm.g.a.dp.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class g$74
  implements Runnable
{
  g$74(g paramg, dp paramdp, i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9137);
    ab.i("MicroMsg.MsgHandler", "ExDeviceGetTicketEvent isOk[%s], ticket[%s]", new Object[] { Boolean.valueOf(this.uHV.cwY.cxa), this.uHV.cwY.cxb });
    if (this.uHV.cwY.cxa)
      if (!bo.isNullOrNil(this.uHV.cwY.cxb))
      {
        HashMap localHashMap = new HashMap();
        ab.i("MicroMsg.MsgHandler", "ticket %s", new Object[] { this.uHV.cwY.cxb });
        localHashMap.put("ticket", this.uHV.cwY.cxb);
        g.a(this.uHd, this.uqf, "getWXDeviceTicket:ok", localHashMap);
        AppMethodBeat.o(9137);
      }
    while (true)
    {
      return;
      g.a(this.uHd, this.uqf, "getWXDeviceTicket:fail", null);
      AppMethodBeat.o(9137);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.74
 * JD-Core Version:    0.6.2
 */