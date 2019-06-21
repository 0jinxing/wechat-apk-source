package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class c
{
  private Handler a;
  private Looper b;
  private boolean c;
  private Thread d;

  public c(String paramString)
  {
    AppMethodBeat.i(66041);
    paramString = new HandlerThread(paramString);
    this.c = true;
    paramString.start();
    this.b = paramString.getLooper();
    this.a = new Handler(this.b);
    this.d = paramString;
    AppMethodBeat.o(66041);
  }

  public void a(Runnable paramRunnable)
  {
    AppMethodBeat.i(66043);
    boolean[] arrayOfBoolean = new boolean[1];
    if (Thread.currentThread().equals(this.d))
    {
      paramRunnable.run();
      AppMethodBeat.o(66043);
    }
    while (true)
    {
      return;
      Handler localHandler1 = this.a;
      arrayOfBoolean[0] = false;
      try
      {
        Handler localHandler2 = this.a;
        c.1 local1 = new com/tencent/liteav/basic/util/c$1;
        local1.<init>(this, paramRunnable, arrayOfBoolean);
        localHandler2.post(local1);
        while (true)
        {
          int i = arrayOfBoolean[0];
          if (i != 0)
            break;
          try
          {
            this.a.wait();
          }
          catch (Exception paramRunnable)
          {
          }
        }
        AppMethodBeat.o(66043);
      }
      finally
      {
        AppMethodBeat.o(66043);
      }
    }
    throw paramRunnable;
  }

  public void b(Runnable paramRunnable)
  {
    AppMethodBeat.i(66044);
    this.a.post(paramRunnable);
    AppMethodBeat.o(66044);
  }

  protected void finalize()
  {
    AppMethodBeat.i(66042);
    if (this.c)
      this.a.getLooper().quit();
    super.finalize();
    AppMethodBeat.o(66042);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.util.c
 * JD-Core Version:    0.6.2
 */