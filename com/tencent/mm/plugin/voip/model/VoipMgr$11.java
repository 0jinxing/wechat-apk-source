package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.a;

final class VoipMgr$11
  implements Runnable
{
  VoipMgr$11(VoipMgr paramVoipMgr, int[] paramArrayOfInt, boolean paramBoolean, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4470);
    if (VoipMgr.c(this.sSn) != null)
      VoipMgr.c(this.sSn).y(this.sSt);
    if (VoipMgr.q(this.sSn) != null)
      VoipMgr.q(this.sSn);
    AppMethodBeat.o(4470);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.11
 * JD-Core Version:    0.6.2
 */