package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipMgr$4$1
  implements Runnable
{
  VoipMgr$4$1(VoipMgr.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4460);
    VoipMgr.b(this.sSo.sSn, true);
    AppMethodBeat.o(4460);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.4.1
 * JD-Core Version:    0.6.2
 */