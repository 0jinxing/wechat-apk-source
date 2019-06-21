package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class ar$8
  implements Runnable
{
  ar$8(ar paramar)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36652);
    if (this.qNb.qMW != null)
    {
      ab.i("MicroMsg.SnsVideoService", "download video finish cdnmediaId %s", new Object[] { this.qNb.qMW.fUL });
      this.qNb.qMY.remove(this.qNb.qMW.fUL);
    }
    this.qNb.qMW = null;
    this.qNb.col();
    AppMethodBeat.o(36652);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ar.8
 * JD-Core Version:    0.6.2
 */