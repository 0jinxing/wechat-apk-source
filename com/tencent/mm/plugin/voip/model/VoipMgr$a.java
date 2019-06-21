package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipMgr$a
  implements Runnable
{
  VoipMgr$a(VoipMgr paramVoipMgr)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4483);
    VoipMgr.u(this.sSn);
    VoipMgr.v(this.sSn);
    AppMethodBeat.o(4483);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.a
 * JD-Core Version:    0.6.2
 */