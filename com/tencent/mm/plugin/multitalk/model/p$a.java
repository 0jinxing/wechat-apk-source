package com.tencent.mm.plugin.multitalk.model;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.y;
import java.util.Map;

final class p$a
  implements bz.a
{
  p$a(p paramp)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(54089);
    Object localObject1 = p.bSi();
    String str = aa.a(parama.eAB.vED);
    Object localObject2 = br.z(str, "sysmsg");
    if ((String)((Map)localObject2).get(".sysmsg.multivoip.notfriendnotifydata") != null)
    {
      ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "receive notfriendnotifydata msg:".concat(String.valueOf(str)));
      AppMethodBeat.o(54089);
    }
    while (true)
    {
      return;
      str = (String)((Map)localObject2).get(".sysmsg.multivoip.notifydata");
      if (str != null)
      {
        localObject1 = Base64.decode(bo.bc(str, "").getBytes(), 0);
        ab.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "receive " + aa.a(parama.eAB.vED) + " buffer len " + localObject1.length);
        p.bSe().oFP.bR(bo.h((Integer)com.tencent.mm.kernel.g.RP().eJH.get(1)), r.Yz());
        p.bSe().oFP.ck((byte[])localObject1);
        AppMethodBeat.o(54089);
      }
      else
      {
        localObject2 = (String)((Map)localObject2).get(".sysmsg.multivoip.banner");
        if (localObject2 != null)
          ((g)localObject1).a((String)localObject2, parama);
        AppMethodBeat.o(54089);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.p.a
 * JD-Core Version:    0.6.2
 */