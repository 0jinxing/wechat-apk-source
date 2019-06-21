package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

import a.l;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class c$c
  implements Runnable
{
  public static final c jUE;

  static
  {
    AppMethodBeat.i(15036);
    jUE = new c();
    AppMethodBeat.o(15036);
  }

  public final void run()
  {
    AppMethodBeat.i(15035);
    Looper.myQueue().addIdleHandler((MessageQueue.IdleHandler)new MessageQueue.IdleHandler()
    {
      public final boolean queueIdle()
      {
        AppMethodBeat.i(15034);
        Looper.myQueue().removeIdleHandler((MessageQueue.IdleHandler)this);
        c.a(c.jUB);
        AppMethodBeat.o(15034);
        return false;
      }
    });
    AppMethodBeat.o(15035);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.c.c
 * JD-Core Version:    0.6.2
 */