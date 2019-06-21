package com.tencent.mm.ce;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ak;

public class a
{
  private static volatile a ydx;
  private ak mHandler;
  private HandlerThread mHandlerThread;
  private ak ydy;

  private a()
  {
    AppMethodBeat.i(65379);
    this.mHandlerThread = d.anM("WorkerThread#" + hashCode());
    this.mHandlerThread.start();
    this.mHandler = new ak(this.mHandlerThread.getLooper());
    this.ydy = new ak(Looper.getMainLooper());
    AppMethodBeat.o(65379);
  }

  private static a dvP()
  {
    AppMethodBeat.i(65378);
    if (ydx == null);
    try
    {
      if (ydx == null)
      {
        locala = new com/tencent/mm/ce/a;
        locala.<init>();
        ydx = locala;
      }
      a locala = ydx;
      AppMethodBeat.o(65378);
      return locala;
    }
    finally
    {
      AppMethodBeat.o(65378);
    }
  }

  public static HandlerThread dvQ()
  {
    AppMethodBeat.i(65380);
    HandlerThread localHandlerThread = dvP().mHandlerThread;
    AppMethodBeat.o(65380);
    return localHandlerThread;
  }

  public static boolean post(Runnable paramRunnable)
  {
    AppMethodBeat.i(65381);
    boolean bool = dvP().mHandler.post(paramRunnable);
    AppMethodBeat.o(65381);
    return bool;
  }

  public static boolean postDelayed(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(65382);
    boolean bool = dvP().mHandler.postDelayed(paramRunnable, paramLong);
    AppMethodBeat.o(65382);
    return bool;
  }

  public static boolean q(Runnable paramRunnable)
  {
    AppMethodBeat.i(65383);
    boolean bool = dvP().ydy.post(paramRunnable);
    AppMethodBeat.o(65383);
    return bool;
  }

  public static boolean r(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(65384);
    boolean bool = dvP().ydy.postDelayed(paramRunnable, paramLong);
    AppMethodBeat.o(65384);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ce.a
 * JD-Core Version:    0.6.2
 */