package com.tencent.mm.plugin.cdndownloader.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g;
import com.tencent.mm.i.g.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class a$3
  implements Runnable
{
  a$3(a parama, String paramString, d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(878);
    g localg = (g)a.d(this.ktc).get(this.IN);
    if (localg == null)
    {
      ab.e("MicroMsg.CdnDownloadNativeService", " task in jni get info failed mediaid:%s", new Object[] { this.IN });
      AppMethodBeat.o(878);
    }
    while (true)
    {
      return;
      if (localg.egz != null)
        localg.egz.a(this.IN, this.fyV);
      AppMethodBeat.o(878);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.c.a.3
 * JD-Core Version:    0.6.2
 */