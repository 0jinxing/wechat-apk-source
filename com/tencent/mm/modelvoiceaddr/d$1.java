package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.vfs.e;

final class d$1
  implements ap.a
{
  d$1(d paramd)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(116683);
    long l = e.asZ(this.gaN.filename);
    ab.d("MicroMsg.NetSceneVoiceAddr", g.Mq() + " onTimerExpired: file:" + this.gaN.filename + " nowlen:" + l + " oldoff:" + this.gaN.fQx + " isFin:" + this.gaN.fZa);
    boolean bool;
    if ((l - this.gaN.fQx < 3300L) && (!this.gaN.fZa))
    {
      bool = true;
      AppMethodBeat.o(116683);
    }
    while (true)
    {
      return bool;
      if (this.gaN.a(this.gaN.ftf, this.gaN.ehi) == -1)
      {
        this.gaN.retCode = (g.getLine() + 40000);
        this.gaN.ehi.onSceneEnd(3, -1, "doScene failed", this.gaN);
      }
      bool = false;
      AppMethodBeat.o(116683);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.d.1
 * JD-Core Version:    0.6.2
 */