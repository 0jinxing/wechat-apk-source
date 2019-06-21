package com.tencent.mm.plugin.wallet_index.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_index.b.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class a$1$1
  implements a.a
{
  a$1$1(a.1 param1, boolean paramBoolean)
  {
  }

  public final void a(com.tencent.mm.plugin.wallet_index.c.b paramb, com.tencent.mm.plugin.wallet_index.b.a.b paramb1)
  {
    AppMethodBeat.i(48218);
    ab.d("MicroMsg.GoogleWallet", "Query inventory finished.");
    if ((paramb.cSV()) || (paramb1 == null))
    {
      ab.w("MicroMsg.GoogleWallet", "Failed to query inventory: ".concat(String.valueOf(paramb)));
      AppMethodBeat.o(48218);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.GoogleWallet", "Query inventory was successful.");
      a.a(this.tRy.tRx, paramb1);
      paramb = a.c(this.tRy.tRx);
      ArrayList localArrayList = new ArrayList(paramb1.tQQ.keySet());
      paramb.tRD.clear();
      paramb.tRD.addAll(localArrayList);
      paramb = new ArrayList(paramb1.tQQ.values());
      if (paramb.size() <= 0)
        break;
      paramb1 = paramb.iterator();
      while (paramb1.hasNext())
      {
        paramb = (com.tencent.mm.plugin.wallet_index.b.a.c)paramb1.next();
        ab.i("MicroMsg.GoogleWallet", "do NetSceneVerifyPurchase. productId:" + paramb.kWz + ",billNo:" + paramb.tQV);
        g.RQ();
        g.RO().eJo.a(a.c(this.tRy.tRx).a(paramb, true), 0);
      }
      AppMethodBeat.o(48218);
    }
    ab.d("MicroMsg.GoogleWallet", "purchases is null. consume null ");
    if (!this.npH)
      ab.d("MicroMsg.GoogleWallet", "unknown_purchase");
    for (paramb = com.tencent.mm.plugin.wallet_index.c.b.bu(5, ""); ; paramb = com.tencent.mm.plugin.wallet_index.c.b.bu(0, ""))
    {
      if (a.d(this.tRy.tRx) != null)
        a.d(this.tRy.tRx).a(paramb, null);
      AppMethodBeat.o(48218);
      break;
      ab.d("MicroMsg.GoogleWallet", "result ok");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.a.1.1
 * JD-Core Version:    0.6.2
 */