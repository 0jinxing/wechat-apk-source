package com.tencent.mm.plugin.order.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.Map;

final class b$2$1
  implements Runnable
{
  b$2$1(b.2 param2, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43727);
    Object localObject1 = this.pbG.pbF;
    g.RN().QU();
    if (((b)localObject1).pbB == null)
      ((b)localObject1).pbB = new com.tencent.mm.plugin.order.model.b();
    localObject1 = ((b)localObject1).pbB;
    Object localObject2 = this.gUV;
    if (!bo.isNullOrNil((String)localObject2))
    {
      localObject2 = br.z((String)localObject2, "sysmsg");
      if (localObject2 == null)
        AppMethodBeat.o(43727);
    }
    while (true)
    {
      return;
      try
      {
        localObject2 = (String)((Map)localObject2).get(".sysmsg.wxpay.transid");
        if (!bo.isNullOrNil((String)localObject2))
        {
          ab.d("MicroMsg.WalletOrdersManager", "transid ".concat(String.valueOf(localObject2)));
          if (!((com.tencent.mm.plugin.order.model.b)localObject1).pbV.contains(localObject2))
          {
            ((com.tencent.mm.plugin.order.model.b)localObject1).pbV.add(localObject2);
            g.RQ();
            g.RP().Ry().set(204817, Integer.valueOf(((com.tencent.mm.plugin.order.model.b)localObject1).pbV.size()));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("notifyTrans.size() : ");
            ab.d("MicroMsg.WalletOrdersManager", ((com.tencent.mm.plugin.order.model.b)localObject1).pbV.size());
            ((com.tencent.mm.plugin.order.model.b)localObject1).bYV();
            b.bYR().aVU();
          }
        }
        AppMethodBeat.o(43727);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.WalletOrdersManager", "cmdid error");
      }
      AppMethodBeat.o(43727);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.a.b.2.1
 * JD-Core Version:    0.6.2
 */