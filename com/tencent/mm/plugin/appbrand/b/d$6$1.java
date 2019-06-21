package com.tencent.mm.plugin.appbrand.b;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$6$1
  implements MessageQueue.IdleHandler
{
  d$6$1(d.6 param6)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(86842);
    Looper.myLooper().quit();
    AppMethodBeat.o(86842);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.d.6.1
 * JD-Core Version:    0.6.2
 */