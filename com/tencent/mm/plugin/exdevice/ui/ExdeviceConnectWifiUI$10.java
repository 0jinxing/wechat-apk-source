package com.tencent.mm.plugin.exdevice.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceConnectWifiUI$10
  implements MenuItem.OnMenuItemClickListener
{
  ExdeviceConnectWifiUI$10(ExdeviceConnectWifiUI paramExdeviceConnectWifiUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(19886);
    if (!ExdeviceConnectWifiUI.h(this.lAf))
    {
      paramMenuItem = new Intent();
      if (ExdeviceConnectWifiUI.d(this.lAf) == ExdeviceConnectWifiUI.b.lAp)
        break label71;
    }
    label71: for (boolean bool = true; ; bool = false)
    {
      paramMenuItem.putExtra("is_wifi_connected", bool);
      this.lAf.setResult(0, paramMenuItem);
      this.lAf.finish();
      AppMethodBeat.o(19886);
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.10
 * JD-Core Version:    0.6.2
 */