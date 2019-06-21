package com.tencent.mm.plugin.address.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class InvoiceListUI$4
  implements MenuItem.OnMenuItemClickListener
{
  InvoiceListUI$4(InvoiceListUI paramInvoiceListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(16861);
    this.gKj.setResult(0);
    this.gKj.finish();
    AppMethodBeat.o(16861);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.InvoiceListUI.4
 * JD-Core Version:    0.6.2
 */