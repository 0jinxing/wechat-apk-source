package com.tencent.mm.plugin.scanner.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.x.a;
import com.tencent.mm.x.c;
import java.util.Set;

final class BaseScanUI$26
  implements SelectScanModePanel.a
{
  BaseScanUI$26(BaseScanUI paramBaseScanUI)
  {
  }

  public final void BX(int paramInt)
  {
    AppMethodBeat.i(138485);
    BaseScanUI.n(this.qbV).remove(Integer.valueOf(paramInt));
    if (paramInt == 3)
    {
      c.PK().c(ac.a.xVK, ac.a.xVL);
      c.PK().b(ac.a.xVK, false);
    }
    BaseScanUI.m(this.qbV).setShowRedDotModes(BaseScanUI.n(this.qbV));
    this.qbV.X(paramInt, 50L);
    AppMethodBeat.o(138485);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.26
 * JD-Core Version:    0.6.2
 */