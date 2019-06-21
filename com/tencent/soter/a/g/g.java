package com.tencent.soter.a.g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.c.d;

public class g
{
  private static volatile g Awz = null;
  private Handler AvE;
  private Handler AwA;

  private g()
  {
    AppMethodBeat.i(10489);
    this.AwA = null;
    this.AvE = null;
    HandlerThread localHandlerThread = new HandlerThread("SoterGenKeyHandlerThreadName");
    localHandlerThread.start();
    if (localHandlerThread.getLooper() != null);
    for (this.AwA = new Handler(localHandlerThread.getLooper()); ; this.AwA = new Handler(Looper.getMainLooper()))
    {
      this.AvE = new Handler(Looper.getMainLooper());
      AppMethodBeat.o(10489);
      return;
      d.e("Soter.SoterTaskThread", "soter: task looper is null! use main looper as the task looper", new Object[0]);
    }
  }

  public static g dRq()
  {
    AppMethodBeat.i(10490);
    if (Awz == null);
    while (true)
    {
      try
      {
        if (Awz == null)
        {
          localg1 = new com/tencent/soter/a/g/g;
          localg1.<init>();
          Awz = localg1;
        }
        g localg1 = Awz;
        return localg1;
      }
      finally
      {
        AppMethodBeat.o(10490);
      }
      g localg2 = Awz;
      AppMethodBeat.o(10490);
    }
  }

  public final void R(Runnable paramRunnable)
  {
    AppMethodBeat.i(10491);
    this.AwA.post(paramRunnable);
    AppMethodBeat.o(10491);
  }

  public final void d(Runnable paramRunnable)
  {
    AppMethodBeat.i(10493);
    this.AvE.post(paramRunnable);
    AppMethodBeat.o(10493);
  }

  public final void s(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(10492);
    this.AwA.postDelayed(paramRunnable, paramLong);
    AppMethodBeat.o(10492);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.g
 * JD-Core Version:    0.6.2
 */