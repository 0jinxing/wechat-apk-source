package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class n$3
  implements c.a
{
  n$3(n paramn)
  {
  }

  public final void WU()
  {
    AppMethodBeat.i(76631);
    ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "onPcmReady");
    if (this.owL.WL() != d.c.ovI)
    {
      ab.w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "not MediaStatus.Initialized, maybe canceled by user");
      AppMethodBeat.o(76631);
    }
    while (true)
    {
      return;
      this.owL.owH.start();
      this.owL.fcQ.a(d.c.ovB);
      AppMethodBeat.o(76631);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.n.3
 * JD-Core Version:    0.6.2
 */