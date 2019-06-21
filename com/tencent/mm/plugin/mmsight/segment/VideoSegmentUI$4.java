package com.tencent.mm.plugin.mmsight.segment;

import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.segment.a.a.d;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoSegmentUI$4
  implements a.d
{
  VideoSegmentUI$4(VideoSegmentUI paramVideoSegmentUI)
  {
  }

  public final void aa(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(55033);
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      ab.e("MicroMsg.VideoSegmentUI", "VideoSegmentUI.onVideoSizeChanged wrong size (%d, %d) invoked = %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(VideoSegmentUI.q(this.ozN)) });
      AppMethodBeat.o(55033);
    }
    while (true)
    {
      return;
      if (VideoSegmentUI.q(this.ozN))
      {
        ab.e("MicroMsg.VideoSegmentUI", "VideoSegmentUI.onVideoSizeChanged surface has invoked");
        AppMethodBeat.o(55033);
      }
      else
      {
        ab.i("MicroMsg.VideoSegmentUI", "VideoSegmentUI.onVideoSizeChanged (%d, %d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        VideoSegmentUI.r(this.ozN);
        if ((paramInt2 <= 0) || (paramInt1 <= 0))
        {
          ab.e("MicroMsg.VideoSegmentUI", "This video has wrong size (%dx%d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          VideoSegmentUI.m(this.ozN);
          this.ozN.finish();
          VideoSegmentUI.b(this.ozN);
          AppMethodBeat.o(55033);
        }
        else
        {
          VideoSegmentUI.a locala = new VideoSegmentUI.a(this.ozN, VideoSegmentUI.s(this.ozN), paramInt2, paramInt1, paramInt3, new VideoSegmentUI.b(this.ozN, (byte)0), (byte)0);
          if ((VideoSegmentUI.s(this.ozN).getWidth() <= 0) || (VideoSegmentUI.s(this.ozN).getHeight() <= 0))
          {
            ab.i("MicroMsg.VideoSegmentUI", "post init surface task after root measured.");
            VideoSegmentUI.s(this.ozN).post(locala);
            AppMethodBeat.o(55033);
          }
          else
          {
            locala.run();
            AppMethodBeat.o(55033);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.4
 * JD-Core Version:    0.6.2
 */