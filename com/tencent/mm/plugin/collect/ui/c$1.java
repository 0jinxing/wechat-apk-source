package com.tencent.mm.plugin.collect.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.o;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class c$1
  implements ao.b.a
{
  c$1(c paramc, long paramLong)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(41323);
    if (paramBoolean)
    {
      ab.v("MicroMsg.CollectPayInfoPreference", "getContact suc; cost=" + (bo.anU() - this.kEX) + " ms");
      b.U(paramString, 3);
      o.acv().pZ(paramString);
    }
    while (true)
    {
      a.b.b(c.a(this.kHB), c.b(this.kHB));
      AppMethodBeat.o(41323);
      return;
      ab.w("MicroMsg.CollectPayInfoPreference", "getContact failed");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.c.1
 * JD-Core Version:    0.6.2
 */