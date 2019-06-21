package com.tencent.mm.plugin.scanner.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.h;
import com.tencent.mm.sdk.platformtools.ab;

final class BaseScanUI$13
  implements Runnable
{
  BaseScanUI$13(BaseScanUI paramBaseScanUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138469);
    if (BaseScanUI.a(this.qbV) == null)
      AppMethodBeat.o(138469);
    while (true)
    {
      return;
      synchronized (BaseScanUI.s(this.qbV))
      {
        if ((!BaseScanUI.g(this.qbV)) && (BaseScanUI.a(this.qbV) != null))
        {
          BaseScanUI.e(this.qbV, true);
          ab.i("MicroMsg.scanner.BaseScanUI", "closeCamera");
          BaseScanUI.a(this.qbV).release();
          BaseScanUI.A(this.qbV);
          BaseScanUI.e(this.qbV, false);
          ab.i("MicroMsg.scanner.BaseScanUI", "scanCamera.release() done");
        }
        AppMethodBeat.o(138469);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.13
 * JD-Core Version:    0.6.2
 */