package com.tencent.mm.plugin.address.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class QrcodeInvoiceUI$1
  implements MenuItem.OnMenuItemClickListener
{
  QrcodeInvoiceUI$1(QrcodeInvoiceUI paramQrcodeInvoiceUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(16912);
    this.gKM.setResult(0);
    this.gKM.finish();
    AppMethodBeat.o(16912);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI.1
 * JD-Core Version:    0.6.2
 */