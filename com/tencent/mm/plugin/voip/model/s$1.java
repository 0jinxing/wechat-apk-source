package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.b;
import com.tencent.mm.sdk.platformtools.ap.a;

final class s$1
  implements ap.a
{
  s$1(s params)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(4643);
    if (this.sTw.sNl.sPp.sTY == 1)
    {
      k localk = this.sTw.sNl;
      if ((localk.mStatus != 2) && (localk.mStatus != 4))
        break label184;
    }
    label184: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        a.Logi("MicroMsg.Voip.VoipServiceEx", "call timeout!");
        this.sTw.sNl.sPp.sVH.sQe = 101;
        h.pYm.e(11521, new Object[] { Integer.valueOf(b.cIj().cJZ()), Long.valueOf(b.cIj().cKa()), Long.valueOf(b.cIj().cIK()), Integer.valueOf(4), Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()) });
        this.sTw.cKk();
        this.sTw.sNl.sPq.cJA();
      }
      AppMethodBeat.o(4643);
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.s.1
 * JD-Core Version:    0.6.2
 */