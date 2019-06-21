package com.tencent.mm.plugin.ipcall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.ipcall.a.d.g;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

final class i$3
  implements bz.a
{
  i$3(i parami)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(21766);
    ab.i("MicroMsg.SubCoreIPCall", "WCONotify onRecieveMsg");
    parama = aa.a(parama.eAB.vED);
    if ((parama == null) || (parama.length() == 0))
    {
      ab.e("MicroMsg.SubCoreIPCall", "WCONotify onReceiveMsg, msgContent is null");
      AppMethodBeat.o(21766);
    }
    while (true)
    {
      return;
      parama = br.z(parama, "sysmsg");
      if (parama == null)
      {
        ab.e("MicroMsg.SubCoreIPCall", "WCONotify onReceiveMsg, values is null");
        AppMethodBeat.o(21766);
      }
      else
      {
        if (parama.containsKey(".sysmsg.WCONotify.NotifyGetBalance"))
        {
          int i = bo.getInt((String)parama.get(".sysmsg.WCONotify.NotifyGetBalance"), 0);
          ab.i("MicroMsg.SubCoreIPCall", "WCONotify NotifyGetBalance: %d", new Object[] { Integer.valueOf(i) });
          if (i > 0)
          {
            parama = new g(2);
            aw.Rg().a(parama, 0);
          }
        }
        AppMethodBeat.o(21766);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.i.3
 * JD-Core Version:    0.6.2
 */