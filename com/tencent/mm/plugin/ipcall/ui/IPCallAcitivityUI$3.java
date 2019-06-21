package com.tencent.mm.plugin.ipcall.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class IPCallAcitivityUI$3
  implements MenuItem.OnMenuItemClickListener
{
  IPCallAcitivityUI$3(IPCallAcitivityUI paramIPCallAcitivityUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(21988);
    this.nAv.finish();
    AppMethodBeat.o(21988);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI.3
 * JD-Core Version:    0.6.2
 */