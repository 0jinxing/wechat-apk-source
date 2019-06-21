package com.tencent.mm.plugin.wepkg.downloader;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.u;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class b
{
  public static Object lock;
  private static volatile b uVM;
  h uVN;

  static
  {
    AppMethodBeat.i(63420);
    lock = new Object();
    AppMethodBeat.o(63420);
  }

  private b()
  {
    AppMethodBeat.i(63419);
    this.uVN = new h(TimeUnit.MILLISECONDS, new LinkedBlockingQueue(24), new u("WepkgDownloaderPool", "WepkgDownloaderThread"));
    AppMethodBeat.o(63419);
  }

  public static b dgu()
  {
    AppMethodBeat.i(63418);
    if (uVM == null);
    synchronized (lock)
    {
      if (uVM == null)
      {
        b localb = new com/tencent/mm/plugin/wepkg/downloader/b;
        localb.<init>();
        uVM = localb;
      }
      ??? = uVM;
      AppMethodBeat.o(63418);
      return ???;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.downloader.b
 * JD-Core Version:    0.6.2
 */