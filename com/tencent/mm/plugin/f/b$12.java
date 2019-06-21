package com.tencent.mm.plugin.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.al;

final class b$12
  implements Runnable
{
  b$12(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18592);
    if (b.f(this.jZY) != null)
    {
      if (b.d(this.jZY) != null)
      {
        b.d(this.jZY);
        al.af(b.f(this.jZY));
      }
      b.f(this.jZY).isStop = true;
      b.b(this.jZY, null);
      h.pYm.a(664L, 2L, 1L, false);
    }
    if (b.h(this.jZY) != null)
      b.h(this.jZY).isStop = true;
    AppMethodBeat.o(18592);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.12
 * JD-Core Version:    0.6.2
 */