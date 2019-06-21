package com.tencent.mm.plugin.appbrand;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$11
  implements Runnable
{
  i$11(i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(86662);
    if (this.gOb.mFinished)
      AppMethodBeat.o(86662);
    while (true)
    {
      return;
      i.a(this.gOb);
      this.gOb.eMP = true;
      i locali = this.gOb;
      locali.mHandler.removeCallbacks(locali.gNZ);
      AppMethodBeat.o(86662);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.11
 * JD-Core Version:    0.6.2
 */