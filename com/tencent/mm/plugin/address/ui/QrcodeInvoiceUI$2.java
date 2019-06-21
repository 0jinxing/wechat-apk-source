package com.tencent.mm.plugin.address.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class QrcodeInvoiceUI$2
  implements MenuItem.OnMenuItemClickListener
{
  QrcodeInvoiceUI$2(QrcodeInvoiceUI paramQrcodeInvoiceUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(16913);
    paramMenuItem = new Intent();
    paramMenuItem.setClass(this.gKM, AddInvoiceUI.class);
    paramMenuItem.putExtra("invoice_id", QrcodeInvoiceUI.a(this.gKM));
    this.gKM.startActivity(paramMenuItem);
    AppMethodBeat.o(16913);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI.2
 * JD-Core Version:    0.6.2
 */