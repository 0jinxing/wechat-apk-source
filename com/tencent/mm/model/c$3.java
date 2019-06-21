package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.g.d;

final class c$3
  implements com.tencent.mm.kernel.api.f
{
  c$3(c paramc)
  {
  }

  public final void RV()
  {
    AppMethodBeat.i(16201);
    aw.ZJ();
    AppMethodBeat.o(16201);
  }

  public final void lM(String paramString)
  {
    AppMethodBeat.i(16202);
    if (com.tencent.mm.compatible.util.f.Mn())
    {
      g.RQ();
      if (g.RP().eJL.equals(com.tencent.mm.compatible.util.e.eSn))
      {
        g.RQ();
        d.post(new c.b(g.RP().cachePath, paramString), "AccountStorage_moveDataFiles");
      }
    }
    AppMethodBeat.o(16202);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.c.3
 * JD-Core Version:    0.6.2
 */