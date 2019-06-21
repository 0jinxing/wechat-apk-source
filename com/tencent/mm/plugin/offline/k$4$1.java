package com.tencent.mm.plugin.offline;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.plugin.offline.a.s;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.ArrayList;
import java.util.Map;

final class k$4$1
  implements Runnable
{
  k$4$1(k.4 param4, String paramString, e.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43356);
    s locals = k.bXh();
    String str1 = this.gUV;
    long l = this.fkt.eAB.ptF;
    ab.i("MicroMsg.WalletOfflineMsgManager", "onReceiveMsg msg id is :".concat(String.valueOf(l)));
    ab.i("MicroMsg.WalletOfflineMsgManager", "onReceiveMsg msg content is :".concat(String.valueOf(str1)));
    label157: String str2;
    Map localMap;
    if (!TextUtils.isEmpty(str1))
    {
      if ((locals.oVR == null) || (locals.oVR.size() == 0))
        ab.e("MicroMsg.WalletOfflineMsgManager", "mMsgIdList is null or size == 0");
      while (true)
      {
        i = 0;
        if (i == 0)
          break;
        ab.e("MicroMsg.WalletOfflineMsgManager", "onReceiveMsg msg id is exist in list:".concat(String.valueOf(l)));
        AppMethodBeat.o(43356);
        return;
        for (i = 0; ; i++)
        {
          if (i >= locals.oVR.size())
            break label157;
          if (((Long)locals.oVR.get(i)).longValue() == l)
          {
            i = 1;
            break;
          }
        }
      }
      str2 = null;
      localMap = br.z(str1, "sysmsg");
      if (localMap == null)
        break label368;
      str2 = (String)localMap.get(".sysmsg.paymsg.ack_key");
    }
    label368: for (int i = bo.getInt((String)localMap.get(".sysmsg.paymsg.PayMsgType"), -1); ; i = -1)
    {
      if (a.bYE())
      {
        ab.i("MicroMsg.WalletOfflineMsgManager", "pos is enabled. PayMsgType is %d", new Object[] { Integer.valueOf(i) });
        if ((i == 7) || (i == 10))
        {
          locals.TW(str1);
          locals.TX(str1);
        }
      }
      while (true)
      {
        if (locals.oVR.size() > 10)
          locals.oVR.remove(locals.oVR.size() - 1);
        locals.oVR.add(0, Long.valueOf(l));
        AppMethodBeat.o(43356);
        break;
        if (g.fy(str2, str1))
        {
          ab.i("MicroMsg.WalletOfflineMsgManager", "process msg from push");
          h.pYm.a(135L, 70L, 1L, true);
          locals.TW(str1);
          locals.TX(str1);
          continue;
          g.fy(str2, str1);
          locals.TW(str1);
          locals.TX(str1);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.k.4.1
 * JD-Core Version:    0.6.2
 */