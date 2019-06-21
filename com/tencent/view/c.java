package com.tencent.view;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class c
{
  private static c AIK;
  private a AIL;
  String AIM;
  private Handler handler;
  public HandlerThread mGlThread;

  private c()
  {
    AppMethodBeat.i(86633);
    this.AIL = null;
    c.1 local1 = new c.1(this);
    this.mGlThread = new c.2(this, "GlThread");
    this.mGlThread.start();
    this.handler = new Handler(this.mGlThread.getLooper());
    this.handler.post(local1);
    AppMethodBeat.o(86633);
  }

  public static c dSN()
  {
    AppMethodBeat.i(86634);
    if (AIK == null);
    try
    {
      if (AIK == null);
      try
      {
        c localc = new com/tencent/view/c;
        localc.<init>();
        AIK = localc;
        localc = AIK;
        AppMethodBeat.o(86634);
        return localc;
      }
      finally
      {
      }
    }
    finally
    {
      AppMethodBeat.o(86634);
    }
  }

  public final void queue(Runnable paramRunnable)
  {
    AppMethodBeat.i(86635);
    this.handler.post(paramRunnable);
    AppMethodBeat.o(86635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.view.c
 * JD-Core Version:    0.6.2
 */