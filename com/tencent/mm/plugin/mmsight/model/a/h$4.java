package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c;
import com.tencent.mm.sdk.platformtools.ab;

final class h$4
  implements Runnable
{
  h$4(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(76577);
    try
    {
      h.a(this.owg);
      if ((this.owg.coZ != null) && (!this.owg.ovT))
      {
        this.owg.coZ.EB();
        this.owg.coZ = null;
      }
      AppMethodBeat.o(76577);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMSightAACMediaCodecRecorder", "delay to stop encoder error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(76577);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.h.4
 * JD-Core Version:    0.6.2
 */