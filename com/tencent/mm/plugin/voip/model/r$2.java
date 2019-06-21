package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.f;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.model.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class r$2
  implements Runnable
{
  r$2(r paramr, int paramInt, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4602);
    ab.i("MicroMsg.Voip.VoipService", "onDelayInvite, roomId:%s, roomKey:%s", new Object[] { Integer.valueOf(this.sxo), Long.valueOf(this.sxp) });
    if ((!f.ME()) && (!r.fc(ah.getContext())))
    {
      ab.i("MicroMsg.Voip.VoipService", "background now and notification Is closed.");
      AppMethodBeat.o(4602);
    }
    while (true)
    {
      return;
      if (this.sTg.sSP.cKg())
      {
        ab.i("MicroMsg.Voip.VoipService", "room is ready, ingore the msg and ack busy");
        if ((this.sTg.sSP.sNl.sPp.nwu != this.sxo) && (this.sTg.sSP.sNl.sPp.nwv != this.sxp))
        {
          ab.i("MicroMsg.Voip.VoipService", "not match current room id and roomkey: %s %s %s %s", new Object[] { Integer.valueOf(this.sxo), Long.valueOf(this.sxp), Integer.valueOf(this.sTg.sSP.sNl.sPp.nwu), Long.valueOf(this.sTg.sSP.sNl.sPp.nwv) });
          s.a(this.sxo, this.sxp, 2, null, null, r.b(this.sTg));
        }
        AppMethodBeat.o(4602);
      }
      else
      {
        new e(this.sxo, this.sxp, "").cKw();
        if (!r.c(this.sTg))
        {
          a.c(this.sxo, this.sxp, 1, 2);
          r.d(this.sTg);
        }
        AppMethodBeat.o(4602);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.r.2
 * JD-Core Version:    0.6.2
 */