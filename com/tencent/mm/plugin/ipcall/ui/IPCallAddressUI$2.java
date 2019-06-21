package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.b;
import com.tencent.mm.pluginsdk.n;

final class IPCallAddressUI$2
  implements MenuItem.OnMenuItemClickListener
{
  IPCallAddressUI$2(IPCallAddressUI paramIPCallAddressUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22051);
    if (IPCallAddressUI.b(this.nBo) == 1)
      b.gkE.p(new Intent(), this.nBo);
    while (true)
    {
      AppMethodBeat.o(22051);
      return true;
      this.nBo.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI.2
 * JD-Core Version:    0.6.2
 */