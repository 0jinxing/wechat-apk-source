package com.tencent.mm.plugin.account.security.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BindSafeDeviceUI$1
  implements MenuItem.OnMenuItemClickListener
{
  BindSafeDeviceUI$1(BindSafeDeviceUI paramBindSafeDeviceUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(69858);
    this.gzp.finish();
    AppMethodBeat.o(69858);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.BindSafeDeviceUI.1
 * JD-Core Version:    0.6.2
 */