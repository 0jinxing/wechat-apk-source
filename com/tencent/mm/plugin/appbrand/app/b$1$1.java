package com.tencent.mm.plugin.appbrand.app;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.task.e;
import com.tencent.mm.plugin.appbrand.task.g;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1$1
  implements MessageQueue.IdleHandler
{
  b$1$1(b.1 param1)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(129192);
    b.Pu();
    Looper.myQueue().removeIdleHandler(this);
    if (!b.access$100());
    try
    {
      ab.i("MicroMsg.AppBrandProcessProfileInit[applaunch]", "start misc preload [%s]", new Object[] { this.gQR.gQP });
      AppBrandMainProcessService.aBM();
      e.a(this.gQR.gQP, null, false, this.gQR.gQQ);
      AppMethodBeat.o(129192);
      return false;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.AppBrandProcessProfileInit[applaunch]", localException, "Preload [%s] in IdleHandler encountered Exception", new Object[] { this.gQR.gQP.name() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.b.1.1
 * JD-Core Version:    0.6.2
 */