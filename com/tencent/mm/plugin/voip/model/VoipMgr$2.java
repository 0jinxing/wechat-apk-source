package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class VoipMgr$2
  implements Runnable
{
  VoipMgr$2(VoipMgr paramVoipMgr)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4458);
    VoipMgr.c(this.sSn, VoipMgr.k(this.sSn));
    VoipMgr.s(this.sSn).postDelayed(this, 5000L);
    AppMethodBeat.o(4458);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.2
 * JD-Core Version:    0.6.2
 */