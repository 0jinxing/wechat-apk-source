package com.tencent.magicbrush.d;

import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Callable;

public final class c
{
  public static <T> T b(Callable<T> paramCallable)
  {
    AppMethodBeat.i(116015);
    paramCallable = new b(paramCallable);
    runOnUiThread(paramCallable);
    paramCallable = paramCallable.get();
    AppMethodBeat.o(116015);
    return paramCallable;
  }

  public static void runOnUiThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(116014);
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      paramRunnable.run();
      AppMethodBeat.o(116014);
    }
    while (true)
    {
      return;
      c.a.access$000().post(paramRunnable);
      AppMethodBeat.o(116014);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.d.c
 * JD-Core Version:    0.6.2
 */