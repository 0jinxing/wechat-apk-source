package com.tencent.mm.plugin.subapp.ui.openapi;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ServiceAppUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ServiceAppUI$1(ServiceAppUI paramServiceAppUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(25471);
    this.suP.finish();
    AppMethodBeat.o(25471);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI.1
 * JD-Core Version:    0.6.2
 */