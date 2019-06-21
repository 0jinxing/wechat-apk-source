package com.tencent.mm.plugin.wear.model;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class j
{
  HandlerThread handlerThread;
  ak ilv;

  public j()
  {
    AppMethodBeat.i(26354);
    if (com.tencent.mm.compatible.util.d.iX(18))
    {
      this.handlerThread = com.tencent.mm.sdk.g.d.anM("WearWorker_worker_thread");
      this.handlerThread.start();
      this.ilv = new a(this.handlerThread.getLooper());
      ab.i("MicroMsg.Wear.WearWorker", "start worker %d", new Object[] { Integer.valueOf(this.handlerThread.getThreadId()) });
    }
    AppMethodBeat.o(26354);
  }

  public final void a(com.tencent.mm.plugin.wear.model.f.d paramd)
  {
    AppMethodBeat.i(26355);
    if (this.ilv != null)
    {
      paramd = this.ilv.obtainMessage(0, paramd);
      this.ilv.sendMessage(paramd);
    }
    AppMethodBeat.o(26355);
  }

  final class a extends ak
  {
    public a(Looper arg2)
    {
      super();
    }

    public final void handleMessage(Message paramMessage)
    {
      AppMethodBeat.i(26353);
      com.tencent.mm.plugin.wear.model.f.d locald = (com.tencent.mm.plugin.wear.model.f.d)paramMessage.obj;
      if (locald != null);
      while (true)
      {
        try
        {
          locald.run();
          AppMethodBeat.o(26353);
          return;
        }
        catch (Exception paramMessage)
        {
          ab.printErrStackTrace("MicroMsg.Wear.WearWorker", paramMessage.getCause(), "run task %s occur exception", new Object[] { locald.getName() });
        }
        AppMethodBeat.o(26353);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.j
 * JD-Core Version:    0.6.2
 */