package com.tencent.mm.plugin.aa;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.a;
import com.tencent.mm.x.c;
import java.util.Map;

final class b$5
  implements o
{
  b$5(b paramb)
  {
  }

  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(40584);
    int i = bo.getInt((String)paramMap.get(".sysmsg.paymsg.PayMsgType"), 0);
    ab.d("MicroMsg.SubCoreAA", "paymsgtype: %d, current version: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(d.vxo) });
    int j;
    int k;
    int m;
    int n;
    int i1;
    if (i == 32)
    {
      i = bo.getInt((String)paramMap.get(".sysmsg.paymsg.receiveorpayreddot"), -1);
      j = bo.getInt((String)paramMap.get(".sysmsg.paymsg.grouppayreddot"), -1);
      k = bo.getInt((String)paramMap.get(".sysmsg.paymsg.facingreceivereddot"), -1);
      m = bo.getInt((String)paramMap.get(".sysmsg.paymsg.f2fhongbaoreddot"), -1);
      n = bo.getInt((String)paramMap.get(".sysmsg.paymsg.rewardcodereddot"), -1);
      i1 = bo.getInt((String)paramMap.get(".sysmsg.paymsg.android_minclientversion"), -1);
      paramString = bo.bc((String)paramMap.get(".sysmsg.paymsg.facingreceivereddotwording"), "");
      g.RQ();
      g.RP().Ry().set(ac.a.xTb, paramString);
      ab.i("MicroMsg.SubCoreAA", "recvOrPay: %s, aa: %s, collect： %s, f2fhb: %s, qrreward: %s, version： %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1) });
      if (d.vxo >= i1)
      {
        i1 = 0;
        if (i != 1)
          break label436;
        ab.i("MicroMsg.SubCoreAA", "mark recv or pay red dot");
        c.PK().y(262159, true);
        if (j != 1)
          break label453;
        ab.i("MicroMsg.SubCoreAA", "mark group pay red dot");
        c.PK().b(ac.a.xTK, true);
        i = 1;
        label312: if (k != 1)
          break label479;
        ab.i("MicroMsg.SubCoreAA", "mark f2f recv red dot");
        c.PK().b(ac.a.xTL, true);
        i1 = 1;
        label338: if (m != 1)
          break label505;
        ab.i("MicroMsg.SubCoreAA", "mark f2f hb red dot");
        c.PK().b(ac.a.xTM, true);
        i = 1;
        label364: if (n != 1)
          break label531;
        ab.i("MicroMsg.SubCoreAA", "mark qr reward red dot");
        c.PK().b(ac.a.xTN, true);
        i1 = 1;
      }
    }
    while (true)
    {
      if (i1 != 0)
        g.RP().Ry().set(ac.a.xTP, Boolean.FALSE);
      h.pYm.e(14396, new Object[] { Integer.valueOf(1) });
      AppMethodBeat.o(40584);
      return;
      label436: if (i != 0)
        break;
      c.PK().y(262159, false);
      break;
      label453: i = i1;
      if (j != 0)
        break label312;
      c.PK().b(ac.a.xTK, false);
      i = i1;
      break label312;
      label479: i1 = i;
      if (k != 0)
        break label338;
      c.PK().b(ac.a.xTL, false);
      i1 = i;
      break label338;
      label505: i = i1;
      if (m != 0)
        break label364;
      c.PK().b(ac.a.xTM, false);
      i = i1;
      break label364;
      label531: i1 = i;
      if (n == 0)
      {
        c.PK().b(ac.a.xTN, false);
        i1 = i;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.b.5
 * JD-Core Version:    0.6.2
 */