package com.tencent.mm.plugin.scanner.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ProductFurtherInfoUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ProductFurtherInfoUI$1(ProductFurtherInfoUI paramProductFurtherInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(81043);
    this.qcF.finish();
    AppMethodBeat.o(81043);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI.1
 * JD-Core Version:    0.6.2
 */