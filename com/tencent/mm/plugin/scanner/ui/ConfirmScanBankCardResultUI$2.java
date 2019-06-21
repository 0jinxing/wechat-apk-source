package com.tencent.mm.plugin.scanner.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ConfirmScanBankCardResultUI$2
  implements MenuItem.OnMenuItemClickListener
{
  ConfirmScanBankCardResultUI$2(ConfirmScanBankCardResultUI paramConfirmScanBankCardResultUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(81011);
    this.qci.finish();
    AppMethodBeat.o(81011);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ConfirmScanBankCardResultUI.2
 * JD-Core Version:    0.6.2
 */