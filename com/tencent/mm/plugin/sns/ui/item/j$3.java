package com.tencent.mm.plugin.sns.ui.item;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.a;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.i;
import com.tencent.mm.sdk.platformtools.bo;

final class j$3
  implements b.f
{
  j$3(j paramj, au paramau, long paramLong, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
  }

  public final void b(b paramb, long paramLong)
  {
    AppMethodBeat.i(40168);
    if ((this.rHs == null) || (this.rHs.rxP == null) || (this.rHs.rxP.rhm == null))
      AppMethodBeat.o(40168);
    while (true)
    {
      return;
      if (paramLong >= 3L)
      {
        int i = (int)paramb.cle();
        this.rHs.rxP.rhm.c(this.rHp, bo.yz(), false);
        this.rHs.rxP.rhm.f(this.rHp, i, false);
        this.rHs.rxP.rhm.T(this.rHp, this.rHp);
        this.rhK.rGD.qzM.setOnDecodeDurationListener(null);
      }
      AppMethodBeat.o(40168);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.j.3
 * JD-Core Version:    0.6.2
 */