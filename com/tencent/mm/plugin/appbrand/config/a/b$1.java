package com.tencent.mm.plugin.appbrand.config.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Timer;
import java.util.TimerTask;

final class b$1
  implements Runnable
{
  b$1(b paramb, b.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(86932);
    b.a(this.hiY);
    this.hiY.hiV = this.hiX;
    this.hiY.hiW = new Timer();
    this.hiY.hiW.schedule(new TimerTask()
    {
      public final void run()
      {
        AppMethodBeat.i(86931);
        al.d(new b.1.1.1(this));
        AppMethodBeat.o(86931);
      }
    }
    , 500L, 500L);
    AppMethodBeat.o(86932);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.a.b.1
 * JD-Core Version:    0.6.2
 */