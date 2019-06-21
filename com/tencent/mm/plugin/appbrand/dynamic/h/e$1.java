package com.tencent.mm.plugin.appbrand.dynamic.h;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1
  implements Runnable
{
  e$1(Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10960);
    Looper.myQueue().addIdleHandler(new e.1.1(this));
    AppMethodBeat.o(10960);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.h.e.1
 * JD-Core Version:    0.6.2
 */