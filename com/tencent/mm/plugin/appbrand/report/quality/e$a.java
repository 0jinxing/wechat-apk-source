package com.tencent.mm.plugin.appbrand.report.quality;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$a
  implements Runnable
{
  long ciy = 0L;

  private e$a(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132690);
    if (this.iCM.iCK == null)
      AppMethodBeat.o(132690);
    while (true)
    {
      return;
      this.iCM.IF();
      this.iCM.handler.postDelayed(this.iCM.iCJ, this.ciy);
      AppMethodBeat.o(132690);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.quality.e.a
 * JD-Core Version:    0.6.2
 */