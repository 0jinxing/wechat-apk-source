package com.tencent.mm.pluginsdk.g.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class u
  implements ThreadFactory
{
  private static final AtomicInteger vfG;
  private final AtomicInteger cmf;
  private String cmg;

  static
  {
    AppMethodBeat.i(79640);
    vfG = new AtomicInteger(1);
    AppMethodBeat.o(79640);
  }

  public u()
  {
    this("ResDownloaderPool", "ResDownloaderThread");
  }

  public u(String paramString1, String paramString2)
  {
    AppMethodBeat.i(79638);
    this.cmf = new AtomicInteger(1);
    this.cmg = String.format("%s-%d-%s-", new Object[] { paramString1, Integer.valueOf(vfG.getAndIncrement()), paramString2 });
    AppMethodBeat.o(79638);
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(79639);
    paramRunnable = d.a(paramRunnable, this.cmg + this.cmf.getAndIncrement(), 1);
    if (paramRunnable.isDaemon())
      paramRunnable.setDaemon(false);
    AppMethodBeat.o(79639);
    return paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.u
 * JD-Core Version:    0.6.2
 */