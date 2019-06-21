package com.tencent.mm.plugin.appbrand.r;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.vending.h.d;
import com.tencent.mm.vending.h.g;
import com.tencent.mm.vending.h.h;

public final class m
{
  private static volatile al ftB;
  private static final Object iRa;
  private static Handler sMainHandler;

  static
  {
    AppMethodBeat.i(91176);
    iRa = new Object();
    sMainHandler = null;
    AppMethodBeat.o(91176);
  }

  public static void aNR()
  {
    AppMethodBeat.i(91173);
    if (ftB == null)
      AppMethodBeat.o(91173);
    while (true)
    {
      return;
      synchronized (iRa)
      {
        if (ftB != null)
        {
          g.asT("SubCoreAppBrand#WorkerThread");
          ftB.oAl.quit();
          ftB = null;
        }
        AppMethodBeat.o(91173);
      }
    }
  }

  public static al aNS()
  {
    AppMethodBeat.i(91174);
    if (ftB == null);
    synchronized (iRa)
    {
      if (ftB == null)
      {
        Object localObject2 = new com/tencent/mm/sdk/platformtools/al;
        ((al)localObject2).<init>("SubCoreAppBrand#WorkerThread");
        ftB = (al)localObject2;
        localObject2 = new com/tencent/mm/vending/h/h;
        ((h)localObject2).<init>(ftB.oAl.getLooper(), "SubCoreAppBrand#WorkerThread");
        g.a("SubCoreAppBrand#WorkerThread", (d)localObject2);
      }
      ??? = ftB;
      AppMethodBeat.o(91174);
      return ???;
    }
  }

  public static void runOnUiThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(91175);
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      paramRunnable.run();
      AppMethodBeat.o(91175);
    }
    while (true)
    {
      return;
      if (sMainHandler == null)
        sMainHandler = new Handler(Looper.getMainLooper());
      sMainHandler.post(paramRunnable);
      AppMethodBeat.o(91175);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r.m
 * JD-Core Version:    0.6.2
 */