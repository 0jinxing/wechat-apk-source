package com.tencent.mm.al;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lp;
import com.tencent.mm.i.h;
import com.tencent.mm.i.h.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import java.util.Map;

final class e$9
  implements Runnable
{
  e$9(e parame, String paramString, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50566);
    Object localObject = (h)this.fzs.fyM.get(this.IN);
    if (localObject != null)
    {
      if (((h)localObject).egK != null)
        ((h)localObject).egK.onDataAvailable(this.IN, this.fzv, this.fzw);
      localObject = new lp();
      ((lp)localObject).cHq.cAd = 2;
      ((lp)localObject).cHq.retCode = 0;
      ((lp)localObject).cHq.cHr = this.IN;
      ((lp)localObject).cHq.offset = this.fzv;
      ((lp)localObject).cHq.length = this.fzw;
      a.xxA.m((b)localObject);
    }
    AppMethodBeat.o(50566);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.e.9
 * JD-Core Version:    0.6.2
 */