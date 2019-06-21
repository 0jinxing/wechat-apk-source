package com.tencent.mm.plugin.exdevice.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceExpireUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ExdeviceExpireUI$1(ExdeviceExpireUI paramExdeviceExpireUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(19966);
    this.lAS.finish();
    AppMethodBeat.o(19966);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceExpireUI.1
 * JD-Core Version:    0.6.2
 */