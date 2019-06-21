package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipMgr$7
  implements Runnable
{
  VoipMgr$7(VoipMgr paramVoipMgr, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4466);
    VoipMgr.f(this.sSn, this.sSs);
    AppMethodBeat.o(4466);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.7
 * JD-Core Version:    0.6.2
 */