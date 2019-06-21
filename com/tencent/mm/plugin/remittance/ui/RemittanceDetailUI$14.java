package com.tencent.mm.plugin.remittance.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class RemittanceDetailUI$14
  implements MenuItem.OnMenuItemClickListener
{
  RemittanceDetailUI$14(RemittanceDetailUI paramRemittanceDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(45012);
    e.n(this.pVw.mController.ylL, RemittanceDetailUI.w(this.pVw), false);
    AppMethodBeat.o(45012);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.14
 * JD-Core Version:    0.6.2
 */