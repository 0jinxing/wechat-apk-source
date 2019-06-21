package com.tencent.mm.plugin.ipcall.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallAllRecordUI$1
  implements MenuItem.OnMenuItemClickListener
{
  IPCallAllRecordUI$1(IPCallAllRecordUI paramIPCallAllRecordUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22064);
    this.nBr.finish();
    AppMethodBeat.o(22064);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallAllRecordUI.1
 * JD-Core Version:    0.6.2
 */