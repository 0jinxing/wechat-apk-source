package com.tencent.mm.plugin.voip.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class VideoActivity$12
  implements Runnable
{
  VideoActivity$12(VideoActivity paramVideoActivity, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4800);
    if (VideoActivity.d(this.sWl) != null)
      VideoActivity.d(this.sWl).abY(this.sWn);
    AppMethodBeat.o(4800);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VideoActivity.12
 * JD-Core Version:    0.6.2
 */