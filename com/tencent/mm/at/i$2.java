package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class i$2
  implements Runnable
{
  i$2(i parami, l paraml)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78284);
    ab.i("MicroMsg.ImgService", "offer to queue ? %b, scene hashcode %d", new Object[] { Boolean.valueOf(i.b(this.fEQ)), Integer.valueOf(this.fES.hashCode()) });
    if (i.b(this.fEQ))
    {
      i.a(this.fEQ).offer(this.fES);
      AppMethodBeat.o(78284);
    }
    while (true)
    {
      return;
      g.RO().eJo.a(this.fES, 0);
      i.a(this.fEQ, true);
      AppMethodBeat.o(78284);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.i.2
 * JD-Core Version:    0.6.2
 */