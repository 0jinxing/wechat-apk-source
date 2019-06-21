package com.tencent.mm.plugin.ipcall.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallShareCouponCardUI$1
  implements MenuItem.OnMenuItemClickListener
{
  IPCallShareCouponCardUI$1(IPCallShareCouponCardUI paramIPCallShareCouponCardUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22283);
    this.nFb.finish();
    AppMethodBeat.o(22283);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI.1
 * JD-Core Version:    0.6.2
 */