package com.tencent.mm.plugin.product.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallBaseUI$1
  implements MenuItem.OnMenuItemClickListener
{
  MallBaseUI$1(MallBaseUI paramMallBaseUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44026);
    this.pij.finish();
    AppMethodBeat.o(44026);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallBaseUI.1
 * JD-Core Version:    0.6.2
 */