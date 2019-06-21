package com.tencent.mm.plugin.mmsight.segment;

import android.media.MediaCodec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g$1
  implements Runnable
{
  g$1(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(3642);
    try
    {
      if (this.oyf.oxW != null)
      {
        ab.i("MicroMsg.MediaCodecAACTranscoder", "delay to stop decoder");
        this.oyf.oxW.stop();
        this.oyf.oxW.release();
        this.oyf.oxW = null;
      }
      AppMethodBeat.o(3642);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MediaCodecAACTranscoder", "delayStopDecoder error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(3642);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.g.1
 * JD-Core Version:    0.6.2
 */