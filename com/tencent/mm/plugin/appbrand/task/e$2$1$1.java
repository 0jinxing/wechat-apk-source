package com.tencent.mm.plugin.appbrand.task;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$2$1$1
  implements MessageQueue.IdleHandler
{
  e$2$1$1(e.2.1 param1)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(132791);
    Looper.myQueue().removeIdleHandler(this);
    e.access$600();
    AppMethodBeat.o(132791);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.e.2.1.1
 * JD-Core Version:    0.6.2
 */