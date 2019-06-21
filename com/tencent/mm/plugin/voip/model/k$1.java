package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class k$1
  implements ap.a
{
  k$1(k paramk)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(4391);
    ab.v("MicroMsg.Voip.VoipContext", "voip repeat sync");
    this.sPI.sPs.a(null, false, 7);
    AppMethodBeat.o(4391);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.k.1
 * JD-Core Version:    0.6.2
 */