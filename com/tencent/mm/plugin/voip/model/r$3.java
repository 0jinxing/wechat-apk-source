package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.cpm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class r$3
  implements ap.a
{
  r$3(r paramr)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(4603);
    ab.v("MicroMsg.Voip.VoipService", "voip repeat check is foreground");
    if (r.e(this.sTg) == null)
    {
      r.f(this.sTg);
      r.g(this.sTg).stopTimer();
      AppMethodBeat.o(4603);
    }
    while (true)
    {
      return bool;
      if (r.fc(ah.getContext()))
      {
        this.sTg.ad(r.e(this.sTg).wem, r.e(this.sTg).wen);
        this.sTg.b(r.e(this.sTg));
        r.h(this.sTg);
        r.f(this.sTg);
        r.g(this.sTg).stopTimer();
        h.pYm.a(500L, 5L, 1L, false);
        AppMethodBeat.o(4603);
      }
      else if (System.currentTimeMillis() - r.i(this.sTg) < 60000L)
      {
        bool = true;
        AppMethodBeat.o(4603);
      }
      else
      {
        r.h(this.sTg);
        r.f(this.sTg);
        r.g(this.sTg).stopTimer();
        AppMethodBeat.o(4603);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.r.3
 * JD-Core Version:    0.6.2
 */