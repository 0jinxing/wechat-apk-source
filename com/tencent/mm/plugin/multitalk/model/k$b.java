package com.tencent.mm.plugin.multitalk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;

public final class k$b
  implements Runnable
{
  public k$b(k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(54061);
    this.oGZ.oGY.eBB = true;
    if (this.oGZ.oGY.mQQ != null)
    {
      long l = System.currentTimeMillis();
      if (this.oGZ.oGq != null)
        this.oGZ.oGq.a(r.Yz(), this.oGZ.oGY.mQQ, this.oGZ.oGY.oHb, this.oGZ.oGY.angle);
      l = System.currentTimeMillis() - l;
      if (l > 30L)
        ab.d("MicroMsg.MT.MultiTalkVideoNativeReceiver", "steve: draw native picture use time total: %d", new Object[] { Long.valueOf(l) });
      this.oGZ.oGY.eBB = false;
    }
    try
    {
      Thread.sleep(20L);
      AppMethodBeat.o(54061);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MT.MultiTalkVideoNativeReceiver", localInterruptedException, "", new Object[0]);
        AppMethodBeat.o(54061);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.k.b
 * JD-Core Version:    0.6.2
 */