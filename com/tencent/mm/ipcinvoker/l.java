package com.tencent.mm.ipcinvoker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ExecutorService;

public class l
{
  private static volatile l eGh;
  private Handler eGi;
  private m eGj;
  private Handler mHandler;
  private HandlerThread mHandlerThread;

  private l()
  {
    AppMethodBeat.i(114050);
    this.mHandlerThread = new HandlerThread("ThreadCaller#Worker-" + hashCode());
    this.mHandlerThread.start();
    this.mHandler = new Handler(this.mHandlerThread.getLooper());
    this.eGi = new Handler(Looper.getMainLooper());
    this.eGj = m.PR();
    AppMethodBeat.o(114050);
  }

  private static l PP()
  {
    AppMethodBeat.i(114049);
    if (eGh == null);
    try
    {
      if (eGh == null)
      {
        locall = new com/tencent/mm/ipcinvoker/l;
        locall.<init>();
        eGh = locall;
      }
      l locall = eGh;
      AppMethodBeat.o(114049);
      return locall;
    }
    finally
    {
      AppMethodBeat.o(114049);
    }
  }

  public static boolean post(Runnable paramRunnable)
  {
    AppMethodBeat.i(114051);
    boolean bool = PP().mHandler.post(paramRunnable);
    AppMethodBeat.o(114051);
    return bool;
  }

  public static boolean postDelayed(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(114052);
    boolean bool = PP().mHandler.postDelayed(paramRunnable, paramLong);
    AppMethodBeat.o(114052);
    return bool;
  }

  public static boolean q(Runnable paramRunnable)
  {
    AppMethodBeat.i(114053);
    boolean bool = PP().eGi.post(paramRunnable);
    AppMethodBeat.o(114053);
    return bool;
  }

  public static boolean r(Runnable paramRunnable)
  {
    AppMethodBeat.i(114054);
    boolean bool = PP().eGi.postDelayed(paramRunnable, 100L);
    AppMethodBeat.o(114054);
    return bool;
  }

  public static boolean s(Runnable paramRunnable)
  {
    AppMethodBeat.i(114055);
    PP().eGj.mExecutorService.execute(paramRunnable);
    AppMethodBeat.o(114055);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.l
 * JD-Core Version:    0.6.2
 */