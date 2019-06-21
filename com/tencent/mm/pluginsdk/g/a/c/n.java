package com.tencent.mm.pluginsdk.g.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.y;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class n extends f<l>
{
  private final f<l>.a vfp;
  protected final c vfq;

  public n(u paramu, c paramc)
  {
    this(paramu, paramc, (byte)0);
  }

  private n(u paramu, c paramc, byte paramByte)
  {
    AppMethodBeat.i(79597);
    this.vfp = new f.a(this, 4, 4, 3000L, TimeUnit.MILLISECONDS, new n.c(), paramu);
    this.vfp.setKeepAliveTime(30000L, TimeUnit.MILLISECONDS);
    this.vfp.allowCoreThreadTimeOut(true);
    this.vfq = paramc;
    AppMethodBeat.o(79597);
  }

  protected f.d a(l paraml)
  {
    AppMethodBeat.i(79600);
    ab.i("MicroMsg.ResDownloader.NetworkWorker", "request.class = " + paraml.getClass().getSimpleName());
    q.a.diy();
    n.a locala = q.c(paraml);
    Object localObject = locala;
    if (locala == null)
    {
      ab.i("MicroMsg.ResDownloader.NetworkWorker", "get null handler from plugin, use default handler");
      localObject = new n.b(paraml);
    }
    ((n.a)localObject).vft = this.vfq;
    AppMethodBeat.o(79600);
    return localObject;
  }

  final void ajf(String paramString)
  {
    AppMethodBeat.i(79599);
    Future localFuture = (Future)this.veZ.remove(paramString);
    if (localFuture != null)
      localFuture.cancel(true);
    this.pendingRequests.remove(paramString);
    AppMethodBeat.o(79599);
  }

  protected int b(l paraml)
  {
    int i = 0;
    int j = 1;
    AppMethodBeat.i(79598);
    int k;
    if ((ajd(paraml.vdC)) || (ajc(paraml.vdC)))
    {
      ab.i("MicroMsg.ResDownloader.NetworkWorker", "urlKey = %s is already queueing, skip repeated task", new Object[] { paraml.vdC });
      AppMethodBeat.o(79598);
      k = 0;
    }
    while (true)
    {
      return k;
      k = y.Me();
      ab.i("MicroMsg.ResDownloader.NetworkWorker", "currentNetType(%d), requestNetType(%d)", new Object[] { Integer.valueOf(k), Integer.valueOf(paraml.networkType) });
      if (k != 0)
        if (2 == paraml.networkType)
          k = 1;
      while (true)
      {
        if (k != 0)
          break label162;
        ab.i("MicroMsg.ResDownloader.NetworkWorker", "urlKey = %s, mismatch networkType , skip task", new Object[] { paraml.vdC });
        AppMethodBeat.o(79598);
        k = j;
        break;
        if (k == 1)
          k = 1;
        else
          k = 0;
      }
      label162: if ((!this.vfp.isShutdown()) && (!this.vfp.isTerminated()))
      {
        k = i;
        if (!this.vfp.isTerminating());
      }
      else
      {
        k = 1;
      }
      if (k != 0)
      {
        k = 4;
        AppMethodBeat.o(79598);
      }
      else
      {
        super.b(paraml);
        AppMethodBeat.o(79598);
        k = 2;
      }
    }
  }

  protected final f<l>.a dik()
  {
    return this.vfp;
  }

  public void shutdown()
  {
    AppMethodBeat.i(79601);
    this.vfp.shutdownNow();
    Iterator localIterator = this.veZ.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (Future)this.veZ.get(localObject);
      if (localObject != null)
        ((Future)localObject).cancel(true);
    }
    this.pendingRequests.clear();
    this.veZ.clear();
    AppMethodBeat.o(79601);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.n
 * JD-Core Version:    0.6.2
 */