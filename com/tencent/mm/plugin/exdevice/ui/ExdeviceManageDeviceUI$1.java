package com.tencent.mm.plugin.exdevice.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceManageDeviceUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ExdeviceManageDeviceUI$1(ExdeviceManageDeviceUI paramExdeviceManageDeviceUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(19982);
    this.lBj.finish();
    AppMethodBeat.o(19982);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI.1
 * JD-Core Version:    0.6.2
 */