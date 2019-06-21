package com.tencent.mm.al;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g;
import com.tencent.mm.i.g.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class b$8
  implements Runnable
{
  b$8(b paramb, String paramString, d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78042);
    g localg = (g)this.fyR.fyM.get(this.IN);
    if (localg == null)
    {
      ab.d("MicroMsg.CdnTransportService", " task in jni get info failed mediaid:%s", new Object[] { this.IN });
      AppMethodBeat.o(78042);
    }
    while (true)
    {
      return;
      if (localg.egz != null)
        localg.egz.a(this.IN, this.fyV);
      AppMethodBeat.o(78042);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.b.8
 * JD-Core Version:    0.6.2
 */