package com.tencent.toybrick.e;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static a AGU;
  private a AGV;
  private Handler AGW;
  private HandlerThread mThread;

  static
  {
    AppMethodBeat.i(113227);
    AGU = new a();
    AppMethodBeat.o(113227);
  }

  public static a dSz()
  {
    return AGU;
  }

  public final void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(113226);
    if (this.AGV == null)
    {
      if ((this.mThread == null) || (!this.mThread.isAlive()))
      {
        this.mThread = new HandlerThread("WhenHandler");
        this.mThread.start();
        this.AGW = new Handler(this.mThread.getLooper());
      }
      this.AGW.post(paramRunnable);
    }
    AppMethodBeat.o(113226);
  }

  public static abstract interface a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.e.a
 * JD-Core Version:    0.6.2
 */