package com.tencent.mm.ipcinvoker;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

final class m$a$2 extends ScheduledThreadPoolExecutor
{
  m$a$2(m.a parama, int paramInt, ThreadFactory paramThreadFactory)
  {
    super(paramInt, paramThreadFactory);
  }

  public final void execute(final Runnable paramRunnable)
  {
    AppMethodBeat.i(114060);
    super.execute(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(114059);
        try
        {
          paramRunnable.run();
          AppMethodBeat.o(114059);
          return;
        }
        catch (Throwable localThrowable)
        {
          Thread.UncaughtExceptionHandler localUncaughtExceptionHandler1 = Thread.currentThread().getUncaughtExceptionHandler();
          Thread.UncaughtExceptionHandler localUncaughtExceptionHandler2 = localUncaughtExceptionHandler1;
          if (localUncaughtExceptionHandler1 == null)
            localUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
          if (localUncaughtExceptionHandler2 != null)
            localUncaughtExceptionHandler2.uncaughtException(Thread.currentThread(), localThrowable);
          AppMethodBeat.o(114059);
          throw localThrowable;
        }
      }
    });
    AppMethodBeat.o(114060);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.m.a.2
 * JD-Core Version:    0.6.2
 */