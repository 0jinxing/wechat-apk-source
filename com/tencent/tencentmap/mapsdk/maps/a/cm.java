package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

public final class cm
{
  private static cm a;
  private Timer b;
  private Map<Runnable, TimerTask> c;

  static
  {
    AppMethodBeat.i(98653);
    a = new cm();
    AppMethodBeat.o(98653);
  }

  private cm()
  {
    AppMethodBeat.i(98648);
    this.c = new ConcurrentHashMap();
    this.b = new Timer("halley_" + bt.c() + "_" + "ConnectionTimer", true);
    AppMethodBeat.o(98648);
  }

  public static cm a()
  {
    return a;
  }

  private void a(Runnable paramRunnable, boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(98651);
    try
    {
      a(paramRunnable);
      cn localcn = new com/tencent/tencentmap/mapsdk/maps/a/cn;
      localcn.<init>(this, paramRunnable);
      if (paramBoolean)
        this.b.schedule(localcn, paramLong, paramLong);
      while (true)
      {
        this.c.put(paramRunnable, localcn);
        return;
        this.b.schedule(localcn, paramLong);
      }
    }
    finally
    {
      AppMethodBeat.o(98651);
    }
  }

  public final void a(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(98649);
    a(paramRunnable, false, paramLong);
    AppMethodBeat.o(98649);
  }

  public final boolean a(Runnable paramRunnable)
  {
    AppMethodBeat.i(98652);
    try
    {
      TimerTask localTimerTask = (TimerTask)this.c.get(paramRunnable);
      boolean bool;
      if (localTimerTask != null)
      {
        this.c.remove(paramRunnable);
        bool = localTimerTask.cancel();
      }
      while (true)
      {
        return bool;
        bool = true;
        AppMethodBeat.o(98652);
      }
    }
    finally
    {
      AppMethodBeat.o(98652);
    }
  }

  public final void b(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(98650);
    a(paramRunnable, true, paramLong);
    AppMethodBeat.o(98650);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cm
 * JD-Core Version:    0.6.2
 */