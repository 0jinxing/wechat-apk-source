package com.tencent.mm.bj;

import android.media.MediaCodec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class d$1
  implements Runnable
{
  d$1(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50907);
    if (this.fYe.eTq != null)
      ab.i("MicroMsg.MediaCodecTranscodeDecoder", "delay to stop decoder");
    while (true)
    {
      try
      {
        this.fYe.eTq.stop();
        this.fYe.eTq.release();
        this.fYe.eTq = null;
        AppMethodBeat.o(50907);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.MediaCodecTranscodeDecoder", localException, "delay to stop decoder error: %s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(50907);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bj.d.1
 * JD-Core Version:    0.6.2
 */