package com.tencent.mm.plugin.appbrand.task;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$2$1
  implements Runnable
{
  e$2$1(e.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132792);
    Looper.myQueue().addIdleHandler(new e.2.1.1(this));
    AppMethodBeat.o(132792);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.e.2.1
 * JD-Core Version:    0.6.2
 */