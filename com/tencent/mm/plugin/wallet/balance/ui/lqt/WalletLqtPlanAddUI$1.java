package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletLqtPlanAddUI$1
  implements View.OnClickListener
{
  WalletLqtPlanAddUI$1(WalletLqtPlanAddUI paramWalletLqtPlanAddUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45558);
    this.tjp.aoB();
    ab.i("MicroMsg.WalletLqtPlanAddUI", "click btn");
    WalletLqtPlanAddUI.a(this.tjp);
    if (!WalletLqtPlanAddUI.b(this.tjp).isEnabled())
      AppMethodBeat.o(45558);
    while (true)
    {
      return;
      if (WalletLqtPlanAddUI.c(this.tjp) == 1)
      {
        WalletLqtPlanAddUI.a(this.tjp, 0);
        AppMethodBeat.o(45558);
      }
      else
      {
        WalletLqtPlanAddUI.a(this.tjp, 4);
        AppMethodBeat.o(45558);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.1
 * JD-Core Version:    0.6.2
 */