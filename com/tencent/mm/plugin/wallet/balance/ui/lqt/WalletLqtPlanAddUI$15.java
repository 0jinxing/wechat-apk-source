package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class WalletLqtPlanAddUI$15
  implements View.OnClickListener
{
  WalletLqtPlanAddUI$15(WalletLqtPlanAddUI paramWalletLqtPlanAddUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45573);
    h.a(this.tjp.mController.ylL, this.tjp.getString(2131304986), "", this.tjp.getString(2131296955), new WalletLqtPlanAddUI.15.1(this));
    AppMethodBeat.o(45573);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.15
 * JD-Core Version:    0.6.2
 */