package com.tencent.mm.plugin.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.al;

public final class b$7
  implements Runnable
{
  public b$7(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18586);
    b.a(this.jZY, false);
    if (b.b(this.jZY) != null)
    {
      if (b.d(this.jZY) != null)
      {
        b.d(this.jZY);
        al.af(b.b(this.jZY));
      }
      b.b(this.jZY).isStop = true;
      b.a(this.jZY, null);
      h.pYm.a(664L, 8L, 1L, false);
    }
    AppMethodBeat.o(18586);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.7
 * JD-Core Version:    0.6.2
 */