package com.tencent.mm.plugin.appbrand.dynamic.h;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1$1
  implements MessageQueue.IdleHandler
{
  e$1$1(e.1 param1)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(10959);
    Looper.myQueue().removeIdleHandler(this);
    this.hoJ.val$runnable.run();
    AppMethodBeat.o(10959);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.h.e.1.1
 * JD-Core Version:    0.6.2
 */