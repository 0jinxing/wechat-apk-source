package com.tencent.mm.plugin.mmsight.model.b;

import android.media.MediaCodec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class e$1
  implements Runnable
{
  e$1(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(76704);
    if (this.oxt.eTq != null)
      ab.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "delay to stop decoder");
    while (true)
    {
      try
      {
        this.oxt.eTq.stop();
        this.oxt.eTq.release();
        this.oxt.eTq = null;
        AppMethodBeat.o(76704);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.MMSightRemuxMediaCodecDecoder", localException, "delay to stop decoder error: %s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(76704);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.b.e.1
 * JD-Core Version:    0.6.2
 */