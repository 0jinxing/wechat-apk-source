package com.tencent.mm.plugin.scanner.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ProductPurchaseAreaUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ProductPurchaseAreaUI$1(ProductPurchaseAreaUI paramProductPurchaseAreaUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(81072);
    this.qcS.finish();
    AppMethodBeat.o(81072);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductPurchaseAreaUI.1
 * JD-Core Version:    0.6.2
 */