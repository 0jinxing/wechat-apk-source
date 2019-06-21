package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import java.util.Set;

final class b$1
  implements Runnable
{
  b$1(b paramb, b.b paramb1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36099);
    b localb = this.qHQ;
    b.b localb1 = this.qHP;
    localb.epg.add(localb1);
    int i = b.qHB + 1;
    b.qHB = i;
    if (i <= 1)
    {
      g.RQ();
      g.RO().eJo.a(208, localb);
    }
    AppMethodBeat.o(36099);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.b.1
 * JD-Core Version:    0.6.2
 */