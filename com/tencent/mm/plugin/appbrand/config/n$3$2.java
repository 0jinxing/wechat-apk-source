package com.tencent.mm.plugin.appbrand.config;

import android.os.HandlerThread;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class n$3$2
  implements MessageQueue.IdleHandler
{
  n$3$2(n.3 param3)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(129874);
    this.hhD.hhC.oAl.quit();
    AppMethodBeat.o(129874);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.n.3.2
 * JD-Core Version:    0.6.2
 */