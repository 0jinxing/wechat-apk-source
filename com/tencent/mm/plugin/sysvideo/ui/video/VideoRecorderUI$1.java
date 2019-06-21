package com.tencent.mm.plugin.sysvideo.ui.video;

import android.content.res.Resources;
import android.os.SystemClock;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.i.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class VideoRecorderUI$1
  implements ap.a
{
  VideoRecorderUI$1(VideoRecorderUI paramVideoRecorderUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(25643);
    if (VideoRecorderUI.a(this.sxd) == -1L)
      VideoRecorderUI.a(this.sxd, SystemClock.elapsedRealtime());
    long l1 = VideoRecorderUI.a(this.sxd);
    long l2 = SystemClock.elapsedRealtime() - l1;
    VideoRecorderUI.b(this.sxd).setText(f.mK((int)(l2 / 1000L)));
    if ((l2 <= 30000L) && (l2 >= 20000L))
    {
      l1 = (30000L - l2) / 1000L;
      VideoRecorderUI.c(this.sxd).setVisibility(0);
      VideoRecorderUI.c(this.sxd).setText(this.sxd.getResources().getQuantityString(2131361826, (int)l1, new Object[] { Long.valueOf(l1) }));
    }
    boolean bool;
    while (l2 >= 30000L)
    {
      ab.v("MicroMsg.VideoRecorderUI", "record stop on countdown");
      VideoRecorderUI.d(this.sxd);
      VideoRecorderUI.a(this.sxd, -1L);
      bool = false;
      AppMethodBeat.o(25643);
      return bool;
      VideoRecorderUI.c(this.sxd).setVisibility(8);
    }
    VideoRecorderUI.a(this.sxd, VideoRecorderUI.e(this.sxd) % 2);
    if (VideoRecorderUI.e(this.sxd) == 0)
      VideoRecorderUI.f(this.sxd).setVisibility(4);
    while (true)
    {
      VideoRecorderUI.g(this.sxd);
      bool = true;
      AppMethodBeat.o(25643);
      break;
      VideoRecorderUI.f(this.sxd).setVisibility(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderUI.1
 * JD-Core Version:    0.6.2
 */