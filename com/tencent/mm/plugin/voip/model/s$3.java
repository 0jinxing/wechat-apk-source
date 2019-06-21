package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.model.a.f;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class s$3
  implements ap.a
{
  s$3(s params)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(4645);
    if (this.sTw.sNl.sPp.nwu == 0)
    {
      a.Loge("MicroMsg.Voip.VoipServiceEx", g.Mq() + " roomId == 0 ");
      s.c(this.sTw).stopTimer();
    }
    label138: 
    while (true)
    {
      AppMethodBeat.o(4645);
      return true;
      if (this.sTw.sNl.mStatus >= 5);
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label138;
        new f(this.sTw.sNl.sPp.nwu, this.sTw.sNl.sPp.nwv, this.sTw.sNl.sPC).cKw();
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.s.3
 * JD-Core Version:    0.6.2
 */