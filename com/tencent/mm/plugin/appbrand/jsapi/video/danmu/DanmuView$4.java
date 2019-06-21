package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Deque;
import java.util.List;

public final class DanmuView$4 extends Thread
{
  public DanmuView$4(DanmuView paramDanmuView, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126602);
    synchronized (DanmuView.b(this.ibn))
    {
      DanmuView.b(this.ibn).addAll(this.ibp);
    }
    synchronized (DanmuView.a(this.ibn))
    {
      DanmuView.a(this.ibn).addAll(this.ibp);
      this.ibn.postInvalidate();
      AppMethodBeat.o(126602);
      return;
      localObject2 = finally;
      AppMethodBeat.o(126602);
      throw localObject2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView.4
 * JD-Core Version:    0.6.2
 */