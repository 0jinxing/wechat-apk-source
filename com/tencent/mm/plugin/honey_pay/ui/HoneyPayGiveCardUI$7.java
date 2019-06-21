package com.tencent.mm.plugin.honey_pay.ui;

import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.a;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class HoneyPayGiveCardUI$7
  implements a
{
  HoneyPayGiveCardUI$7(HoneyPayGiveCardUI paramHoneyPayGiveCardUI)
  {
  }

  public final void ic(boolean paramBoolean)
  {
    AppMethodBeat.i(41865);
    if (paramBoolean)
    {
      HoneyPayGiveCardUI.a(this.nst, HoneyPayGiveCardUI.g(this.nst), HoneyPayGiveCardUI.h(this.nst));
      AppMethodBeat.o(41865);
    }
    while (true)
    {
      return;
      HoneyPayGiveCardUI.g(this.nst).scrollTo(0, 0);
      HoneyPayGiveCardUI.b(this.nst).cex();
      if (bo.isNullOrNil(HoneyPayGiveCardUI.b(this.nst).getText()))
      {
        HoneyPayGiveCardUI.b(this.nst).setVisibility(8);
        HoneyPayGiveCardUI.c(this.nst).setVisibility(0);
        HoneyPayGiveCardUI.i(this.nst);
        HoneyPayGiveCardUI.j(this.nst);
      }
      AppMethodBeat.o(41865);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI.7
 * JD-Core Version:    0.6.2
 */