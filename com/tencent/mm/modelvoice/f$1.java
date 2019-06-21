package com.tencent.mm.modelvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class f$1
  implements ap.a
{
  f$1(f paramf)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(116577);
    p localp = q.uW(this.fZg.fileName);
    if ((localp == null) || (!localp.ame()))
    {
      ab.e("MicroMsg.NetSceneUploadVoice", "Get info Failed file:" + this.fZg.fileName);
      this.fZg.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
      this.fZg.ehi.onSceneEnd(3, -1, "doScene failed", this.fZg);
      AppMethodBeat.o(116577);
    }
    while (true)
    {
      return bool;
      if ((3 != localp.status) && (8 != localp.status))
      {
        long l = System.currentTimeMillis();
        if (l / 1000L - localp.fXb > 30L)
        {
          ab.e("MicroMsg.NetSceneUploadVoice", "Error ModifyTime in Read file:" + this.fZg.fileName);
          this.fZg.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          this.fZg.ehi.onSceneEnd(3, -1, "doScene failed", this.fZg);
          AppMethodBeat.o(116577);
        }
        else if (l - this.fZg.fZf < 2000L)
        {
          ab.d("MicroMsg.NetSceneUploadVoice", "TimerExpired :" + this.fZg.fileName + " but last send time:" + (l - this.fZg.fZf));
          AppMethodBeat.o(116577);
          bool = true;
        }
        else
        {
          g localg = q.uN(this.fZg.fileName).cF(localp.fVG, 6000);
          ab.d("MicroMsg.NetSceneUploadVoice", "pusher doscene:" + this.fZg.fileName + " readByte:" + localg.cqs + " stat:" + localp.status);
          if (localg.cqs < 2000)
          {
            AppMethodBeat.o(116577);
            bool = true;
          }
        }
      }
      else
      {
        if (this.fZg.a(this.fZg.ftf, this.fZg.ehi) == -1)
        {
          this.fZg.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          this.fZg.ehi.onSceneEnd(3, -1, "doScene failed", this.fZg);
        }
        AppMethodBeat.o(116577);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.f.1
 * JD-Core Version:    0.6.2
 */