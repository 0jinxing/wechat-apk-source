package com.tencent.mm.media.d;

import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class e$b
  implements Runnable
{
  e$b(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(12943);
    long l = bo.yz();
    synchronized (e.a(this.eVN))
    {
      if (e.b(this.eVN))
      {
        ab.i(e.c(this.eVN), "post encode frame, already finish");
        AppMethodBeat.o(12943);
        return;
      }
      y localy = y.AUy;
      e.d(this.eVN);
      ab.d(e.c(this.eVN), "drainEncoder cost " + bo.az(l));
      AppMethodBeat.o(12943);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.d.e.b
 * JD-Core Version:    0.6.2
 */