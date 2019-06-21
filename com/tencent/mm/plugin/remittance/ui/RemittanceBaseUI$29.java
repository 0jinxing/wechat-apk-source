package com.tencent.mm.plugin.remittance.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class RemittanceBaseUI$29
  implements MenuItem.OnMenuItemClickListener
{
  RemittanceBaseUI$29(RemittanceBaseUI paramRemittanceBaseUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44860);
    e.n(this.pRX.mController.ylL, this.pRX.pRz, false);
    AppMethodBeat.o(44860);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.29
 * JD-Core Version:    0.6.2
 */