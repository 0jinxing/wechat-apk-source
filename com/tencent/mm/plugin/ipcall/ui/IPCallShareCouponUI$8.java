package com.tencent.mm.plugin.ipcall.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallShareCouponUI$8
  implements MenuItem.OnMenuItemClickListener
{
  IPCallShareCouponUI$8(IPCallShareCouponUI paramIPCallShareCouponUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22326);
    this.nFI.finish();
    AppMethodBeat.o(22326);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.8
 * JD-Core Version:    0.6.2
 */