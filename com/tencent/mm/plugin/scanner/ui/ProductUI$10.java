package com.tencent.mm.plugin.scanner.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ProductUI$10
  implements MenuItem.OnMenuItemClickListener
{
  ProductUI$10(ProductUI paramProductUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(81091);
    if (ProductUI.c(this.qdu) == 4)
      this.qdu.setResult(0);
    this.qdu.finish();
    AppMethodBeat.o(81091);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductUI.10
 * JD-Core Version:    0.6.2
 */