package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.segment.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoSegmentUI$9
  implements a.a
{
  VideoSegmentUI$9(VideoSegmentUI paramVideoSegmentUI)
  {
  }

  public final boolean ey(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55040);
    ab.e("MicroMsg.VideoSegmentUI", "MediaPlayer on error what = %d extra = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    VideoSegmentUI.m(this.ozN);
    this.ozN.finish();
    VideoSegmentUI.b(this.ozN);
    AppMethodBeat.o(55040);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.9
 * JD-Core Version:    0.6.2
 */