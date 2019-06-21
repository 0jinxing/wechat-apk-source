package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class e$1
  implements Runnable
{
  e$1(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35280);
    if (this.zKS.tipDialog != null)
      this.zKS.tipDialog.dismiss();
    this.zKS.aMl();
    AppMethodBeat.o(35280);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.e.1
 * JD-Core Version:    0.6.2
 */