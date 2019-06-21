package com.tencent.mm.plugin.remittance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.d;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.a;
import java.util.Map;

final class c$3
  implements k.a
{
  c$3(c paramc)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(44426);
    if ((paramString != null) && (paramString.length() > 0) && ("event_updated".equals(paramString)))
    {
      paramString = com.tencent.mm.model.c.c.abi().ll("100324");
      if ((!paramString.isValid()) || (!"1".equals(paramString.dru().get("open"))))
        break label172;
    }
    label172: for (int i = 1; ; i = 0)
    {
      paramString = g.RP().Ry();
      paramString.set(ac.a.xTT, Integer.valueOf(i));
      int j = ((Integer)paramString.get(ac.a.xTU, Integer.valueOf(0))).intValue();
      ab.i("MicroMsg.SubCoreRemittance", "receive abtest open bank remit: %s, %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      if (j == 0)
      {
        com.tencent.mm.x.c.PK().b(ac.a.xTO, true);
        paramString.set(ac.a.xTU, Integer.valueOf(1));
        g.RP().Ry().set(ac.a.xTP, Boolean.FALSE);
      }
      AppMethodBeat.o(44426);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.a.c.3
 * JD-Core Version:    0.6.2
 */