package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class d$a
{
  private Lock aCZ;
  private LinkedBlockingQueue<d> oxI;
  private final int oxJ;
  private Callable<d> oxK;
  private volatile int size;

  public d$a(int paramInt, Callable<d> paramCallable)
  {
    AppMethodBeat.i(3637);
    this.size = 0;
    this.aCZ = new ReentrantLock();
    this.oxJ = paramInt;
    this.oxI = new LinkedBlockingQueue(paramInt);
    this.oxK = paramCallable;
    AppMethodBeat.o(3637);
  }

  private d bQe()
  {
    AppMethodBeat.i(3639);
    Object localObject;
    if (this.oxK == null)
    {
      localObject = new IllegalStateException("fetcher generator can not be null.");
      AppMethodBeat.o(3639);
      throw ((Throwable)localObject);
    }
    long l = bo.yz();
    try
    {
      localObject = (d)this.oxK.call();
      ab.d("FetcherPool", "time flee, construct fetcher instance cost %d", new Object[] { Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(3639);
      return localObject;
    }
    catch (Exception localException)
    {
      ab.printErrStackTrace("FetcherPool", localException, " fetcher generater call error %s", new Object[] { localException.getMessage() });
      AppMethodBeat.o(3639);
      throw localException;
    }
  }

  public final void a(d paramd)
  {
    AppMethodBeat.i(3640);
    ab.d("FetcherPool", "reuseFetcher");
    if (paramd == null)
    {
      ab.e("FetcherPool", "Null object can not be reused.");
      AppMethodBeat.o(3640);
    }
    while (true)
    {
      return;
      if (this.oxI == null)
      {
        paramd.release();
        AppMethodBeat.o(3640);
      }
      else
      {
        if (this.oxI.contains(paramd))
        {
          paramd = new IllegalStateException("fetcher already in pool");
          AppMethodBeat.o(3640);
          throw paramd;
        }
        this.oxI.offer(paramd);
        AppMethodBeat.o(3640);
      }
    }
  }

  public final d bQd()
  {
    d locald = null;
    AppMethodBeat.i(3638);
    long l = bo.yz();
    ab.d("FetcherPool", "acquireFetcher");
    if (this.oxI == null)
    {
      ab.d("FetcherPool", "acquireFetcher no pool directly return null");
      AppMethodBeat.o(3638);
    }
    while (true)
    {
      return locald;
      this.aCZ.lock();
      ab.d("FetcherPool", "pool.size() %d, size %d, maxFetcherSize %d", new Object[] { Integer.valueOf(this.oxI.size()), Integer.valueOf(this.size), Integer.valueOf(this.oxJ) });
      if (this.oxI != null)
        break;
      this.aCZ.unlock();
      AppMethodBeat.o(3638);
    }
    if ((this.oxI.isEmpty()) && (this.size < this.oxJ))
    {
      ab.d("FetcherPool", "new fetcher");
      this.size += 1;
      this.aCZ.unlock();
    }
    for (locald = bQe(); ; locald = (d)this.oxI.poll(5L, TimeUnit.SECONDS))
    {
      ab.d("FetcherPool", "time flee, acquireFetcher cost time %d", new Object[] { Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(3638);
      break;
      ab.d("FetcherPool", "waiting fetcher");
      this.aCZ.unlock();
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(3641);
    if (this.oxI == null)
      AppMethodBeat.o(3641);
    while (true)
    {
      return;
      this.aCZ.lock();
      if (this.oxI == null)
      {
        this.aCZ.unlock();
        AppMethodBeat.o(3641);
        continue;
      }
      try
      {
        Iterator localIterator = this.oxI.iterator();
        while (localIterator.hasNext())
          ((d)localIterator.next()).release();
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("FetcherPool", localException, "destroy fetcher %s", new Object[] { localException.getMessage() });
        this.oxI = null;
        this.aCZ.unlock();
        AppMethodBeat.o(3641);
        continue;
        this.oxI = null;
        this.aCZ.unlock();
        AppMethodBeat.o(3641);
      }
      finally
      {
        this.oxI = null;
        this.aCZ.unlock();
        AppMethodBeat.o(3641);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.d.a
 * JD-Core Version:    0.6.2
 */