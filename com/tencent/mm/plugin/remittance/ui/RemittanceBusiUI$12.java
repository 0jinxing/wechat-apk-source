package com.tencent.mm.plugin.remittance.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RemittanceBusiUI$12
  implements MenuItem.OnMenuItemClickListener
{
  RemittanceBusiUI$12(RemittanceBusiUI paramRemittanceBusiUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44903);
    if (RemittanceBusiUI.f(this.pUd))
    {
      this.pUd.aqX();
      this.pUd.showDialog(1000);
    }
    while (true)
    {
      AppMethodBeat.o(44903);
      return true;
      this.pUd.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.12
 * JD-Core Version:    0.6.2
 */