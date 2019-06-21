package com.tencent.mm.app;

import android.os.HandlerThread;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.vending.h.h;

public final class j
{
  private static j ces;
  HandlerThread cet;
  com.tencent.mm.vending.h.d ceu;
  ak handler;

  private j(String paramString)
  {
    AppMethodBeat.i(15381);
    this.cet = com.tencent.mm.sdk.g.d.ek(paramString, 10);
    this.cet.start();
    this.handler = new ak(this.cet.getLooper());
    this.ceu = new h(com.tencent.mm.ci.d.c(this.handler), paramString);
    AppMethodBeat.o(15381);
  }

  public static j Bm()
  {
    AppMethodBeat.i(15380);
    if (ces == null)
      ces = new j("initThread");
    j localj = ces;
    AppMethodBeat.o(15380);
    return localj;
  }

  public final void Bn()
  {
    AppMethodBeat.i(15382);
    if ((this.cet == null) || (!this.cet.isAlive()))
    {
      ab.e("MicroMsg.InitThreadController", "setHighPriority failed thread is dead");
      AppMethodBeat.o(15382);
    }
    while (true)
    {
      return;
      int i = this.cet.getThreadId();
      try
      {
        if (-8 == Process.getThreadPriority(i))
        {
          ab.w("MicroMsg.InitThreadController", "setHighPriority No Need.");
          AppMethodBeat.o(15382);
        }
        else
        {
          Process.setThreadPriority(i, -8);
          ab.i("MicroMsg.InitThreadController", "InitThreadController:%d setHighPriority to %d", new Object[] { Integer.valueOf(i), Integer.valueOf(Process.getThreadPriority(i)) });
          AppMethodBeat.o(15382);
        }
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.InitThreadController", "thread:%d setHighPriority failed", new Object[] { Integer.valueOf(i) });
        ab.printErrStackTrace("MicroMsg.InitThreadController", localException, "", new Object[0]);
        AppMethodBeat.o(15382);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.j
 * JD-Core Version:    0.6.2
 */