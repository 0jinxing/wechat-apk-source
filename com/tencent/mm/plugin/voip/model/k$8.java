package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.sdk.platformtools.ap.a;

final class k$8
  implements ap.a
{
  k$8(k paramk)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(4398);
    if (this.sPI.mStatus == 4)
    {
      a.Logi("MicroMsg.Voip.VoipContext", "connect time out.. now finish..");
      this.sPI.sPp.sVH.sQe = 105;
      this.sPI.v(1, -9000, "");
    }
    AppMethodBeat.o(4398);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.k.8
 * JD-Core Version:    0.6.2
 */