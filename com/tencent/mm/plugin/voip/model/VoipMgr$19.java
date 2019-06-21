package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.a.c;
import com.tencent.mm.plugin.voip.ui.b;

final class VoipMgr$19
  implements Runnable
{
  VoipMgr$19(VoipMgr paramVoipMgr, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4481);
    if (VoipMgr.q(this.sSn) != null)
      VoipMgr.q(this.sSn).fY(this.cgR, VoipMgr.a(this.sSn).mState);
    AppMethodBeat.o(4481);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.19
 * JD-Core Version:    0.6.2
 */