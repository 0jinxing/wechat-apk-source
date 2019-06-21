package com.tencent.mm.plugin.sight.decode.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class VideoPlayView$5
  implements b
{
  public VideoPlayView$5(VideoPlayView paramVideoPlayView)
  {
  }

  public final void aFw()
  {
    AppMethodBeat.i(70319);
    VideoPlayView.l(this.qzs).removeCallbacks(VideoPlayView.n(this.qzs));
    VideoPlayView.d(this.qzs);
    AppMethodBeat.o(70319);
  }

  public final void oA(int paramInt)
  {
    AppMethodBeat.i(70320);
    ab.i("MicroMsg.VideoPlayView", "onSeek time ".concat(String.valueOf(paramInt)));
    VideoPlayView.a(this.qzs, paramInt);
    VideoPlayView.a(this.qzs).B(paramInt);
    VideoPlayView.l(this.qzs).removeCallbacks(VideoPlayView.n(this.qzs));
    VideoPlayView.l(this.qzs).postDelayed(VideoPlayView.n(this.qzs), 3000L);
    AppMethodBeat.o(70320);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.5
 * JD-Core Version:    0.6.2
 */