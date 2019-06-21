package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.concurrent.CopyOnWriteArraySet;

final class g$2
  implements ap.a
{
  g$2(g paramg)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(2453);
    g localg = this.kNy;
    com.tencent.mm.kernel.g.RS().aa(new g.3(localg));
    localg = this.kNy;
    int i;
    if ((localg.kNw == null) || (localg.kNw.size() == 0))
    {
      i = 1;
      if (i != 0)
        break label83;
      this.kNy.gyS.ae(1000L, 1000L);
      AppMethodBeat.o(2453);
    }
    while (true)
    {
      return false;
      i = 0;
      break;
      label83: ab.d("MicroMsg.FileDownloaderImpl23", "timer stop");
      AppMethodBeat.o(2453);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.g.2
 * JD-Core Version:    0.6.2
 */