package com.tencent.mm.plugin.scanner.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseScanUI$21
  implements Runnable
{
  BaseScanUI$21(BaseScanUI paramBaseScanUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138479);
    BaseScanUI.i(this.qbV).onPause();
    this.qbV.che();
    AppMethodBeat.o(138479);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.21
 * JD-Core Version:    0.6.2
 */