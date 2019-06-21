package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.webview.model.ae;
import com.tencent.mm.protocal.protobuf.cmr;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;

final class g$53
  implements f
{
  g$53(g paramg, ae paramae, i parami)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(9113);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (cmr)this.uHM.fAT.fsH.fsP;
      if (paramString.luT != 0)
        break label128;
      paramString = paramString.xks;
      if ((paramString != null) && (!paramString.isEmpty()))
        paramm = paramString.iterator();
      while (paramm.hasNext())
      {
        paramString = (String)paramm.next();
        g.a(this.uHd, paramString);
        continue;
        g.a(this.uHd, this.uHN, "startMonitoringBeacons:no uuids", null);
      }
    }
    while (true)
    {
      com.tencent.mm.kernel.g.Rg().b(1702, this);
      AppMethodBeat.o(9113);
      return;
      label128: g.a(this.uHd, this.uHN, "startMonitoringBeacons:system error", null);
      ab.i("MicroMsg.MsgHandler", "verify beacon js permission err:%s", new Object[] { paramString.luU });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.53
 * JD-Core Version:    0.6.2
 */