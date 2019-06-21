package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ak;

public final class b
{
  private static ak hlg;
  private static ak hlh;
  private static ak hli;

  static
  {
    AppMethodBeat.i(10659);
    HandlerThread localHandlerThread = d.anM("DynamicPage#WorkerThread");
    localHandlerThread.start();
    hlg = new ak(localHandlerThread.getLooper());
    localHandlerThread = d.anM("DynamicPage#IPCThread");
    localHandlerThread.start();
    hlh = new ak(localHandlerThread.getLooper());
    hli = new ak(Looper.getMainLooper());
    AppMethodBeat.o(10659);
  }

  public static boolean D(Runnable paramRunnable)
  {
    AppMethodBeat.i(10656);
    boolean bool;
    if (paramRunnable == null)
    {
      bool = false;
      AppMethodBeat.o(10656);
    }
    while (true)
    {
      return bool;
      bool = hlg.post(paramRunnable);
      AppMethodBeat.o(10656);
    }
  }

  public static boolean E(Runnable paramRunnable)
  {
    AppMethodBeat.i(10658);
    boolean bool = hli.post(paramRunnable);
    AppMethodBeat.o(10658);
    return bool;
  }

  public static boolean j(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(10657);
    boolean bool;
    if (paramRunnable == null)
    {
      bool = false;
      AppMethodBeat.o(10657);
    }
    while (true)
    {
      return bool;
      bool = hlg.postDelayed(paramRunnable, paramLong);
      AppMethodBeat.o(10657);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.b
 * JD-Core Version:    0.6.2
 */