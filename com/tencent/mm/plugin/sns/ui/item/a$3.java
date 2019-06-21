package com.tencent.mm.plugin.sns.ui.item;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.i;
import com.tencent.mm.sdk.platformtools.bo;

final class a$3
  implements b.f
{
  a$3(a parama, au paramau, av paramav, a.a parama1)
  {
  }

  public final void b(b paramb, long paramLong)
  {
    AppMethodBeat.i(40130);
    if ((this.rHs == null) || (this.rHs.rxP == null) || (this.rHs.rxP.rhm == null))
      AppMethodBeat.o(40130);
    while (true)
    {
      return;
      if (paramLong >= 3L)
      {
        int i = (int)paramb.cle();
        this.rHs.rxP.rhm.c(this.rID.rAt, bo.yz(), false);
        this.rHs.rxP.rhm.f(this.rID.rAt, i, false);
        this.rHs.rxP.rhm.T(this.rID.rAt, this.rID.rAt);
        this.rIB.rGD.qzM.setOnDecodeDurationListener(null);
      }
      AppMethodBeat.o(40130);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.a.3
 * JD-Core Version:    0.6.2
 */