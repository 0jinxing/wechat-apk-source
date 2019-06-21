package com.tencent.mm.plugin.sight.decode.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ak;

public final class VideoPlayView$6
  implements View.OnClickListener
{
  public VideoPlayView$6(VideoPlayView paramVideoPlayView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(70321);
    VideoPlayView.l(this.qzs).removeCallbacks(VideoPlayView.n(this.qzs));
    VideoPlayView.l(this.qzs).postDelayed(VideoPlayView.n(this.qzs), 3000L);
    if (VideoPlayView.a(this.qzs).isPlaying())
    {
      VideoPlayView.o(this.qzs);
      if (VideoPlayView.c(this.qzs) == null)
        break label144;
      VideoPlayView.c(this.qzs).setIsPlay(false);
      AppMethodBeat.o(70321);
    }
    while (true)
    {
      return;
      VideoPlayView.a(this.qzs, false);
      VideoPlayView.a(this.qzs).B(VideoPlayView.g(this.qzs));
      if (VideoPlayView.c(this.qzs) != null)
        VideoPlayView.c(this.qzs).setIsPlay(true);
      label144: AppMethodBeat.o(70321);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.6
 * JD-Core Version:    0.6.2
 */