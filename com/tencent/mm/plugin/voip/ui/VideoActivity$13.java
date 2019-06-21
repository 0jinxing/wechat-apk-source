package com.tencent.mm.plugin.voip.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class VideoActivity$13
  implements Runnable
{
  VideoActivity$13(VideoActivity paramVideoActivity)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4801);
    if (VideoActivity.d(this.sWl) != null)
      VideoActivity.d(this.sWl).fZ(2131304468, -1);
    VideoActivity.e(this.sWl);
    AppMethodBeat.o(4801);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VideoActivity.13
 * JD-Core Version:    0.6.2
 */