package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class HoneyPayGiveCardUI$4
  implements View.OnClickListener
{
  HoneyPayGiveCardUI$4(HoneyPayGiveCardUI paramHoneyPayGiveCardUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41862);
    ab.d(this.nst.TAG, "click give btn");
    if (HoneyPayGiveCardUI.a(this.nst))
    {
      this.nst.aoB();
      HoneyPayGiveCardUI.d(this.nst);
      AppMethodBeat.o(41862);
    }
    while (true)
    {
      return;
      ab.w(this.nst.TAG, "over limit when click");
      AppMethodBeat.o(41862);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI.4
 * JD-Core Version:    0.6.2
 */