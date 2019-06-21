package com.tencent.mm.plugin.scanner.history.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.e;
import com.tencent.mm.ui.base.h.c;

final class ScannerHistoryUI$5
  implements h.c
{
  ScannerHistoryUI$5(ScannerHistoryUI paramScannerHistoryUI, int paramInt)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(80804);
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(80804);
      return;
      com.tencent.mm.plugin.scanner.history.a.a locala = (com.tencent.mm.plugin.scanner.history.a.a)ScannerHistoryUI.a(this.pZg).getItem(this.gvp);
      if (locala != null)
      {
        e.cgy().cgC().a(locala, new String[0]);
        ScannerHistoryUI.c(this.pZg);
        ScannerHistoryUI.a(this.pZg).a(null, null);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI.5
 * JD-Core Version:    0.6.2
 */