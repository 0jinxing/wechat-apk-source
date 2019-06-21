package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;

final class h$1
  implements Runnable
{
  h$1(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(3653);
    h localh = this.oyj;
    ab.i("MicroMsg.MediaCodecFFMpegTranscoder", "waitEncoderFinish: %s %s", new Object[] { localh.oyg, localh.eVR });
    if ((localh.oyg != null) && (localh.eVR != null))
      localh.oyg.fYU = true;
    while (true)
    {
      try
      {
        localh.eVR.join();
        d.xDG.remove(localh.oyg);
        AppMethodBeat.o(3653);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.MediaCodecFFMpegTranscoder", localException, "waitEncoderFinish, join error: %s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(3653);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.h.1
 * JD-Core Version:    0.6.2
 */