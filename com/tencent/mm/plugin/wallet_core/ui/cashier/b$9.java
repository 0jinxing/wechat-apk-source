package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$9
  implements View.OnClickListener
{
  b$9(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47774);
    ab.i("MicroMsg.WcPayCashierDialog", "click close icon");
    this.tMC.cancel();
    AppMethodBeat.o(47774);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b.9
 * JD-Core Version:    0.6.2
 */