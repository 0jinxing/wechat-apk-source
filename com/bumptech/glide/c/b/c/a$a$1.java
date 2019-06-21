package com.bumptech.glide.c.b.c;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$a$1 extends Thread
{
  a$a$1(a.a parama, Runnable paramRunnable, String paramString)
  {
    super(paramRunnable, paramString);
  }

  public final void run()
  {
    AppMethodBeat.i(92002);
    Process.setThreadPriority(9);
    if (this.aDF.aDD)
      StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
    try
    {
      super.run();
      AppMethodBeat.o(92002);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        this.aDF.aDC.d(localThrowable);
        AppMethodBeat.o(92002);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.c.a.a.1
 * JD-Core Version:    0.6.2
 */