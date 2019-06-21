package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallCountryCodeSelectUI$4
  implements MenuItem.OnMenuItemClickListener
{
  IPCallCountryCodeSelectUI$4(IPCallCountryCodeSelectUI paramIPCallCountryCodeSelectUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22115);
    this.nCf.aqX();
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("country_name", IPCallCountryCodeSelectUI.d(this.nCf));
    paramMenuItem.putExtra("couttry_code", IPCallCountryCodeSelectUI.e(this.nCf));
    this.nCf.setResult(100, paramMenuItem);
    this.nCf.finish();
    AppMethodBeat.o(22115);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI.4
 * JD-Core Version:    0.6.2
 */