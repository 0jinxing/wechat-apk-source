package com.tencent.mm.plugin.scanner.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.sdk.b.a;

final class BaseScanUI$15
  implements ScanMaskView.a
{
  BaseScanUI$15(BaseScanUI paramBaseScanUI)
  {
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(138471);
    mk localmk = new mk();
    localmk.cIp.action = 2;
    a.xxA.m(localmk);
    AppMethodBeat.o(138471);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.15
 * JD-Core Version:    0.6.2
 */