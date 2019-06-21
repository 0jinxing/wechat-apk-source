package com.tencent.mm.plugin.collect.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CollectCreateQRCodeUI$1
  implements MenuItem.OnMenuItemClickListener
{
  CollectCreateQRCodeUI$1(CollectCreateQRCodeUI paramCollectCreateQRCodeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(41230);
    this.kGc.setResult(0);
    this.kGc.finish();
    AppMethodBeat.o(41230);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeUI.1
 * JD-Core Version:    0.6.2
 */