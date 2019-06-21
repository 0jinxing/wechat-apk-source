package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.b;

final class VoipMgr$18
  implements Runnable
{
  VoipMgr$18(VoipMgr paramVoipMgr)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4480);
    b.cIj().sSP.stopRing();
    if (VoipMgr.e(this.sSn))
    {
      b.cIj().Gx(0);
      AppMethodBeat.o(4480);
    }
    while (true)
    {
      return;
      b.cIj().Gx(1);
      AppMethodBeat.o(4480);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.18
 * JD-Core Version:    0.6.2
 */