package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bkm;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class WalletLqtPlanHomeUI$6
  implements n.d
{
  WalletLqtPlanHomeUI$6(WalletLqtPlanHomeUI paramWalletLqtPlanHomeUI, bkm parambkm)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(45610);
    paramInt = paramMenuItem.getItemId();
    WalletLqtPlanHomeUI.a(this.tjK, paramInt);
    WalletLqtPlanHomeUI.b(this.tjK, this.tjN.vES);
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(45610);
      while (true)
      {
        return;
        WalletLqtPlanHomeUI.c(this.tjK, paramInt);
        AppMethodBeat.o(45610);
        continue;
        h.a(this.tjK.mController.ylL, this.tjK.getString(2131304999), "", this.tjK.getString(2131304998), this.tjK.getString(2131296868), true, new WalletLqtPlanHomeUI.6.1(this, paramInt), new WalletLqtPlanHomeUI.6.2(this), 2131690386);
        AppMethodBeat.o(45610);
        continue;
        WalletLqtPlanHomeUI.c(this.tjK, paramInt);
        AppMethodBeat.o(45610);
      }
      WalletLqtPlanHomeUI.a(this.tjK, this.tjN);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.6
 * JD-Core Version:    0.6.2
 */