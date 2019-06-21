package com.tencent.mm.plugin.brandservice.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.video.d.c;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.a.d;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.b;
import com.tencent.mm.sdk.platformtools.ab;

final class MPVideoView$9
  implements d.c
{
  MPVideoView$9(MPVideoView paramMPVideoView)
  {
  }

  public final void aFw()
  {
    AppMethodBeat.i(14514);
    ab.i("MicroMsg.MPVideoView", "onSeekPre");
    AppMethodBeat.o(14514);
  }

  public final void oA(int paramInt)
  {
    AppMethodBeat.i(14515);
    this.jZz.d(paramInt, false);
    MPVideoView.m(this.jZz).jVJ.sE(13);
    AppMethodBeat.o(14515);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView.9
 * JD-Core Version:    0.6.2
 */