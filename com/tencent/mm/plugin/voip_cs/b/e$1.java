package com.tencent.mm.plugin.voip_cs.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class e$1
  implements ap.a
{
  e$1(e parame)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(135304);
    ab.v("MicroMsg.voipcs.VoipCSService", "voipcs repeat sync");
    this.tdS.cMl();
    AppMethodBeat.o(135304);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.e.1
 * JD-Core Version:    0.6.2
 */