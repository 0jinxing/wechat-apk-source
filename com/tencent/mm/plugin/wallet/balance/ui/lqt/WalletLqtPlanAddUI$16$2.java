package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletLqtPlanAddUI$16$2
  implements Runnable
{
  WalletLqtPlanAddUI$16$2(WalletLqtPlanAddUI.16 param16)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45575);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)WalletLqtPlanAddUI.b(this.tju.tjp).getLayoutParams();
    if (localLayoutParams != null)
    {
      localLayoutParams.bottomMargin = WalletLqtPlanAddUI.bQp();
      WalletLqtPlanAddUI.b(this.tju.tjp).setLayoutParams(localLayoutParams);
    }
    WalletLqtPlanAddUI.h(this.tju.tjp).scrollTo(0, 0);
    AppMethodBeat.o(45575);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.16.2
 * JD-Core Version:    0.6.2
 */