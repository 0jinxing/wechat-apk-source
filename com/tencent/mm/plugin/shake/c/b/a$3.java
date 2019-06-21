package com.tencent.mm.plugin.shake.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qj;
import com.tencent.mm.g.a.qj.b;
import com.tencent.mm.sdk.platformtools.ab;

final class a$3
  implements Runnable
{
  a$3(a parama, qj paramqj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24549);
    ab.i("MicroMsg.ShakeCardDialog", "doNetSceneAccept callback");
    a.a(this.qtg, this.qth.cMB);
    if (a.g(this.qtg) != null)
    {
      a.a(this.qtg, 8);
      if (a.g(this.qtg) != null)
        a.a(this.qtg, a.g(this.qtg).cMC);
      if ((a.g(this.qtg) != null) && (a.g(this.qtg).cxT))
      {
        a.a(this.qtg, a.a.qtk);
        a.h(this.qtg);
        a.i(this.qtg);
        a.j(this.qtg);
        if (a.a(this.qtg) == null)
          break label201;
        a.a(this.qtg).ckg();
        AppMethodBeat.o(24549);
      }
    }
    while (true)
    {
      return;
      a.a(this.qtg, a.a.qtl);
      a.h(this.qtg);
      a.k(this.qtg);
      AppMethodBeat.o(24549);
      continue;
      ab.i("MicroMsg.ShakeCardDialog", "doNetSceneAccept callback, mCardAcceptResult == null");
      label201: AppMethodBeat.o(24549);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.c.b.a.3
 * JD-Core Version:    0.6.2
 */