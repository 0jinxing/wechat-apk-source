package com.tencent.mm.plugin.shake.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeItemListUI$5
  implements MenuItem.OnMenuItemClickListener
{
  ShakeItemListUI$5(ShakeItemListUI paramShakeItemListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24724);
    this.quC.aqX();
    this.quC.finish();
    AppMethodBeat.o(24724);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeItemListUI.5
 * JD-Core Version:    0.6.2
 */