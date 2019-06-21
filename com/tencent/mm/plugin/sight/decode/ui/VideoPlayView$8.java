package com.tencent.mm.plugin.sight.decode.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e;

final class VideoPlayView$8
  implements Runnable
{
  VideoPlayView$8(VideoPlayView paramVideoPlayView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(70323);
    if (!VideoPlayView.a(this.qzs).isPlaying())
      ((AdVideoPlayerLoadingBar)VideoPlayView.c(this.qzs)).aFQ();
    AppMethodBeat.o(70323);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.8
 * JD-Core Version:    0.6.2
 */