package com.tencent.mm.plugin.brandservice.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.video.d.h;

final class MPVideoView$11
  implements d.h
{
  MPVideoView$11(MPVideoView paramMPVideoView)
  {
  }

  public final int aFg()
  {
    AppMethodBeat.i(14517);
    int i = MPVideoView.i(this.jZz).getCacheTimeSec();
    AppMethodBeat.o(14517);
    return i;
  }

  public final int aFh()
  {
    AppMethodBeat.i(14518);
    int i = MPVideoView.i(this.jZz).getVideoDurationSec();
    AppMethodBeat.o(14518);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView.11
 * JD-Core Version:    0.6.2
 */