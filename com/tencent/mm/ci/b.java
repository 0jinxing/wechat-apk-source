package com.tencent.mm.ci;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.j;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  private long Aiw;
  private final byte[] eHH;

  public b()
  {
    AppMethodBeat.i(123364);
    this.eHH = new byte[1];
    this.Aiw = -1L;
    AppMethodBeat.o(123364);
  }

  public final void dOV()
  {
    AppMethodBeat.i(123365);
    while (true)
    {
      synchronized (this.eHH)
      {
        if (this.eHH[0] == 0)
        {
          this.eHH[0] = ((byte)1);
          this.Aiw = Thread.currentThread().getId();
          j.i("MicroMsg.WxConsumedLock", "lock %s", new Object[] { this });
          AppMethodBeat.o(123365);
          return;
        }
        try
        {
          if (this.Aiw != Thread.currentThread().getId())
          {
            j.i("MicroMsg.WxConsumedLock", "lock waiting %s", new Object[] { this });
            this.eHH.wait();
            j.d("MicroMsg.WxConsumedLock", "unlock waiting %s", new Object[] { this });
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          ab.printErrStackTrace("MicroMsg.WxConsumedLock", localInterruptedException, "", new Object[0]);
        }
      }
      j.d("MicroMsg.WxConsumedLock", "reenter lock not need waiting %s", new Object[] { this });
    }
  }

  public final void done()
  {
    AppMethodBeat.i(123366);
    synchronized (this.eHH)
    {
      if (this.eHH[0] != 0)
      {
        this.eHH[0] = ((byte)0);
        this.Aiw = -1L;
        this.eHH.notifyAll();
        j.i("MicroMsg.WxConsumedLock", "notify done %s", new Object[] { this });
      }
      AppMethodBeat.o(123366);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ci.b
 * JD-Core Version:    0.6.2
 */