package com.tencent.mm.plugin.remittance.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RemittanceBaseUI$1
  implements MenuItem.OnMenuItemClickListener
{
  RemittanceBaseUI$1(RemittanceBaseUI paramRemittanceBaseUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44825);
    if ((this.pRX.gOW == 1) || (this.pRX.gOW == 6))
    {
      this.pRX.cfA();
      this.pRX.finish();
    }
    while (true)
    {
      this.pRX.cfB();
      AppMethodBeat.o(44825);
      return true;
      if ((this.pRX.gOW == 2) || (this.pRX.gOW == 5))
        this.pRX.finish();
      else
        this.pRX.cfM();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.1
 * JD-Core Version:    0.6.2
 */