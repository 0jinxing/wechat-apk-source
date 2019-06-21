package com.tencent.mm.plugin.sns.ui.item;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.a;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.sdk.platformtools.bo;

final class i$2
  implements b.f
{
  i$2(i parami, au paramau, long paramLong, boolean paramBoolean, int paramInt, aj paramaj)
  {
  }

  public final void b(b paramb, long paramLong)
  {
    AppMethodBeat.i(40157);
    if ((this.rHs == null) || (this.rHs.rxP == null) || (this.rHs.rxP.rhm == null))
      AppMethodBeat.o(40157);
    while (true)
    {
      return;
      if (paramLong >= 3L)
      {
        int i = (int)paramb.cle();
        this.rHs.rxP.rhm.c(this.rHp, bo.yz(), this.qEa);
        this.rHs.rxP.rhm.f(this.rHp, i, this.qEa);
        this.rHs.rxP.rhm.T(this.rHp, this.rHp + this.val$index);
        this.rqW.qzM.setOnDecodeDurationListener(null);
      }
      AppMethodBeat.o(40157);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.i.2
 * JD-Core Version:    0.6.2
 */