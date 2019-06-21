package com.tencent.mm.plugin.mmsight.segment;

import android.media.MediaCodec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g$2
  implements Runnable
{
  g$2(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(3643);
    try
    {
      if (this.oyf.oxX != null)
      {
        ab.i("MicroMsg.MediaCodecAACTranscoder", "delay to stop encoder");
        this.oyf.oxX.stop();
        this.oyf.oxX.release();
        this.oyf.oxX = null;
      }
      AppMethodBeat.o(3643);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MediaCodecAACTranscoder", "delayStopEncoder error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(3643);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.g.2
 * JD-Core Version:    0.6.2
 */