package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Deque;
import java.util.List;

public final class DanmuView$5
  implements Runnable
{
  public DanmuView$5(DanmuView paramDanmuView, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126603);
    synchronized (DanmuView.b(this.ibn))
    {
      for (int i = DanmuView.a(this.ibn).size() - 1; i >= 0; i--)
      {
        d locald = (d)DanmuView.a(this.ibn).get(i);
        if (locald.aGc() < this.ibq)
          break;
        ab.v("MicroMsg.DanmuView", "seekToPlayTime addBack i=%d showTime=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(locald.aGc()) });
        DanmuView.b(this.ibn).addFirst(locald);
      }
      DanmuView.c(this.ibn);
      AppMethodBeat.o(126603);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView.5
 * JD-Core Version:    0.6.2
 */