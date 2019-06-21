package com.tencent.mm.plugin.mmsight.segment;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.segment.a.c.a;

final class VideoSegmentUI$3
  implements c.a
{
  private Runnable ozO;

  VideoSegmentUI$3(VideoSegmentUI paramVideoSegmentUI)
  {
  }

  public final void yY(int paramInt)
  {
    AppMethodBeat.i(55032);
    if (VideoSegmentUI.j(this.ozN) == null)
      AppMethodBeat.o(55032);
    while (true)
    {
      return;
      if (this.ozO != null)
        ((View)VideoSegmentUI.j(this.ozN)).removeCallbacks(this.ozO);
      this.ozO = new VideoSegmentUI.c(VideoSegmentUI.j(this.ozN), paramInt, VideoSegmentUI.e(this.ozN));
      ((View)VideoSegmentUI.j(this.ozN)).post(this.ozO);
      AppMethodBeat.o(55032);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.3
 * JD-Core Version:    0.6.2
 */