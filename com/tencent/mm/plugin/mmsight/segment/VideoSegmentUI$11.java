package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.segment.a.a.c;
import com.tencent.mm.plugin.mmsight.segment.a.c;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoSegmentUI$11
  implements a.c
{
  VideoSegmentUI$11(VideoSegmentUI paramVideoSegmentUI)
  {
  }

  public final void cf(Object paramObject)
  {
    AppMethodBeat.i(55042);
    try
    {
      if (VideoSegmentUI.d(this.ozN) != null)
        VideoSegmentUI.d(this.ozN).start();
      AppMethodBeat.o(55042);
      return;
    }
    catch (Exception paramObject)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.VideoSegmentUI", paramObject, "hy: exception when onSeekComplete waiting for starting", new Object[0]);
        AppMethodBeat.o(55042);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.11
 * JD-Core Version:    0.6.2
 */