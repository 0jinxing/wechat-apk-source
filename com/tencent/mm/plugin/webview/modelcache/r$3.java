package com.tencent.mm.plugin.webview.modelcache;

import android.os.Looper;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class r$3 extends al
{
  r$3(r paramr, String paramString)
  {
    super(paramString);
  }

  public final int aa(final Runnable paramRunnable)
  {
    AppMethodBeat.i(6881);
    int i = super.aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(6880);
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId());
        for (int i = 1; ; i = 0)
        {
          if ((i == 0) && (Process.getThreadPriority(Process.myTid()) != 10))
            Process.setThreadPriority(10);
          if (paramRunnable != null)
            paramRunnable.run();
          AppMethodBeat.o(6880);
          return;
        }
      }
    });
    AppMethodBeat.o(6881);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.r.3
 * JD-Core Version:    0.6.2
 */