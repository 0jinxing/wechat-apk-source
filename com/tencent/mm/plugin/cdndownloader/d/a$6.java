package com.tencent.mm.plugin.cdndownloader.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$6
  implements Runnable
{
  a$6(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(898);
    synchronized (a.alU())
    {
      ab.i("MicroMsg.CDNDownloadClient", "queryDownloadTaskSync, notify after 10000ms");
      a.alU().notifyAll();
      AppMethodBeat.o(898);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.d.a.6
 * JD-Core Version:    0.6.2
 */