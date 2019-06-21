package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class s$4
  implements ap.a
{
  s$4(s params)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(4646);
    ab.i("MicroMsg.Voip.VoipServiceEx", "voip called out of time,now destroy...");
    if ((3 == this.sTw.sNl.mStatus) && (s.d(this.sTw) != 0) && (s.d(this.sTw) == this.sTw.sNl.sPp.nwu))
    {
      s.e(this.sTw);
      this.sTw.sNl.v(5, -9000, "");
    }
    AppMethodBeat.o(4646);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.s.4
 * JD-Core Version:    0.6.2
 */