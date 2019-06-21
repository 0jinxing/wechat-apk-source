package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipMgr$9
  implements Runnable
{
  VoipMgr$9(VoipMgr paramVoipMgr)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4468);
    VoipMgr.G(this.sSn);
    AppMethodBeat.o(4468);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.9
 * JD-Core Version:    0.6.2
 */