package com.tencent.mm.plugin.sight.decode.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class VideoPlayView$7
  implements Runnable
{
  VideoPlayView$7(VideoPlayView paramVideoPlayView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(70322);
    if (VideoPlayView.c(this.qzs) != null)
      VideoPlayView.c(this.qzs).setIsPlay(false);
    AppMethodBeat.o(70322);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.7
 * JD-Core Version:    0.6.2
 */