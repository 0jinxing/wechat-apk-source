package com.tencent.mm.bj;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;

final class h$2
  implements Runnable
{
  h$2(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50945);
    h localh = this.fYR;
    ab.i("MicroMsg.VideoTranscoder", "waitEncoderFinish: %s %s %s %s %s", new Object[] { localh.fYF, localh.fYG, Boolean.valueOf(localh.fYv), localh.fYI, localh.fYJ });
    if (localh.fYv)
    {
      if ((localh.fYF == null) || (localh.fYG == null))
        break label204;
      localh.fYF.fYU = true;
    }
    while (true)
    {
      try
      {
        localh.fYG.join();
        d.xDG.remove(localh.fYF);
        AppMethodBeat.o(50945);
        return;
      }
      catch (Exception localException1)
      {
        ab.printErrStackTrace("MicroMsg.VideoTranscoder", localException1, "waitEncoderFinish, join error: %s", new Object[] { localException1.getMessage() });
        AppMethodBeat.o(50945);
        continue;
      }
      if ((localException1.fYI != null) && (localException1.fYJ != null))
        try
        {
          localException1.fYI.quitSafely();
          localException1.fYI.join();
          localException1.fYJ = null;
          AppMethodBeat.o(50945);
        }
        catch (Exception localException2)
        {
          ab.printErrStackTrace("MicroMsg.VideoTranscoder", localException2, "waitEncoderFinish, join error: %s", new Object[] { localException2.getMessage() });
        }
      else
        label204: AppMethodBeat.o(50945);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bj.h.2
 * JD-Core Version:    0.6.2
 */