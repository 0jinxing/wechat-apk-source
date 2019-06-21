package com.tencent.mm.plugin.scanner.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.h;
import com.tencent.mm.sdk.platformtools.ak;

final class BaseScanUI$17 extends ak
{
  BaseScanUI$17(BaseScanUI paramBaseScanUI)
  {
    AppMethodBeat.i(80929);
    AppMethodBeat.o(80929);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(138472);
    if ((!BaseScanUI.g(this.qbV)) && (BaseScanUI.a(this.qbV) != null) && (BaseScanUI.r(this.qbV)))
      BaseScanUI.a(this.qbV).a(this.qbV);
    AppMethodBeat.o(138472);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.17
 * JD-Core Version:    0.6.2
 */