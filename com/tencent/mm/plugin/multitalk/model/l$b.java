package com.tencent.mm.plugin.multitalk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.LinkedBlockingQueue;

public final class l$b
  implements Runnable
{
  private l.c oHl;

  public l$b(l paraml, l.c paramc)
  {
    this.oHl = paramc;
  }

  public final void run()
  {
    AppMethodBeat.i(54066);
    if (this.oHl != null)
    {
      ab.d("MicroMsg.MT.MultiTalkVideoNetworkReceiver", "draw user %s threadId %d", new Object[] { this.oHl.username, Long.valueOf(Thread.currentThread().getId()) });
      if (this.oHk.oGq != null)
        this.oHk.oGq.a(this.oHl.username, this.oHl.oHm, this.oHl.oHo, this.oHl.oHp, OpenGlRender.FLAG_Angle90);
    }
    while (true)
    {
      try
      {
        this.oHk.oHd.put(this.oHl);
        AppMethodBeat.o(54066);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
      }
      AppMethodBeat.o(54066);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.l.b
 * JD-Core Version:    0.6.2
 */