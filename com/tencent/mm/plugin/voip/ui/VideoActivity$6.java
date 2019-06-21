package com.tencent.mm.plugin.voip.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.a.b;

final class VideoActivity$6
  implements Runnable
{
  VideoActivity$6(VideoActivity paramVideoActivity)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4793);
    if ((b.GP(VideoActivity.b(this.sWl))) && (!VideoActivity.c(this.sWl)) && (VideoActivity.d(this.sWl) != null))
      VideoActivity.d(this.sWl).fZ(2131304370, 10000);
    AppMethodBeat.o(4793);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VideoActivity.6
 * JD-Core Version:    0.6.2
 */