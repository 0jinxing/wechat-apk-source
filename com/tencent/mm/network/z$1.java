package com.tencent.mm.network;

import com.tencent.mars.mm.MMLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class z$1
  implements Runnable
{
  z$1(z paramz, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(58644);
    MMLogic.reportCGIServerError(this.gdQ, this.gdR);
    AppMethodBeat.o(58644);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.z.1
 * JD-Core Version:    0.6.2
 */