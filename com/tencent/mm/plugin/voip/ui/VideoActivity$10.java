package com.tencent.mm.plugin.voip.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.a.d;

final class VideoActivity$10
  implements d
{
  VideoActivity$10(VideoActivity paramVideoActivity)
  {
  }

  public final void bu(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(4798);
    if (paramArrayOfByte != null)
      VideoActivity.a(this.sWl, paramArrayOfByte);
    AppMethodBeat.o(4798);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VideoActivity.10
 * JD-Core Version:    0.6.2
 */