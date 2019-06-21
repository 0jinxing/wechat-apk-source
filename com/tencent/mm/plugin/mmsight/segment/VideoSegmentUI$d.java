package com.tencent.mm.plugin.mmsight.segment;

import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.segment.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class VideoSegmentUI$d
  implements Runnable
{
  private VideoSegmentUI$d(VideoSegmentUI paramVideoSegmentUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55052);
    try
    {
      bool1 = VideoSegmentUI.o(this.ozN).await(5L, TimeUnit.SECONDS);
      if ((!bool1) || (VideoSegmentUI.t(this.ozN)) || (this.ozN.isFinishing()) || (VideoSegmentUI.u(this.ozN) == null) || (!VideoSegmentUI.u(this.ozN).isValid()))
      {
        boolean bool2 = VideoSegmentUI.t(this.ozN);
        boolean bool3 = this.ozN.isFinishing();
        if (VideoSegmentUI.u(this.ozN) == null)
        {
          bool4 = true;
          ab.w("MicroMsg.VideoSegmentUI", "Waiting Prepared error result[%b] needFinish[%b] isFinishing[%b] mSurface is null[%b]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4) });
          this.ozN.finish();
          AppMethodBeat.o(55052);
          return;
        }
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        ab.e("MicroMsg.VideoSegmentUI", "count down latch error %s", new Object[] { localInterruptedException });
        boolean bool1 = false;
        continue;
        boolean bool4 = false;
        continue;
        if (VideoSegmentUI.d(this.ozN) != null)
        {
          VideoSegmentUI.d(this.ozN).a(null);
          VideoSegmentUI.d(this.ozN).a(null);
          VideoSegmentUI.d(this.ozN).release();
          VideoSegmentUI.v(this.ozN);
        }
        try
        {
          VideoSegmentUI.a(this.ozN, VideoSegmentUI.u(this.ozN));
          VideoSegmentUI.d(this.ozN).setSurface(VideoSegmentUI.u(this.ozN));
          VideoSegmentUI.d.1 local1 = new com/tencent/mm/plugin/mmsight/segment/VideoSegmentUI$d$1;
          local1.<init>(this);
          al.d(local1);
          AppMethodBeat.o(55052);
        }
        catch (IOException localIOException)
        {
          ab.printErrStackTrace("MicroMsg.VideoSegmentUI", localIOException, "init segmentPlayer second time %s", new Object[] { localIOException.getMessage() });
          this.ozN.finish();
          AppMethodBeat.o(55052);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.VideoSegmentUI", localException, "Finished when init", new Object[0]);
        this.ozN.finish();
        AppMethodBeat.o(55052);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.d
 * JD-Core Version:    0.6.2
 */