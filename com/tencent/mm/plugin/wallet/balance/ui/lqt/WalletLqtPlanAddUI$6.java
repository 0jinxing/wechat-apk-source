package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.ui.base.n.d;
import java.util.List;

final class WalletLqtPlanAddUI$6
  implements n.d
{
  WalletLqtPlanAddUI$6(WalletLqtPlanAddUI paramWalletLqtPlanAddUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(45563);
    if (paramInt < WalletLqtPlanAddUI.i(this.tjp).size())
    {
      paramMenuItem = (Bankcard)WalletLqtPlanAddUI.i(this.tjp).get(paramInt);
      WalletLqtPlanAddUI.j(this.tjp).vEQ = paramMenuItem.field_bindSerial;
      WalletLqtPlanAddUI.j(this.tjp).pbn = paramMenuItem.field_bankcardType;
      WalletLqtPlanAddUI.j(this.tjp).nuL = paramMenuItem.field_bankName;
      WalletLqtPlanAddUI.j(this.tjp).pck = paramMenuItem.field_bankcardTail;
      WalletLqtPlanAddUI.k(this.tjp);
      WalletLqtPlanAddUI.f(this.tjp);
      WalletLqtPlanAddUI.a(this.tjp);
      AppMethodBeat.o(45563);
    }
    while (true)
    {
      return;
      WalletLqtPlanAddUI.l(this.tjp);
      AppMethodBeat.o(45563);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.6
 * JD-Core Version:    0.6.2
 */