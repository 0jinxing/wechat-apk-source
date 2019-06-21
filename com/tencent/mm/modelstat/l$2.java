package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.ad;

final class l$2
  implements Runnable
{
  l$2(l paraml, int paramInt, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78744);
    switch (this.fTE)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(78744);
      while (true)
      {
        return;
        ad.a(g.RP().eJM + this.fTF, r.Yz(), false, true);
        AppMethodBeat.o(78744);
        continue;
        ad.a(g.RP().cachePath + this.fTF, r.Yz(), false, true);
        AppMethodBeat.o(78744);
      }
      ad.a(this.fTF, r.Yz(), false, true);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(78745);
    String str = super.toString() + "|onPreAddMessage";
    AppMethodBeat.o(78745);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.l.2
 * JD-Core Version:    0.6.2
 */