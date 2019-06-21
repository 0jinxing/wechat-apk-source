package com.tencent.mm.ipcinvoker;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ExecutorService;

class m
{
  private static volatile m eGk;
  private static com.tencent.mm.ipcinvoker.a.b eGl;
  ExecutorService mExecutorService;
  private Handler mHandler;

  static
  {
    AppMethodBeat.i(114069);
    eGl = new m.a();
    AppMethodBeat.o(114069);
  }

  private m()
  {
    AppMethodBeat.i(114066);
    HandlerThread localHandlerThread = new HandlerThread("ThreadPool#WorkerThread-" + hashCode());
    localHandlerThread.start();
    Handler localHandler = new Handler(localHandlerThread.getLooper());
    localHandler.post(new m.1(this, localHandlerThread));
    this.mHandler = localHandler;
    this.mExecutorService = eGl.PS();
    com.tencent.mm.ipcinvoker.h.b.i("IPC.ThreadPool", "initialize IPCInvoker ThreadPool(hashCode : %s)", new Object[] { Integer.valueOf(hashCode()) });
    AppMethodBeat.o(114066);
  }

  private static m PQ()
  {
    AppMethodBeat.i(114064);
    if (eGk == null);
    try
    {
      if (eGk == null)
      {
        localm = new com/tencent/mm/ipcinvoker/m;
        localm.<init>();
        eGk = localm;
      }
      m localm = eGk;
      AppMethodBeat.o(114064);
      return localm;
    }
    finally
    {
      AppMethodBeat.o(114064);
    }
  }

  static m PR()
  {
    AppMethodBeat.i(114065);
    m localm = new m();
    AppMethodBeat.o(114065);
    return localm;
  }

  public static boolean post(Runnable paramRunnable)
  {
    AppMethodBeat.i(114067);
    PQ().mExecutorService.execute(paramRunnable);
    AppMethodBeat.o(114067);
    return true;
  }

  public static boolean t(Runnable paramRunnable)
  {
    AppMethodBeat.i(114068);
    boolean bool = PQ().mHandler.postDelayed(paramRunnable, 2000L);
    AppMethodBeat.o(114068);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.m
 * JD-Core Version:    0.6.2
 */