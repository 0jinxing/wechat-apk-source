package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import java.util.Set;

final class b$2
  implements Runnable
{
  b$2(b paramb, b.b paramb1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36100);
    b localb = this.qHQ;
    b.b localb1 = this.qHP;
    localb.epg.remove(localb1);
    int i = b.qHB - 1;
    b.qHB = i;
    if (i <= 0)
    {
      g.RQ();
      g.RO().eJo.b(208, localb);
    }
    AppMethodBeat.o(36100);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.b.2
 * JD-Core Version:    0.6.2
 */