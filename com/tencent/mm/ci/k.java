package com.tencent.mm.ci;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.j;

public final class k
{
  public final byte[] eHH;

  public k()
  {
    AppMethodBeat.i(123369);
    this.eHH = new byte[1];
    AppMethodBeat.o(123369);
  }

  public final void done()
  {
    AppMethodBeat.i(123370);
    synchronized (this.eHH)
    {
      if (this.eHH[0] == -1)
      {
        this.eHH[0] = ((byte)1);
        this.eHH.notifyAll();
        j.i("MicroMsg.WxWaitingLock", "notify done %s", new Object[] { this });
      }
      AppMethodBeat.o(123370);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ci.k
 * JD-Core Version:    0.6.2
 */