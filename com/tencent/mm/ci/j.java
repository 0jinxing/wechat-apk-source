package com.tencent.mm.ci;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class j
{
  public final byte[] eHH;

  public j()
  {
    AppMethodBeat.i(115295);
    this.eHH = new byte[1];
    AppMethodBeat.o(115295);
  }

  public final void dOX()
  {
    AppMethodBeat.i(115296);
    synchronized (this.eHH)
    {
      if (this.eHH[0] != 0)
        ab.i("MicroMsg.WxTimeoutLock", "no need lock %s", new Object[] { this });
      while (true)
      {
        AppMethodBeat.o(115296);
        return;
        try
        {
          this.eHH.wait(3000L);
        }
        catch (InterruptedException localInterruptedException)
        {
          ab.printErrStackTrace("MicroMsg.WxTimeoutLock", localInterruptedException, "", new Object[0]);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ci.j
 * JD-Core Version:    0.6.2
 */