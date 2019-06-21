package com.tencent.mm.al;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lp;
import com.tencent.mm.i.h;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.b.a;
import java.util.Map;

final class e$10
  implements Runnable
{
  e$10(e parame, String paramString, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50567);
    h localh = (h)this.fzs.fyM.get(this.IN);
    if (localh != null)
    {
      lp locallp = new lp();
      locallp.cHq.cAd = 3;
      locallp.cHq.retCode = 0;
      locallp.cHq.cHr = this.IN;
      locallp.cHq.offset = this.fzv;
      locallp.cHq.length = this.fzw;
      a.xxA.m(locallp);
      if ((this.fzv == 0) && (this.fzw >= localh.egC))
        e.a(u.ut(localh.filename), localh.egC, localh.egB);
    }
    AppMethodBeat.o(50567);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.e.10
 * JD-Core Version:    0.6.2
 */