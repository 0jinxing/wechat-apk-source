package com.tencent.mm.plugin.sight.decode.ui;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoPlayView$1$1
  implements Runnable
{
  VideoPlayView$1$1(VideoPlayView.1 param1, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(70309);
    ab.i("MicroMsg.VideoPlayView", "play time " + this.ibq + " video time " + this.qzt);
    if (this.qzt > 0)
    {
      VideoPlayView.b(this.qzu.qzs, this.qzt);
      if ((VideoPlayView.c(this.qzu.qzs) != null) && (VideoPlayView.h(this.qzu.qzs)))
        VideoPlayView.i(this.qzu.qzs);
      VideoPlayView.f(this.qzu.qzs).CG(this.qzt);
    }
    if (VideoPlayView.c(this.qzu.qzs) != null)
    {
      if (VideoPlayView.c(this.qzu.qzs).getVideoTotalTime() != this.qzt)
        VideoPlayView.c(this.qzu.qzs).setVideoTotalTime(this.qzt);
      VideoPlayView.c(this.qzu.qzs).seek(this.ibq);
      VideoPlayView.c(this.qzu.qzs).setIsPlay(true);
    }
    if (VideoPlayView.j(this.qzu.qzs).getVisibility() == 0)
      VideoPlayView.j(this.qzu.qzs).setVisibility(8);
    VideoPlayView.a(this.qzu.qzs, this.ibq);
    AppMethodBeat.o(70309);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.1.1
 * JD-Core Version:    0.6.2
 */