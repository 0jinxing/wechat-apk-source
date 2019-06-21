package com.tencent.mm.plugin.offline;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.offline.a.d;
import com.tencent.mm.plugin.offline.a.s;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

final class g$1
  implements f
{
  g$1(g paramg)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(43312);
    Map localMap;
    if (((paramm instanceof d)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      paramm = (d)paramm;
      g.access$002(paramm.oXW);
      if (g.access$000() == 0)
        g.access$002(g.access$100());
      ab.i(g.access$200(), "NetSceneOfflineGetMsg: ackkey: %s, appMsg: %s", new Object[] { paramm.oXX, paramm.oXV });
      if ((bo.isNullOrNil(paramm.oXV)) || (bo.isNullOrNil(paramm.oXX)))
        break label319;
      if (g.fy(paramm.oXX, paramm.oXV))
      {
        ab.i(g.access$200(), "from cgi");
        if (br.z(paramm.oXV, "sysmsg") == null)
        {
          AppMethodBeat.o(43312);
          return;
        }
        h.pYm.a(135L, 71L, 1L, true);
        k.bXg();
        paramString = k.bXh();
        paramm = paramm.oXV;
        ab.i("MicroMsg.WalletOfflineMsgManager", "notifyMsgFromCgi");
        if (!TextUtils.isEmpty(paramm))
        {
          localMap = br.z(paramm, "sysmsg");
          if (localMap == null)
            break label330;
          localMap.get(".sysmsg.paymsg.ack_key");
        }
      }
    }
    label319: label330: for (paramInt1 = bo.getInt((String)localMap.get(".sysmsg.paymsg.PayMsgType"), -1); ; paramInt1 = -1)
    {
      if ((a.bYE()) && (paramInt1 != 7) && (paramInt1 != 10))
      {
        ab.i("MicroMsg.WalletOfflineMsgManager", "process msg from pull");
        paramString.TW(paramm);
        paramString.TX(paramm);
      }
      while (true)
      {
        ab.i(g.access$200(), "mIntercal=" + g.access$000());
        paramString = g.a(this.oXn);
        long l = g.access$000();
        paramString.ae(l, l);
        AppMethodBeat.o(43312);
        break;
        ab.i(g.access$200(), "OfflineGetMsgLogic msg is null");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.g.1
 * JD-Core Version:    0.6.2
 */