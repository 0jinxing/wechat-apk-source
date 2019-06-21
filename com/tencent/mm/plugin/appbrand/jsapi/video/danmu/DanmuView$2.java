package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class DanmuView$2
  implements Runnable
{
  DanmuView$2(DanmuView paramDanmuView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126600);
    DanmuView.a(this.ibn, false);
    this.ibn.invalidate();
    AppMethodBeat.o(126600);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView.2
 * JD-Core Version:    0.6.2
 */