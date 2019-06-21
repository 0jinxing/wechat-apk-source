package com.tencent.mm.plugin.mmsight.segment;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.CountDownLatch;

final class VideoSegmentUI$12
  implements c.a
{
  VideoSegmentUI$12(VideoSegmentUI paramVideoSegmentUI)
  {
  }

  public final void iY(boolean paramBoolean)
  {
    AppMethodBeat.i(55043);
    if (paramBoolean)
    {
      Toast.makeText(this.ozN, 2131301447, 1).show();
      ab.e("MicroMsg.VideoSegmentUI", "Not Supported init SegmentSeekBar failed.");
      VideoSegmentUI.m(this.ozN);
      this.ozN.finish();
      VideoSegmentUI.b(this.ozN);
      AppMethodBeat.o(55043);
    }
    while (true)
    {
      return;
      if ((!this.ozN.isFinishing()) && (VideoSegmentUI.j(this.ozN) != null))
      {
        VideoSegmentUI.a(this.ozN, VideoSegmentUI.j(this.ozN).getDurationMs());
        ab.i("MicroMsg.VideoSegmentUI", "SeekBar.onPrepared success %d", new Object[] { Integer.valueOf(VideoSegmentUI.e(this.ozN)) });
      }
      try
      {
        if (VideoSegmentUI.d(this.ozN) != null)
          VideoSegmentUI.d(this.ozN).setLoop((int)(VideoSegmentUI.e(this.ozN) * VideoSegmentUI.j(this.ozN).bQa()), (int)(VideoSegmentUI.e(this.ozN) * VideoSegmentUI.j(this.ozN).bQb()));
        label185: VideoSegmentUI.o(this.ozN).countDown();
        AppMethodBeat.o(55043);
      }
      catch (Exception localException)
      {
        break label185;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.12
 * JD-Core Version:    0.6.2
 */