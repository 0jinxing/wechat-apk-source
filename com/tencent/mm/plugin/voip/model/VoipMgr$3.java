package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipMgr$3
  implements Runnable
{
  VoipMgr$3(VoipMgr paramVoipMgr)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4459);
    VoipMgr.t(this.sSn);
    AppMethodBeat.o(4459);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.3
 * JD-Core Version:    0.6.2
 */