package com.tencent.mm.plugin.sns.ui.item;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.i;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements b.e
{
  c$1(c paramc, au paramau, av paramav)
  {
  }

  public final void c(b paramb, int paramInt)
  {
    AppMethodBeat.i(40135);
    ab.i("MicroMsg.FullCardAdTimeLineItem", "sight play completed!");
    if (paramInt != -1)
      if ((this.rHs == null) || (this.rHs.rxP == null) || (this.rHs.rxP.rhm == null))
        AppMethodBeat.o(40135);
    while (true)
    {
      return;
      this.rHs.rxP.rhm.u(this.rID.rAt, false);
      AppMethodBeat.o(40135);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.c.1
 * JD-Core Version:    0.6.2
 */