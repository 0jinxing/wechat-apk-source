package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.ui.widget.MMEditText;

final class HoneyPayGiveCardUI$9
  implements o.a
{
  HoneyPayGiveCardUI$9(HoneyPayGiveCardUI paramHoneyPayGiveCardUI)
  {
  }

  public final void df(View paramView)
  {
    AppMethodBeat.i(41867);
    this.nst.aoB();
    HoneyPayGiveCardUI.k(this.nst).setVisibility(8);
    HoneyPayGiveCardUI.e(this.nst).setVisibility(0);
    HoneyPayGiveCardUI.e(this.nst).requestFocus();
    this.nst.showVKB();
    AppMethodBeat.o(41867);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI.9
 * JD-Core Version:    0.6.2
 */