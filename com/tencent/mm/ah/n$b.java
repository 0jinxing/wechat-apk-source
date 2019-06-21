package com.tencent.mm.ah;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.List;

final class n$b
  implements ap.a
{
  Runnable fso;

  public final boolean BI()
  {
    AppMethodBeat.i(77950);
    int i = n.XC().size();
    ab.e("MicroMsg.RemoveAvatarTask", "RemoveOldAvatar left count:".concat(String.valueOf(i)));
    if ((i <= 2000) || (n.access$100() >= 300))
    {
      if (this.fso != null)
        this.fso.run();
      n.acq();
      AppMethodBeat.o(77950);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      long l = g.RP().eJN.iV(Thread.currentThread().getId());
      for (int j = i - 1; j >= i - 30; j--)
      {
        n.acr();
        String str = (String)n.XC().get(j);
        n.XC().remove(j);
        o.acd();
        d.E(str, false);
        o.acd();
        d.E(str, true);
        o.act().qp(str);
      }
      g.RP().eJN.mB(l);
      AppMethodBeat.o(77950);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.n.b
 * JD-Core Version:    0.6.2
 */