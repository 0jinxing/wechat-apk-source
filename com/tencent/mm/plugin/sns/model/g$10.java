package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.e;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.storage.az;

final class g$10
  implements Runnable
{
  g$10(g paramg, int paramInt, bau parambau, az paramaz)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36145);
    e locale;
    b localb;
    bau localbau;
    if (!g.a(this.qIr, this.qIt, this.qIs))
    {
      locale = new e(this.qIs);
      locale.qFQ = this.qIt;
      locale.nQB = this.qIs.Id;
      localb = af.cnA();
      localbau = this.qIs;
      if (this.qIs.jCt != 6)
        break label97;
    }
    label97: for (int i = 5; ; i = 1)
    {
      localb.a(localbau, i, locale, this.qIz);
      AppMethodBeat.o(36145);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.g.10
 * JD-Core Version:    0.6.2
 */