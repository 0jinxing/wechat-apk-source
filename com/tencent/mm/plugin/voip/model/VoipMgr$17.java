package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.a;
import com.tencent.mm.sdk.platformtools.ab;

final class VoipMgr$17
  implements Runnable
{
  VoipMgr$17(VoipMgr paramVoipMgr)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4479);
    ab.d("MicroMsg.Voip.VoipMgr", "mCaptureRender == " + VoipMgr.c(this.sSn));
    if (VoipMgr.c(this.sSn) != null)
      VoipMgr.c(this.sSn).cLC();
    AppMethodBeat.o(4479);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.17
 * JD-Core Version:    0.6.2
 */