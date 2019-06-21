package com.tencent.tencentmap.mapsdk.a;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ag;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class b$a extends b
{
  private ScheduledExecutorService b;
  private SparseArray<ScheduledFuture<?>> c;

  public b$a()
  {
    AppMethodBeat.i(97764);
    this.b = null;
    this.c = null;
    this.b = Executors.newScheduledThreadPool(3);
    this.c = new SparseArray();
    AppMethodBeat.o(97764);
  }

  public final void a(int paramInt)
  {
    try
    {
      AppMethodBeat.i(97767);
      ScheduledFuture localScheduledFuture = (ScheduledFuture)this.c.get(paramInt);
      if ((localScheduledFuture != null) && (!localScheduledFuture.isCancelled()))
      {
        ag.b("cancel a old future!", new Object[0]);
        localScheduledFuture.cancel(true);
      }
      this.c.remove(paramInt);
      AppMethodBeat.o(97767);
      return;
    }
    finally
    {
    }
  }

  public final void a(int paramInt, Runnable paramRunnable, long paramLong1, long paramLong2)
  {
    long l = 0L;
    label136: 
    while (true)
    {
      try
      {
        AppMethodBeat.i(97766);
        if (paramRunnable == null)
        {
          ag.d("task runner should not be null", new Object[0]);
          AppMethodBeat.o(97766);
          return;
        }
        if (paramLong1 > 0L)
          l = paramLong1;
        if (!a)
          break label136;
        if (paramLong2 > 10000L)
        {
          a(paramInt);
          paramRunnable = this.b.scheduleAtFixedRate(paramRunnable, l, paramLong2, TimeUnit.MILLISECONDS);
          if (paramRunnable != null)
          {
            ag.b("add a new future! taskId: %d , periodTime: %d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong2) });
            this.c.put(paramInt, paramRunnable);
          }
          AppMethodBeat.o(97766);
          continue;
        }
      }
      finally
      {
      }
      paramLong2 = 10000L;
    }
  }

  public final void a(Runnable paramRunnable)
  {
    try
    {
      AppMethodBeat.i(97765);
      if (paramRunnable == null)
      {
        ag.d("task runner should not be null", new Object[0]);
        AppMethodBeat.o(97765);
      }
      while (true)
      {
        return;
        this.b.execute(paramRunnable);
        AppMethodBeat.o(97765);
      }
    }
    finally
    {
    }
    throw paramRunnable;
  }

  public final void a(Runnable paramRunnable, long paramLong)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(97768);
        if (paramRunnable == null)
        {
          ag.d("task runner should not be null", new Object[0]);
          AppMethodBeat.o(97768);
          return;
        }
        if (paramLong > 0L)
        {
          this.b.schedule(paramRunnable, paramLong, TimeUnit.MILLISECONDS);
          AppMethodBeat.o(97768);
          continue;
        }
      }
      finally
      {
      }
      paramLong = 0L;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.b.a
 * JD-Core Version:    0.6.2
 */