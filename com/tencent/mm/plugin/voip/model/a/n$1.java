package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;

final class n$1
  implements Runnable
{
  n$1(n paramn, int paramInt1, int paramInt2, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4738);
    if (this.sTU.ehi != null)
      this.sTU.ehi.onSceneEnd(this.crc, this.crd, this.ftO, this.sTU);
    AppMethodBeat.o(4738);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.n.1
 * JD-Core Version:    0.6.2
 */