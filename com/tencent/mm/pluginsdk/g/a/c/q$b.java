package com.tencent.mm.pluginsdk.g.a.c;

import android.os.Looper;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class q$b
  implements Runnable
{
  private final Runnable fZM;

  private q$b(Runnable paramRunnable)
  {
    this.fZM = paramRunnable;
  }

  public final void run()
  {
    AppMethodBeat.i(79614);
    if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId());
    for (int i = 1; ; i = 0)
    {
      if ((i == 0) && (Process.getThreadPriority(Process.myTid()) != 10))
        Process.setThreadPriority(10);
      if (this.fZM != null)
        this.fZM.run();
      AppMethodBeat.o(79614);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.q.b
 * JD-Core Version:    0.6.2
 */