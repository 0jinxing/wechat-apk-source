package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class i$1$1
  implements Runnable
{
  i$1$1(i.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78282);
    ab.i("MicroMsg.ImgService", "on image upload end. queue size : " + i.a(this.fER.fEQ).size());
    i.a(this.fER.fEQ, false);
    if (i.a(this.fER.fEQ).size() > 0)
    {
      l locall = (l)i.a(this.fER.fEQ).poll();
      if (locall != null)
      {
        ab.i("MicroMsg.ImgService", "upload image scene hashcode : " + locall.hashCode());
        g.RO().eJo.a(locall, 0);
        i.a(this.fER.fEQ, true);
        AppMethodBeat.o(78282);
      }
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.ImgService", "poll image scene is null");
      AppMethodBeat.o(78282);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.i.1.1
 * JD-Core Version:    0.6.2
 */