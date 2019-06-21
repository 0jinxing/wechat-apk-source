package com.tencent.mm.plugin.sns.ui.item;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.storage.b.c;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class c$2
  implements b.f
{
  c$2(c paramc, au paramau, av paramav, c.a parama, b.c paramc1, n paramn)
  {
  }

  public final void b(b paramb, long paramLong)
  {
    AppMethodBeat.i(40136);
    if ((this.rHs == null) || (this.rHs.rxP == null) || (this.rHs.rxP.rhm == null))
      AppMethodBeat.o(40136);
    while (true)
    {
      return;
      if ((!this.rHs.rxP.rhm.jO(this.rID.rAt)) && (paramLong >= 3L))
      {
        i = (int)paramb.cle();
        this.rHs.rxP.rhm.c(this.rID.rAt, bo.yz(), false);
        this.rHs.rxP.rhm.f(this.rID.rAt, i, false);
        this.rHs.rxP.rhm.T(this.rID.rAt, this.rID.rAt);
      }
      ab.d("MicroMsg.FullCardAdTimeLineItem", "sight play %d", new Object[] { Long.valueOf(paramLong) });
      int i = (int)paramLong;
      c.a(this.rIP, this.rIQ, this.rIR, this.rhJ, i * 1000);
      AppMethodBeat.o(40136);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.c.2
 * JD-Core Version:    0.6.2
 */