package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.f;

final class ar$1
  implements Runnable
{
  ar$1(ar paramar)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36644);
    if (this.qNb.fWa != null)
      this.qNb.fWa.stop();
    this.qNb.fWa = null;
    AppMethodBeat.o(36644);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ar.1
 * JD-Core Version:    0.6.2
 */