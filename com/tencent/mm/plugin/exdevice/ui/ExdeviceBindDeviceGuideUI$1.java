package com.tencent.mm.plugin.exdevice.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceBindDeviceGuideUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ExdeviceBindDeviceGuideUI$1(ExdeviceBindDeviceGuideUI paramExdeviceBindDeviceGuideUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(19811);
    this.lyM.finish();
    AppMethodBeat.o(19811);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI.1
 * JD-Core Version:    0.6.2
 */