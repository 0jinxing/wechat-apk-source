package com.tencent.mm.compatible.e;

import android.hardware.Camera;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class u$1
  implements Runnable
{
  u$1(Camera[] paramArrayOfCamera, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(93008);
    this.etx[0] = Camera.open(this.ety);
    synchronized (u.access$000())
    {
      try
      {
        u.access$000().notifyAll();
        ab.i("MicroMsg.MMCamera", "openCamera notifyAll");
        AppMethodBeat.o(93008);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.MMCamera", localException, "MMCamera_openLooperNull notify error", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.u.1
 * JD-Core Version:    0.6.2
 */