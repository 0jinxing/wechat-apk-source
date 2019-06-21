package com.tencent.mm.plugin.recharge.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PhoneRechargeUI$1
  implements MenuItem.OnMenuItemClickListener
{
  PhoneRechargeUI$1(PhoneRechargeUI paramPhoneRechargeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44252);
    this.pHs.aqX();
    this.pHs.finish();
    AppMethodBeat.o(44252);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.1
 * JD-Core Version:    0.6.2
 */