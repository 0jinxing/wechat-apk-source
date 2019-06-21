package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class HoneyPayGiveCardUI$3
  implements View.OnClickListener
{
  HoneyPayGiveCardUI$3(HoneyPayGiveCardUI paramHoneyPayGiveCardUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41861);
    HoneyPayGiveCardUI.c(this.nst).setVisibility(8);
    HoneyPayGiveCardUI.b(this.nst).setVisibility(0);
    HoneyPayGiveCardUI.b(this.nst).f(this.nst);
    AppMethodBeat.o(41861);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI.3
 * JD-Core Version:    0.6.2
 */